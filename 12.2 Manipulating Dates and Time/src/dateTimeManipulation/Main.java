package dateTimeManipulation;

import java.time.*;

public class Main {

	public static void main(String[] args) {
		//Adding days
		LocalDate dateAdd = LocalDate.of(2014, Month.JANUARY, 20);
		System.out.println(dateAdd); 	// 2014–01–20
		dateAdd = dateAdd.plusDays(2);
		System.out.println(dateAdd); 	// 2014–01–22
		dateAdd = dateAdd.plusWeeks(1);
		System.out.println(dateAdd); 	// 2014–01–29
		dateAdd = dateAdd.plusMonths(1);
		System.out.println(dateAdd); 	// 2014–02–28
		dateAdd = dateAdd.plusYears(5);
		System.out.println(dateAdd); 	// 2019–02–28
		
		//Subtracting days
		LocalDate dateSubtract = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(5, 15);
		LocalDateTime dateTime = LocalDateTime.of(dateSubtract, time);
		System.out.println(dateTime); 	// 2020–01–20T05:15
		dateTime = dateTime.minusDays(1);
		System.out.println(dateTime); 	// 2020–01–19T05:15
		dateTime = dateTime.minusHours(10);
		System.out.println(dateTime); 	// 2020–01–18T19:15
		dateTime = dateTime.minusSeconds(30);
		System.out.println(dateTime); 	// 2020–01–18T19:14:30
		dateTime = dateTime.minusYears(2);
		System.out.println(dateTime);	// 2018-01-18T19:14:30
		
		//Method chaining
		LocalDate dateChain = LocalDate.of(2020, Month.AUGUST, 5);
		LocalTime timeChain = LocalTime.of(5, 15);
		LocalDateTime dateTimeChain = LocalDateTime.of(dateChain,timeChain).minusDays(2).minusHours(3).minusSeconds(30);
		System.out.println(dateTimeChain);	// 2020-08-03T02:14:30
	}	
}
