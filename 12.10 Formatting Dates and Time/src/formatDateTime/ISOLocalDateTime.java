package formatDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ISOLocalDateTime {
	
	/*
	 * ISO is a standard for dates and is a reasonable way for computers to communicate
	 */

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2019, 9, 1);				//2019-09-01
		LocalTime time = LocalTime.of(12, 44, 34);					//12:44
		LocalDateTime dateTime = LocalDateTime.of(date, time);	//2019-09-01T12:44
		
		System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));	//2019-09-01
		System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));	//12:44:34
		System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));	//2019-09-01T12:44:34		

	}

}
