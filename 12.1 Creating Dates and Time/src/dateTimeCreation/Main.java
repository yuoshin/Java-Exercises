package dateTimeCreation;

import java.time.*;

public class Main {

	public static void main(String[] args) {
		
		//The static method now() gives the current date and time
		System.out.println(LocalDate.now());		//2019-07-22
		System.out.println(LocalTime.now());		//16:02:54.427
		System.out.println(LocalDateTime.now());	//2019-07-22T16:02:54.427
		System.out.println(ZonedDateTime.now());	//2019-07-22T16:02:54.427+08:00[GMT+08:00]
		
		//Using the of() method for LocalDate
		LocalDate date1 = LocalDate.of(1999, 2, 27);
		LocalDate date2 = LocalDate.of(1999, Month.FEBRUARY, 27);	//This of method uses constant enum for month
		System.out.println(date1 + ", " + date2);		//1999-02-27, 1999-02-27
		
		//Using the of() method for LocalTime	
		LocalTime time1 = LocalTime.of(4, 39);			//04:39
		LocalTime time2 = LocalTime.of(4, 39,20);		//04:39:20
		LocalTime time3 = LocalTime.of(4, 39, 29, 300);	//04:39:29.000000300
		System.out.println(time1 + ", " + time2 + ", " + time3);	//04:39, 04:39:20, 04:39:29.000000300
		
		//Using the of() methods for LocalDateTime
		LocalDateTime dateTime1 = LocalDateTime.of(2015, 4, 01, 9, 59, 01, 2509);
		LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);	//Combines date1 and time1 from earlier example
		System.out.println(dateTime1 + ", " + dateTime2);	//2015-04-01T09:59:01.000002509, 1999-02-27T04:39
		
		//Using the of() method for ZonedDateTime. Need to get desired time zone first.
		//ZoneId zone = ZoneId.of("Singapore");		//get desired time zone
		ZoneId zone = ZoneId.systemDefault();		//gets you system time zone
		ZonedDateTime zoned1 = ZonedDateTime.of(2015, 1, 20, 6, 15, 30, 200, zone); //2015-01-20T06:15:30.000000200+08:00[Singapore]
		ZonedDateTime zoned2 = ZonedDateTime.of(date1, time1, zone);	//1999-02-27T04:39+08:00[Singapore]
		ZonedDateTime zoned3 = ZonedDateTime.of(dateTime1, zone);	//1999-02-27T04:39+08:00[Singapore]
		System.out.println(zoned1 + ", " + zoned2 + ", " + zoned3);	//1999-02-27T04:39+08:00[Singapore]

	}

}
