package period;

import java.time.*;

public class PeriodFormat {

	public static void main(String[] args) {
		Period period = Period.ofMonths(2);
		System.out.println(period);				//P2M
		Period period2 = Period.of(1, 0, 3);
		System.out.println(period2);			//P1Y3D, because month is empty
		Period period3 = Period.ofWeeks(3);
		System.out.println(period3);			//P21D

	}

}
