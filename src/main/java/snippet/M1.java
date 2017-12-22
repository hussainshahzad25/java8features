package snippet;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class M1 {

	
	public static void main(String[] args) {

		new Thread(() -> System.out.println("Using lameda exp")).start();

		String[] arr = { "alam", "gaurav" };

		List<String> list = Arrays.asList(arr);

		list.forEach(System.out::println);

		list.forEach(o -> System.out.println(o));

		List<String> costBeforeTax = Arrays.asList("Shahzsad", "gaurav", "Ram");
		String collect = costBeforeTax.stream().map(x -> x.toUpperCase())
				.collect(Collectors.joining(", "));
		System.out.println(collect);

		List<Person> persons = Arrays.asList(new Person("Shahzad", "hussain"),
				new Person("ejaz", "hussain"));
		String peerson = persons.stream()
				.map(o -> o.getFirstName().toUpperCase())
				.collect(Collectors.joining(", "));
		System.out.println(peerson);

		List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);

		List<Integer> distinct = numbers.stream().map(i -> i * i).distinct()
				.collect(Collectors.toList());
		System.out.println(distinct);

		List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 88, 13, 17, 19,
				23, 29);
		IntSummaryStatistics stats = primes.stream().mapToInt((x) -> x)
				.summaryStatistics();
		System.out.println("Highest prime number in List : " + stats.getMax());
		System.out.println("Lowest prime number in List : " + stats.getMin());
		System.out.println("Sum of all prime numbers : " + stats.getSum());
		System.out.println("Average of all prime numbers : "
				+ stats.getAverage());

		System.out.println(primes.stream().mapToInt((x) -> x)
				.summaryStatistics().getMax());

		System.out.println("sdsid");
		System.out.println(primes.stream().mapToInt(o -> o).sum());
		System.out.println(primes.stream().mapToInt(o -> o).summaryStatistics()
				.getCount());

		List<Integer> number = Arrays.asList(9, 10, 3, 4, 7, 3, 4);

		List<Person> pers = Arrays.asList(new Person("shahzad", "dsjfghsd"),
				new Person("amlesh", "dhfg"));

		System.out.println(pers.stream()
				.filter(o -> o.getFirstName().equals("shahzad"))
				.collect(Collectors.toList()));

		System.out.println(pers.stream().map(o -> o.getFirstName()).distinct()
				.collect(Collectors.toList()));

		IntStream mapToInt = number.stream().mapToInt(o -> o);
		System.out.println(mapToInt.count());
		System.out.println(number.stream().mapToInt(o -> o).summaryStatistics().getMax());
		
		IntSummaryStatistics summaryStatistics = number.stream().mapToInt(o -> o).summaryStatistics();
		
		
//		DoubleSummaryStatistics dstats = list.stream()
//			     .collect(Collectors.summarizingDouble(Rectangle::getWidth));
//		
		
		

	}

}
