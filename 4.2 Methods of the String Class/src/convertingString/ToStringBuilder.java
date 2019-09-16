package convertingString;

public class ToStringBuilder {

	//Convert String to StringBuilder by creating new StringBuilder and appending the String object
	public static void main(String[] args) {
		String name = "Yasin";
		StringBuilder nameBuilder = new StringBuilder();
		nameBuilder.append(name);
		System.out.println(nameBuilder);
		System.out.println(nameBuilder.charAt(2));	//s	

	}

}
