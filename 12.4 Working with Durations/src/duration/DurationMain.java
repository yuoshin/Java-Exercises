package duration;

import java.time.*;

public class DurationMain {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2015, 1, 20);
		LocalTime time = LocalTime.of(6, 15);			//6:15
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		Duration duration = Duration.ofHours(6);
		System.out.println(dateTime.plus(duration)); 	// 2015–01–20T12:15
		System.out.println(time.plus(duration)); 		// 12:15 (6:15 + 6 hours)
		//System.out.println(date.plus(duration)); 		// UnsupportedTemporalException (Does not work with date only)
	}
}
