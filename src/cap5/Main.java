package cap5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		List<String> names = Arrays.asList("petter", "anna", "mike", "xenia");
		System.out.println(names);

		Collections.sort(names, new Comparator<String>() {
			@Override
			public int compare(String p1, String p2) {
				return p1.compareTo(p2);
			}

		});
		
		StartsWith w = new StartsWith();
		Converter<String, String> converter = w::startsWith;
		String converted = converter.convert("Java");
		System.out.println(converted);
	}
}
