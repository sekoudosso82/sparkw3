import java.util.Scanner;

public class ExampleTwo {
	
	public static void main(String[] args) {
		
		// set up some string data 
		String numbers = "1 2 3 4 5";
		
		// create scanner over the string 
		Scanner sc = new Scanner(numbers);
		
		// iterate over data 
		while (sc.hasNextInt()) {
			
//			System.out.println("print sc next integer: "+ sc.nextInt());
			
			System.out.println(sc.nextInt());
			
			// print a comma if more number are available
			if (sc.hasNextInt()) {
				System.out.println(",");
			}
		}
		
		sc.close();
			
	}

}
