package importstatic;
import static importstatic2.statictest.marks;/*this import statement will enable the static variable
marks to be used*/
import static importstatic2.statictest.*;/*this import statement will enable all the public static members
of class importstatic to be used*/ 

public class statictest {
	statictest(){
		marks = 20;
		getMark();
	}
	
	
}
