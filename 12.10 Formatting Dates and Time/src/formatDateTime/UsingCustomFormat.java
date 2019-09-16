package formatDateTime;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class UsingCustomFormat {

	public static void main(String[] args) {
		DateTimeFormatter customFormat = DateTimeFormatter.ofPattern("MMMM dd yyyy, hh:mm");
		LocalDate date = LocalDate.of(2019, 5, 19);
		LocalTime time = LocalTime.of(22, 00);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		
		System.out.println(dateTime.format(customFormat));		//May 19 2019, 10:00

	}

}