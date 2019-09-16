package equals;

public class EqualsMain {
	String acctNumber;
	int acctType;

	/*
	 * Overriding equals method. Two bank objects are considered equal if they have
	 * the same values, for instance variables acctNumber and acctType
	 */
	public boolean equals(Object anObject) {	//Take note of the Object type in param
		if (anObject instanceof EqualsMain) {
			EqualsMain b = (EqualsMain) anObject;
			return (acctNumber.equals(b.acctNumber) && acctType == b.acctType);
		} else
			return false;
	}

	public static void main(String[] args) {
		EqualsMain b1 = new EqualsMain();
		b1.acctNumber = "0023490";
		b1.acctType = 4;
		EqualsMain b2 = new EqualsMain();
		b2.acctNumber = "11223344";
		b2.acctType = 3;
		EqualsMain b3 = new EqualsMain();
		b3.acctNumber = "11223344";
		b3.acctType = 3;

		System.out.println(b1.equals(b2)); // prints false
		System.out.println(b2.equals(b3)); // prints true because the VALUES of the reference variables b2 and b3 match each other
		System.out.println(b1.equals(new String("abc"))); // prints false as method parameter passed to it is not of type BankAccount but String

	}

}
