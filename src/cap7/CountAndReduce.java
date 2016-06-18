package cap7;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CountAndReduce {
	public static void main(String[] args) {

		List<Integer> intList = Arrays.asList(1, 2, 3, 4);
		System.out.println(countList(intList));
		
		Optional<Integer> reduced = reduceList(intList);
		reduced.ifPresent(System.out::println);

	}

	private static Optional<Integer> reduceList(List<Integer> intList) {
		Optional<Integer> reduced = intList.stream().sorted().reduce((s1, s2) -> s1 + s2);
		return reduced;
	}

	private static long countList(List<Integer> intList) {
		return intList.stream().count();
	}
}
