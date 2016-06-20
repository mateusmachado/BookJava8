package comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
	public static void main(String[] args) {

		List<Usuario> usuarios = Arrays.asList(new Usuario("Steve", 100), new Usuario("Jown", 20),
				new Usuario("Nina", 300));

		System.out.println(compareUsuarios(usuarios));
		System.out.println(sortList());
		above100points(usuarios);
		System.out.println("First user, 100points+ " + userOptional(usuarios));
		printUserAboveOnePointUsingPeek(usuarios);

		System.out.println("AveragePoints: "+averagePoints(usuarios));

		System.out.println("sumPointsUsingReduce: " +sumPointsUsingReduce(usuarios));
	}

	private static double averagePoints(List<Usuario> usuarios) {
		double pontuacaoMedia = usuarios.stream().mapToInt(Usuario::getPoints).average().getAsDouble();
		return pontuacaoMedia;
	}

	private static int sumPointsUsingReduce(List<Usuario> usuarios) {
		int total = usuarios.stream().mapToInt(Usuario::getPoints).reduce(0, (a, b) -> a + b);
		return total;
	}

	private static void printUserAboveOnePointUsingPeek(List<Usuario> usuarios) {
		usuarios.stream().filter(u -> u.getPoints() > 1).peek(System.out::println).findAny();
	}

	private static Optional<Usuario> userOptional(List<Usuario> usuarios) {
		Optional<Usuario> usuarioOptional = usuarios.stream().filter(u -> u.getPoints() > 100).findAny();
		return usuarioOptional;
	}

	private static void above100points(List<Usuario> usuarios) {
		usuarios.stream().filter(u -> u.getPoints() > 100).forEach(System.out::println);
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
