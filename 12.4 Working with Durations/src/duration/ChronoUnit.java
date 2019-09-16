package duration;

import java.time.*;
import java.time.temporal.TemporalUnit;

public class ChronoUnit {

	public static void main(String[] args) {
		LocalTime one = LocalTime.of(5, 15);
		LocalTime two = LocalTime.of(6, 30);
		LocalDate date = LocalDate.of(2016, 1, 20);
		//Unsure why error on below. Saying that HOURS and MINUTES cannot be resolved
		/*System.out.println(ChronoUnit.HOURS.between(one, two)); // 1
		System.out.println(ChronoUnit.MINUTES.between(one, two)); // 75
		System.out.println(ChronoUnit.MINUTES.between(one, date)); // DateTimeException
*/	
	
	}

}
