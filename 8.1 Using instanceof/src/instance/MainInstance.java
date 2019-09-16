package instance;

public class MainInstance{
	public static void main(String[]args) {
		HeavyAnimal hippo = new Hippo();
		boolean b1 = hippo instanceof Hippo;		//true
		boolean b2 = hippo instanceof HeavyAnimal;	//true
		boolean b3 = hippo instanceof Elephant;		//false
		System.out.println(b1 + ", " + b2 + ", " + b3);
	}

}

class HeavyAnimal { 
	
}
class Hippo extends HeavyAnimal { 
	
}
class Elephant extends HeavyAnimal { 
	
}