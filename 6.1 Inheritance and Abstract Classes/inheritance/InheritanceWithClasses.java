package inheritance;

//BASE CLASS or PARENT CLASS or SUPER CLASS or INHERITED CLASS
class employee{	
	String name;
	String address;
	String phoneNumber;
	float experience;
	void displayExp(float a){
		experience = a;
		System.out.println("Experience is " + experience + " years." );
	}

}

//DERIVED CLASS or CHILD CLASS or SUBCLASS or EXTENDED CLASS
class programmer extends employee{		
	String programmingLanguages[];
	void writeCode(){};
	void accessBaseClassMembers(){
		name = "Yasin";
		address = "Yishun";	
		System.out.println("Name is: " + name + '\n' + "Address is: " + address);
		displayExp(5.5f);
	}
}

class InheritanceWithClasses {
	
	public static void main(String[] args) {
		programmer newObj = new programmer();
		newObj.accessBaseClassMembers();

	}

}
