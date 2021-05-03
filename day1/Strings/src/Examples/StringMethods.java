package Examples;

public class StringMethods {
	
	public static void main(String[] args) {
		
		String myString1 = "Hello"; 
		String myString2 = new String("Hello"); 
		
		System.out.println("myString1 length is : " + myString1.length());
		System.out.println("myString1 toUpperCase is : " + myString1.toUpperCase());
		System.out.println("myString1 toLowerCase is : " + myString1.toLowerCase());
		System.out.println("myString1 indexOf 'e' is : " + myString1.indexOf('e'));
		System.out.println("myString1 lastIndexOf 'l' is : " + myString1.lastIndexOf('l'));
		System.out.println("myString1 charAt 1 is : " + myString1.charAt(1));
		
		System.out.println("myString1 is same object as myString2 ? : " + (myString1 == myString2 ));

		System.out.println("myString1 is equals to myString2 ? : " + myString1.equals(myString2));
		System.out.println("myString1 is equals ignore case to myString2 ? : " + myString1.equalsIgnoreCase(myString2));
	}

}
