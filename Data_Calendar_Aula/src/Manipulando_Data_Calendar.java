import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Manipulando_Data_Calendar {
	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2019-06-25T15:42:07Z"));
		System.out.println(sdf.format(d));

		Calendar cal = Calendar.getInstance();
		// instaciando o calendario
		cal.setTime(d);
		// passando a data d p o calendario
		cal.add(Calendar.HOUR_OF_DAY, 4);
		// add horas do dia
		d = cal.getTime();
		System.out.println(sdf.format(d));
		
		// como separar a data e pegar uma parte dela
		int minutes = cal.get(Calendar.MINUTE);
		int month = 1 + cal.get(Calendar.MONTH);
		//é necessario somar mais um por o mes no calendar começa no 0 
		//janeiro no caso é 0 fev 1 ...
		System.out.println("Minutes: " + minutes);
		System.out.println("Month: " + month);
	}
}
