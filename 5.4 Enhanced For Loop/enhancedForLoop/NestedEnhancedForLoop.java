package enhancedForLoop;
import java.util.ArrayList;
/* A nested enhanced for loop works differently than regular nested loop. A nested loop 
 * executes all its iterations for each single iteration of its immediate outer loop
 */

/* An inner loop in a nested loop executes for each iteration of its outer loop. The
 * example defines three enhanced for loops: the outermost loop at 1, the
 * inner nested loop at 2, and the innermost loop at 3. The complete innermost
 * loop at 3 executes for each iteration of its immediate outer loop defined at 2.
 * Similarly, the complete inner loop defined at 2 executes for each iteration of its
 * immediate outer loop defined at 1. */

public class NestedEnhancedForLoop {

	public static void main(String[] args) {
		ArrayList<String> exams = new ArrayList<>();
		exams.add("Java");
		exams.add("Oracle");
		
		ArrayList<String> levels = new ArrayList<>();
		levels.add("Basic");
		levels.add("Advanced");
		
		ArrayList<String> grades = new ArrayList<>();
		grades.add("Pass");
		grades.add("Fail");
		
		for(String exam : exams)		//1: Outer loop
			for(String level : levels)		//2: Inner loop
				for(String grade : grades){		//3: Innermost loop
					System.out.println(exam + ":" + level + ":" + grade);
				}
		
	}

}
