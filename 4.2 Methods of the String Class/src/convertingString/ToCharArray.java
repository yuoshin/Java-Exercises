package convertingString;

public class ToCharArray {

	//Convert String to array (toCharArray)
	public static void main(String[] args) {
		String name = "Yasin";
		char[] convertString = name.toCharArray();
		for(int x=0;x<convertString.length;x++) {
			System.out.print(convertString[x]);
		}
		System.out.println(convertString[2]);
	}

}
