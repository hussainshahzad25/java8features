package java8Feature;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class A {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

	public static void main(String[] args) {

		String[] arr = { "12-12-2017", "14-12-2017", "17-12-2017",
				"21-12-2017", "20-12-2017" };
		int[] intArr = { 1, 4, 5, 6, 3, 334, 54, 34, 34, 343, 3432, 3242 };

		// maxDateFromList(arr);
		maxInt(intArr);

	}

	private static void maxDateFromList(String[] arr) throws ParseException {

		List<Date> dates = new ArrayList<Date>();
		for (int i = 0; i < arr.length; i++) {
			dates.add(sdf.parse(arr[i]));
		}
		Date date = dates.stream().max(Date::compareTo).get();
		System.out.println("Max Date :: " + sdf.format(date));

	}

	private static void maxInt(int[] intArr) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < intArr.length; i++) {
			list.add(intArr[i]);
		}
		System.out.println("Max Number :: "
				+ list.stream().max(Integer::compareTo).get());
	}

}
