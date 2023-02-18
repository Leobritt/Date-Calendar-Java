import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Data_aula03 {
	public static void main(String[] args) {
		LocalDate d01 = LocalDate.parse("2017-08-21");
		LocalDateTime d02 = LocalDateTime.parse("2023-01-22T20:13:25");
		Instant d003 = Instant.parse("2023-01-22T01:13:25Z");

		ZoneId.getAvailableZoneIds();

		for (String st : ZoneId.getAvailableZoneIds()) {
			System.out.println(st);
		}

		// Convertendo um Instant para um data local passando o parametro o time zone do
		// pc
		LocalDate r1 = LocalDate.ofInstant(d003, ZoneId.systemDefault());
		System.out.println("\nr1 = " + r1);
		// Usando o horário de PT
		LocalDate r2 = LocalDate.ofInstant(d003, ZoneId.of("Portugal"));
		System.out.println("\nr2 = " + r2);
	}
}
