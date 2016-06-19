package comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {

		List<Usuario> usuarios = Arrays.asList(new Usuario("Steve", 100), new Usuario("Jown", 20), new Usuario("Nina", 300));

		System.out.println(compareUsuarios(usuarios));
		System.out.println(sortList());

		above100points(usuarios);
	}

	private static void above100points(List<Usuario> usuarios) {
		usuarios
		.stream()
		.filter(u -> u.getPoints() > 100)
		.forEach(System.out::println);
	}

	private static Comparator<Usuario> compareUsuarios(List<Usuario> usuarios) {
		Comparator<Usuario> comparator = Comparator.comparing(u -> u.getName());
		usuarios.sort(comparator);
		return comparator;
	}

	private static List<String> sortList() {
		List<String> palavras = Arrays.asList("Casa do Código", "Alura", "Caelum");
		palavras.sort(Comparator.reverseOrder());
		return palavras;
	}
}
