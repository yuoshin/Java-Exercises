package period;

import java.time.*;

public class PeriodMain {

	public static void main(String[] argh) {
		/*
		 * Period can work with objects that have a LocalDate or LocalDateTime.
		 * They can’t work with objects that only have time(LocalTime).
		 */
		LocalDate date = LocalDate.of(2015, 1, 20);
		LocalTime time = LocalTime.of(6, 15);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		Period period = Period.ofMonths(1);
		System.out.println(date.plus(period)); 		// 2015–02–20
		System.out.println(dateTime.plus(period)); 	// 2015–02–20T06:15
		//System.out.println(time.plus(period)); 	// UnsupportedTemporalTypeException
		
	}

}
