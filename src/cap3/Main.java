package cap3;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		List<Artist> allArtist = Arrays.asList(new Artist("Paul", "gillfoew", "Londom"),
				new Artist("Jown", "Snow", "USA"));

		 System.out.println(countArtistsCity(allArtist));
		 
	}

	private static long countArtistsCity(List<Artist> allArtist) {
		return allArtist.stream().filter(artist -> artist.getLocation().equalsIgnoreCase("Londom")).count();
	}

}
