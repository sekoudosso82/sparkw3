package Examples;

public class StringTest {
	
	public static void main(String[] args) {
		
		String  myString1 = "Hello"; 
		String myString2 = new String("Hello");
		
		System.out.println(" This  is myString1: " + myString1);
		System.out.println(" This  is myString2: " + myString2);
		
		if(myString1 == myString2) {
			System.out.println(" myString1 and myString2 point to the same object ");
		}
		else {
			System.out.println(" myString1 and myString2 do not point to the same object");
		}
	}

}
