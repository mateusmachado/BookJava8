package cap3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {
	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(1,2);
		List<Integer> list2 = Arrays.asList(3,4);
		
		
		System.out.println(joinLists(list1, list2));
	}

	public static List<Integer> joinLists(List<Integer> list1, List<Integer> list2) {
		List<Integer> together = Stream.of(list1, list2)
				.flatMap(numbers -> numbers.stream())
				.collect(Collectors.toList());
		return together;
	}
}
