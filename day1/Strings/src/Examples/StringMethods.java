package Examples;

public class StringMethods {
	
	public static void main(String[] args) {
		
		String myString1 = "Good morning"; 
		String myString2 = new String("Hello"); 
		
		System.out.println("myString1 length is : " + myString1.length());
		System.out.println("myString1 toUpperCase is : " + myString1.toUpperCase());
		System.out.println("myString1 toLowerCase is : " + myString1.toLowerCase());
		System.out.println("myString1 indexOf 'e' is : " + myString1.indexOf('e'));
		System.out.println("myString1 lastIndexOf 'l' is : " + myString1.lastIndexOf('l'));
		System.out.println("myString1 charAt 9 is : " + myString1.charAt(9));
		
		System.out.println("myString1 is same object as myString2 ? : " + (myString1 == myString2 ));

		System.out.println("myString1 is equals to myString2 ? : " + myString1.equals(myString2));
		System.out.println("myString1 is equals ignore case to myString2 ? : " + myString1.equalsIgnoreCase(myString2));
	
	
		String a = new String(); 
		String b = a; 
		a = "Hello";
		System.out.println("This is a: " + a);
		System.out.println("This is b: " + b);
		
		if(a == b ) {
			System.out.println("a and b refer to the same object" );
		}
		else {
			System.out.println("a and b do not refer to the same object" );
		}
		
		String c = "b";
		System.out.println("This is c: " + c);
		
		int[] myArray = {1,2,3,4};
		System.out.println("myArray 5th element does not existe: " + myArray[5] );
		
	}

}
