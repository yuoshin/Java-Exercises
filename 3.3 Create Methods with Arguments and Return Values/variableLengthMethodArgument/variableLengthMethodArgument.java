package variableLengthMethodArgument;

class Employee {
	private String name;
	public void setName(String val) {
		name = val;
}
/* The ellipsis (...) that follows the data type indicates that the method parameter days 
 * may be passed an array or multiple comma-separated values	
 */	
public int daysOffWork(int... days) {
/* The ellipsis (...) that follows the data type indicates that the method parameter days 
 * may be passed an array or multiple comma-separated values.
 * If your method defines multiple method parameters, the variable that accepts 
 * variable arguments must be the last one in the parameter list.*/
	int daysOff = 0;
	for (int i = 0; i < days.length; i++)
		daysOff += days[i];
		return daysOff;
}
public static void main(String args[]) {

	Employee e = new Employee();
	System.out.println(e.daysOffWork(1, 2, 3, 4));
	System.out.println(e.daysOffWork(1, 2, 3));
	}
}