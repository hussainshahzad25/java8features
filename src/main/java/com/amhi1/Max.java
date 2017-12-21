package com.amhi1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Max {

	public static void main(String[] args) {

		List<Student> persons = new ArrayList<Student>();
		persons.add(new Student("Shahzad", 25));
		persons.add(new Student("Edf", 24));
		persons.add(new Student("Edf", 14));
		persons.add(new Student("Edf", 44));

		// Filter and Count
		long count = persons.stream().filter(p -> p.getAge() > 18).count();
		System.out.println(count);

		// Collect and Listing
		List<Student> collect = persons.stream().collect(Collectors.toList());
		System.out.println("All : : " + collect);

		Iterator<?> it = collect.iterator();
		while (it.hasNext()) {
			Object object = (Object) it.next();
			System.out.println(object);
		}

		// Filter and Collect and listing
		List<Student> collect2 = persons.stream().filter(o -> o.getAge() > 14)
				.collect(Collectors.toList());

		System.out.println(collect2);

		/**
		 * Converting into MAP using lamda exp
		 */

		Map<Integer, String> HOSTING = new HashMap<>();
		HOSTING.put(1, "linode.com");
		HOSTING.put(2, "heroku.com");
		HOSTING.put(3, "digitalocean.com");
		HOSTING.put(4, "aws.amazon.com");

		// Map -> Stream -> Filter -> Map
		Map<Integer, String> collector = HOSTING.entrySet().stream()
				.filter(map -> map.getKey() == 2)
				.collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));

		System.out.println(collector);

		// =====================================

		List<Integer> numbers = Arrays.asList(12, 74, 5, 8, 16);
		numbers.stream().filter(n -> n > 10).forEach(System.out::println);
		numbers.forEach(System.out::println);

		// //////////////////////////////////////

		ArrayList<Student> collect3 = persons.stream()
				.filter(p -> p.getAge() > 18)
				.collect(Collectors.toCollection(ArrayList::new));
		System.out.println(collect3);

		Integer[] aaa = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		
		
		List<Integer> asList = Arrays.asList(aaa);

		System.out.println(asList.stream().max(Integer::compareTo).get());
		System.out.println(asList.stream().mapToInt(o -> o).sum());

		List<Integer> number = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
		List<Integer> distinct = number.stream().map(i -> i * i).distinct()
				.collect(Collectors.toList());
		System.out.printf(
				"Original List : %s, Square Without duplicates : %s %n",
				number, distinct);

		List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 12, 18);
		Integer lcm = listOfNumbers.stream().filter(i -> i % 2 == 0)
				.filter(i -> i % 3 == 0).findFirst().get();
		System.out.println(lcm);
		
		for (Integer integer : listOfNumbers) {
			System.out.println(integer);
		}
		System.out.println("_____________");
		asList.forEach(System.out::println);
		System.out.println("===========");
		asList.forEach(o->System.out.println(o));
		
		
		
		String [] names = {"Shahzad","Ram","Shyam","Golu"};
		
		List<String> asList2 = Arrays.asList(names);
		
		Stream<String> filter = asList2.stream().filter(o->o.startsWith("S"));
		System.out.println("Count :: " +filter.count()  );
		
		
	
		

	}
}
