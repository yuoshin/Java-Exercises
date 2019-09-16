package convertingToLongEpoch;
import java.time.*;

import com.sun.javafx.font.LogicalFont;

public class Epoch {

	public static void main(String[] args) {
		LocalDate todayDate = LocalDate.now();
		LocalDate yesterdayDate = todayDate.minusDays(1);
		LocalDateTime todayDateTime = LocalDateTime.now();
		ZonedDateTime todayZonedDateTime = ZonedDateTime.now();
		//LocalDate
		System.out.println("Today's date: " + todayDate);
		System.out.println("Today in Epoch days: " + todayDate.toEpochDay());
		System.out.println("Yesterday in Epoch days: " + yesterdayDate.toEpochDay());
		//LocalDateTime
		System.out.println("Today in Epoch seconds: " + todayDateTime.toEpochSecond(ZoneOffset.UTC));

	}

}