package dateApi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class MainDateTime {
	public static void main(String[] args) {

		System.out.println(dateTime());
		System.out.println(dateTimeZone());
	}

	private static ZonedDateTime dateTimeZone() {
		ZonedDateTime dateTimeZone = dateTime().atZone(ZoneId.of("America/Sao_Paulo"));
		return dateTimeZone;
	}

	private static LocalDateTime dateTime() {
		LocalTime now = LocalTime.now();
		LocalDate today = LocalDate.now();
		LocalDateTime dateTime = today.atTime(now);
		return dateTime;
	}
}
