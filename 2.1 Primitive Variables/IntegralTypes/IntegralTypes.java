package IntegralTypes;

class IntegralTypes {
	public static void main (String args[]) {
		int baseDecimal = 267;
		int octVal = 0413;	//267 in decimal is equal to 413 in octal
		int hexVal = 0x10B;	// 267 in decimal is equal to 10B in hexadecimal 
		int binVal = 0b100001011;	//267 in decimal is equal to 100001011 in binary
		
		System.out.println (baseDecimal + octVal);
		System.out.println (hexVal + binVal);
		}
	}