package dst;

import java.time.*;

public class DSTMain {

	public static void main(String[] args) {
		
		//Start of DST in March. Time skips by an hour. (2-2:59am is skipped, the UTC offset also changes.)
		LocalDate dateMar = LocalDate.of(2016, Month.MARCH, 13);
		LocalTime timeMar = LocalTime.of(1, 30);
		ZoneId zoneMar = ZoneId.of("US/Eastern");
		ZonedDateTime dateTimeMar = ZonedDateTime.of(dateMar, timeMar, zoneMar);
		System.out.println(dateTimeMar); 		// 2016–03–13T01:30–05:00[US/Eastern]
		dateTimeMar = dateTimeMar.plusHours(1);	//+ 1 hour
		System.out.println(dateTimeMar); 		// 2016–03–13T03:30–04:00[US/Eastern]
		
		//End of DST in November. Time goes back by an hour. (1-1:59am is repeated twice, the UTC offset also changes.)
		LocalDate dateNov = LocalDate.of(2016, Month.NOVEMBER, 6);
		LocalTime timeNov = LocalTime.of(1, 30);
		ZoneId zoneNov = ZoneId.of("US/Eastern");
		ZonedDateTime dateTimeNov = ZonedDateTime.of(dateNov, timeNov, zoneNov);
		System.out.println("\n" + dateTimeNov); // 2016–11–06T01:30–04:00[US/Eastern]
		dateTimeNov = dateTimeNov.plusHours(1);
		System.out.println(dateTimeNov); // 2016–11–06T01:30–05:00[US/Eastern]
		dateTimeNov = dateTimeNov.plusHours(1);
		System.out.println(dateTimeNov); // 2016–11–06T02:30–05:00[US/Eastern]

	}

}
