package anonymousInnerClass;

public class AnonymousInnerMain {
	
	abstract class SaleToday{
		abstract int discount();
	}
	
	public int admissionFee(int basePrice) {
		
		SaleToday sale = new SaleToday() {	//no name inner abstract class implementation
			int discount() {
				return 3;
			}
		};		//Semicolon here as this declaration is like a local variable
		return basePrice - sale.discount();
	}

	public static void main(String[] args) {
		AnonymousInnerMain newObj = new AnonymousInnerMain();
		System.out.println(newObj.admissionFee(10));

	}

}
