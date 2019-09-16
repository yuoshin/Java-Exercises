package userDefinedConstrutors;

public class OfficeMain {

	public static void main(String[] args) {
		Employee emp = new Employee(30, "Yasin");
		
		System.out.println(emp.age);
		System.out.println(emp.name);
		
	}

}