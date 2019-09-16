package formatDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class UsingPreDefinedFormats {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2019, 9, 1);				//2019-09-01
		LocalTime time = LocalTime.of(12, 44, 34);				//12:44
		LocalDateTime dateTime = LocalDateTime.of(date, time);	//2019-09-01T12:44:34
		
		/* Short format */
		DateTimeFormatter shortDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		System.out.println(shortDate.format(date));				//1/9/19
		System.out.println(shortDateTime.format(dateTime));		//1/9/19 12:44:34 PM
		
		/* Medium format */
		DateTimeFormatter mediumDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter mediumDateTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		System.out.println(mediumDate.format(date));		//1 Sep, 2019
		System.out.println(mediumDateTime.format(dateTime));	//1 Sep, 2019 12:44:34 PM
		
		/* Long format */
		DateTimeFormatter longDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		System.out.println(longDate.format(date));		//1 September, 2019
		
		/* Full format */
		DateTimeFormatter fullDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		System.out.println(fullDate.format(date));		//Sunday, 1 September, 2019 (full date)
			
	}

}
