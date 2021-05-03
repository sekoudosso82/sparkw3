package Example;

public class VariablesExample {

	public static void main(String[] args) {
		boolean myBoolean = false; 
		byte myByte = 2;
		short myShort = 3 ; 
		char myChar = 'b'; 
		int myInt = 5; 
		float myFloat = 0.25f; 
		long myLong = 999999999L; 
		double myDouble = 5.999d; 
		String myString = new String("This is a string object");
		
		System.out.println(" 2  + 3 = " + (myByte + myShort));
		
		myBoolean = myInt < 6 ; 
		
		System.out.println(" Is myInt < 6 ? " + myBoolean);
		System.out.println(" Here is some floating point division (Double / Float))");
		System.out.println(myDouble / myFloat);
		
		System.out.println(" But what happen when we divided integer ? 5/2 = ?");
		System.out.println(myInt / myByte);
		
		System.out.println(" Well there is no decimal and  no reminder");
	}
	
}
