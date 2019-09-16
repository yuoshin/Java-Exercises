package instants;

import java.time.*;

public class InstantMain {
	
	/*
	 * The Instant class represents a specific moment in time in the GMT time zone and therefore will need a timezone to work
	 */

	public static void main(String[] args) {
		Instant now = Instant.now();
		System.out.println(now); // 2019-07-24T05:03:08.923Z
		Instant later = Instant.now();
		System.out.println(later); // 2019-07-24T05:03:08.993Z
		Duration difference = Duration.between(now, later);
		System.out.println(difference.toMillis()); // 70

	}

}
