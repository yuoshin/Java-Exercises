package Main;

public class IntAssumption {
	
	
	short a = 1;	//compiler will assume this to be int and convert type
	short b = 2;	//compiler will assume this to be int and convert type
	//short c = a + b;	//will cause error as a and b is int as per the assumption by the compiler
	int c = a + b;		//this wont cause any errors as compiler assumes a and b to be int type
	
}