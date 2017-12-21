package java8Feature;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AP {

	public static void main(String[] args) {

		Stream<Integer> intStream = Stream.of(90,43,2, 3, 4,3,2,0,5);
		Set<Integer> collect = intStream.collect(Collectors.toSet());
		System.out.println(collect);
	}
}
