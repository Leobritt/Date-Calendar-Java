import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Data_Operacao {
	public static void main(String[] args) {
		LocalDate d01 = LocalDate.parse("2022-07-20");
		LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d03 = Instant.parse("2022-07-20T01:30:26Z");

		LocalDate pastWeekLocalDate = d01.minusWeeks(1);
		System.out.println("d01 = " + d01);
		System.out.println("\nPast week d01 = " + pastWeekLocalDate);

		LocalDate nextWeekLocalDate = d01.plusDays(7);
		System.out.println("\nNext week d01 = " + nextWeekLocalDate);

		LocalDateTime nextWeekLocalDateTime = d02.plusDays(7);
		LocalDateTime pastWeekLocalDateTime = d02.minusDays(7);

		System.out.println("\nd02 = " + d02);

		System.out.println("\nPast week d02 = " + pastWeekLocalDateTime);

		System.out.println("\nNext week d02 = " + nextWeekLocalDateTime);

		System.out.println("\nd03 = " + d03);

		Instant nextWeekInstant = d03.minus(7, ChronoUnit.DAYS);
		// para somar ou subtratir Instant é necessário usar a biblioteca ChronoUnit
		Instant pastWeekInstant = d03.plus(7, ChronoUnit.DAYS);

		System.out.println("\nPast week d03 = " + pastWeekInstant);
		System.out.println("\nNext week d03 = " + nextWeekInstant);

		// DURAÇÃO ENTRE DATAS
		Duration d1 = Duration.between(nextWeekInstant, pastWeekInstant);
		System.out.println("\nDuration Between nextWeekInstant, pastWeekInstant = " + d1);

		Duration d2 = Duration.between(pastWeekLocalDateTime, d02);
		System.out.println("\nDuration Between pastWeekLocalDateTime, d02 in days " + d2.toDays());

		// para calcular a duraçao de LocalDate é necessário transformar em usando
		// atTime ou usando o atStartOfDay
		Duration d3 = Duration.between(pastWeekLocalDate.atTime(0, 0), d01.atStartOfDay());
		System.out.println("\nDays duration between Date times " + d3.toDays());
	}
}
