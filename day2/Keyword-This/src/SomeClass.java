
public class SomeClass {
	
	long serialNumber; 
	
	public static void main(String[] args) {
		SomeClass sc = new SomeClass();
		
	}
	
	// constructors 
	
	public SomeClass() {
		this(10l); // set default value
		System.out.println("Inside default no-arguument constructor");
	}
	

	public SomeClass(long serialNumber) {
		this.serialNumber = serialNumber; // set default value
		System.out.println("Inside constructor with argument");
	}
	
	

}
