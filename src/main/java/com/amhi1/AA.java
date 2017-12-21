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

public class AA {

	public static void main(String[] args) {

		List<Student> persons = new ArrayList<Student>();
		persons.add(new Student("Shahzad", 25));
		persons.add(new Student("Edf", 24));
		persons.add(new Student("Edf", 14));
		persons.add(new Student("Edf", 44));

		
//		Filter and Count
		long count = persons.stream().filter(p -> p.getAge() > 18).count();
		System.out.println(count);

//		Collect and Listing
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

	}
}
