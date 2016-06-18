package cap7;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import cap5.Converter;

public class ExampleConverterAndLists {

	public static void main(String[] args) {
		final int num = 1;
		Converter<Integer, String> stringConverter = (from) -> String.valueOf(from + num);
		System.out.println(stringConverter.convert(2));

		List<String> numbersList = Arrays.asList("one", "two", "three", "four");
		filterAndSortList(numbersList);

		System.out.println(listStartsWithT(numbersList));
	}

	private static boolean listStartsWithT(List<String> numbersList) {
		boolean anyStartsWithT = numbersList.stream().anyMatch((s) -> s.startsWith("t"));
		return anyStartsWithT;
	}

	private static void filterAndSortList(List<String> numbersList) {
		numbersList.stream().filter(s -> s.startsWith("t")).map(String::toUpperCase).sorted(Collections.reverseOrder())
				.forEach(System.out::println);
	}
}
