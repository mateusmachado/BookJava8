package comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		List<Usuario> usuarios = Arrays.asList(new Usuario("Steve"), new Usuario("Jown"), new Usuario("Nina"));

		System.out.println(compareUsuarios(usuarios));
		System.out.println(sortList());

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
