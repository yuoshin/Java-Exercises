package convertingStringBuilder;

public class ConvertToString {

	//Convert StringBuilder to String using the toString() method
	public static void main(String[] args) {
		StringBuilder name = new StringBuilder("Yasin");
		String nameInString = name.toString();
		System.out.println(name);			//Yasin
		System.out.println(nameInString);	//Yasin
		Integer number = 365456;
		String conv = number.toString();
		System.out.println(conv);

	}

}
