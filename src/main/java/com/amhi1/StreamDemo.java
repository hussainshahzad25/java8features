package com.amhi1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String args[]) { // Initialization of Collection

		List<Order> orderBook = new ArrayList<>();
		Order buyGoogle =  new Order("GOOG.NS", 300, 900.30, Order.Side.BUY);
		Order sellGoogle = new Order("GOOG.NS", 600, 890.30, Order.Side.SELL);
		Order buyApple =   new Order("APPL.NS", 400, 300,    Order.Side.BUY);
		Order sellApple =  new Order("APPL.NS", 200, 550,    Order.Side.SELL);
		Order buyGS =      new Order("GS.NSSS", 300, 300,    Order.Side.BUY);
		orderBook.add(buyGoogle);
		orderBook.add(sellGoogle);
		orderBook.add(buyApple);
		orderBook.add(sellApple);
		orderBook.add(buyGS);
		Stream<Order> stream = orderBook.stream();
		Stream buyOrders = stream.filter((Order o) -> o.side().equals(
				Order.Side.BUY));		
		System.out.println("No of Buy Order Placed :" + buyOrders.count());
		
		
		Stream<Order> sellOrders = orderBook.stream().filter(
				(Order o) -> o.side() == Order.Side.SELL);
		System.out.println("No of Sell Order Placed : " + sellOrders.count());
		
		
		double value = orderBook.stream().mapToDouble((Order o) -> o.price())
				.sum();		
		System.out.println("Total value of all orders : " + value);
		
		
		long quantity = orderBook.stream().mapToLong((Order o) -> o.quantity())
				.sum();
		System.out.println("Total quantity of all orders : " + quantity);
		
		String [] names = {"dsfdf","sdgzxc","ppavasda","wwewe"};
		List<String> asList = Arrays.asList(names);
		
		asList.stream().sorted().forEachOrdered(System.out::println);
		
		List<String> collect = asList.stream().sorted().collect(Collectors.toList());
		System.out.println(collect);
		
		
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Price To Filter");
		int nextInt = sc.nextInt();		
		Stream<Order> filter = orderBook.stream().filter((Order o)->(o.price()==nextInt));		
		System.out.println(filter.count());
		
		double sum = orderBook.stream().mapToDouble((Order o)->o.price()).sum();
		System.out.println(sum);
		
		
		
		

	}

}