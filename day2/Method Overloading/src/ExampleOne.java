import java.util.Arrays;

public class ExampleOne {
	public static void main(String[] args) {
		int[] inputArray = {  2,5,1,4 };
		
		String[] stringArray = {"First", "Second", "Third", "Alpha"};
		
		System.out.println("int array  first element: " + getFirst(inputArray) );
		
		System.out.println("String array  first element: " + getFirst(stringArray) );
		
	}
	
	// Method Overloading
	
	public static int getFirst(int[] arr) {
		if (arr == null || arr.length == 0) return -1;
		
		Arrays.sort(arr);
		
		return arr[0];
	}
	
	public static String getFirst(String[] arr) {
		if (arr == null || arr.length == 0) return "";
		
		Arrays.sort(arr);
		
		return arr[0];
	}

}
