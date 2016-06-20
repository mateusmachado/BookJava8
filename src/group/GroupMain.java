package group;

import java.util.Arrays;
import java.util.List;

import comparator.Usuario;

public class GroupMain {
	public static void main(String[] args) {

		GroupUser englishSpeakers = new GroupUser();
		englishSpeakers.add(new Usuario("Jerry", 1));
		englishSpeakers.add(new Usuario("Jown", 2));

		GroupUser spanishSpeakers = new GroupUser();
		spanishSpeakers.add(new Usuario("Stark", 3));
		spanishSpeakers.add(new Usuario("Bob", 4));

		List<GroupUser> groups = Arrays.asList(englishSpeakers, spanishSpeakers);

		groups.stream()
				.flatMap(g -> g.getUsuarios()
				.stream())
				.distinct()
				.forEach(System.out::println);
	}
}
