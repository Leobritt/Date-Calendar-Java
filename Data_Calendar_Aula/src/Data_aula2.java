import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Data_aula2 {
	public static void main(String[] args) {
		LocalDate d01 = LocalDate.parse("2017-08-21");
		LocalDateTime d02 = LocalDateTime.parse("2023-01-22T20:13:25");
		Instant d003 = Instant.parse("2023-01-22T01:13:25Z");

		System.out.println("TRANSFORMANDO O TEXTO ISO EM STRING");

		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		// para formatar Instant precisa pesecificar o timezone
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

		System.out.println("\nd01 = " + d01.format(fmt1));
		// tambem pode fazer na ordem inversa da chamada
		System.out.println("\nd01 = " + fmt1.format(d01));
		// chamando usando o of pattern de parametro ou seja instacia na hora de rodar
		System.out.println("\nd01 = " + d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

		System.out.println("\nd02 = " + d02.format(fmt2));
		// para printar um instant PRECISA chamar o obj dateTimeFormatter
		System.out.println("\ndo03 = " + fmt3.format(d003));
	}
}
