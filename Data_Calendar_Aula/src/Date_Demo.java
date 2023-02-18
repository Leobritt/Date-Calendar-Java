import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date_Demo {
	public static void main(String[] args) {
	// formatar a data
			DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
			
			
			// data de hoje
			LocalDate d01 = LocalDate.now();
			// instanciando a bibilioteca
			System.out.println("DATA DE HOJE");
			System.out.println(d01);

			System.out.println();

			// data e hora locais
			LocalDateTime d02 = LocalDateTime.now();
			// instanciando a bibilioteca
			System.out.println("DATA E HORÁIRO DE HOJE");
			System.out.println(d02);

			System.out.println();

			Instant d03 = Instant.now();
			// instanciando a bibilioteca
			System.out.println("INSTANT HORÁRIO DE LONDRES");
			System.out.println(d03);

			// pegar um texto iso 8601 e converter para data hora

			System.out.println();

			// iniciar uma data no horario local
			LocalDate d04 = LocalDate.parse("2023-01-20");
			System.out.println("texto iso 8601 e converter para lolcal date");
			System.out.println(d04);

			System.out.println();

			// iniciar uma data e hora no horario local
			LocalDateTime d05 = LocalDateTime.parse("2023-01-20T17:21:02");
			System.out.println("texto iso 8601 e converter para data hora");
			System.out.println(d05);

			System.out.println();
			System.out.println("texto iso 8601 e converter para data hora de londres");
			// iniciar uma data e hora no horario local de londres
			Instant d06 = Instant.parse("2023-01-20T17:21:02Z");
			System.out.println(d06);

			System.out.println();

			// iniciar uma data e hora no horario local do Br
			Instant d07 = Instant.parse("2023-01-20T17:21:02-03:00");
			System.out.println("texto iso 8601 e converter para data hora do BR");
			System.out.println(d07);

			System.out.println();
			System.out.println("Usando o date fomratter como parametro para mudar o que padrão para o padrão BR");
			LocalDate d08 = LocalDate.parse("22/01/2022", fmt1);
			// irá printar no padrão iso, mas pode receber
			System.out.println(d08);

			System.out.println();
			System.out.println(
					"Usando o date fomratter como parametro para mudar o que padrão para o padrão BR mais horas e minutos");
			LocalDateTime d09 = LocalDateTime.parse("27/01/2022 01:32", fmt2);
			// irá printar no padrão iso, mas pode receber
			System.out.println(d09);
			
			LocalDateTime d10 = LocalDateTime.parse("27/01/2022 01:32", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
			//tambem pode instanciar assim
			
			System.out.println();
			LocalDate d11 = LocalDate.of(2022, 1, 23);
			//usando outra formataçao 
			System.out.println(d11);
			
			LocalDateTime d12 = LocalDateTime.of(2022, 12, 24, 21, 30);
			System.out.println();
			System.out.println(d12);
		}
}
