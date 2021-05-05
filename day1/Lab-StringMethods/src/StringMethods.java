
public class StringMethods {
	public static void main(String[] args) {
		String str = "Pancakes";
		System.out.println("str : " + str);
		
		System.out.println("str is equals to 'Pancakes' ? : " +  str.equals("Pancakes"));
		
		String s = new String("Pancakes");
		System.out.println("s : " + s);
		
		System.out.println("str is equals to s ? : " +  str.equals(s));
		
		System.out.println("str and s refer to same object ? : " +  (str == s) );
		
		System.out.println("***********************************************************");
		
		String myString1 = "Revature";
		String myString2 = new String("Revature");
		System.out.println("myString1 : " + myString1);
		System.out.println("myString2 : " + myString2);
		
		System.out.println("myString1 is equals to myString2 ? : " +  myString1.equals(myString2));
		System.out.println("myString1 and myString2 refer to same object ? : " +  (myString1 == myString2) );
		
		System.out.println("***********************************************************");

		str = "Pancakes";
		System.out.println("str length : " + str.length());
		
		String myString3 = "supercalifragilisticexpialidocious";
		System.out.println("myString3 length : " + myString3.length());
		
		System.out.println("***********************************************************");

		
		str = "Pancakes";

	     //use the indexOf() method - note it returns 
	     //the index of the first occurrence of a char
	     System.out.println("index of letter a is : " + str.indexOf('a'));
	     
	     System.out.println("index of letter c in myString3 is : " + myString3.indexOf('c'));
	     
	     System.out.println("index of letter z in myString3 should not work/return -1 : " + myString3.indexOf('z'));

	}

}
