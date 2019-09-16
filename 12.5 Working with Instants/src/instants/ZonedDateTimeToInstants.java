package instants;

import java.time.*;

public class ZonedDateTimeToInstants {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2015, 5, 25);
		LocalTime time = LocalTime.of(11, 55, 00);
		ZoneId zone = ZoneId.of("Singapore");
		ZonedDateTime zonedDateTime = ZonedDateTime.of(date, time, zone);
		Instant instant = zonedDateTime.toInstant(); 	// convert ZonedDateTime to instant
		System.out.println(zonedDateTime); 	// 2015-05-25T11:55+08:00[Singapore]
		System.out.println(instant); 		// 2015-05-25T03:55:00Z
		
		/*
		 * The last two lines represent the same moment in time. The ZonedDateTime includes a time zone. 
		 * The Instant gets rid of the time zone and turns it into an Instant of time in GMT.
		 */
		

	}

}
