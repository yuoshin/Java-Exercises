package switchCase;

public class BreakStatementFallThrough {
	public static void main(String args[]){
		String day = "";
		
		switch (day) {
		case "MON":
		case "TUE":
		case "WED":
		case "THU": System.out.println("Time to work");
		break;
		case "FRI": System.out.println("Nearing weekend");
		break;
		case "SAT":
		case "SUN": System.out.println("Weekend!");
		break;
		default: System.out.println("Invalid day?");
		}		
			
	}

}
