
public class DisplayingArrays {
	public static void main(String[] args) {
//		int[]  intArray = new int[3];
//		
//		System.out.println("intAt=rray : " + intArray);
		
		int[] intArray = new int[3];
        intArray[0] = -5123;
        intArray[2] = 32;

        System.out.println("intArray[0] : " + intArray[0]);
        System.out.println("intArray[1] : " + intArray[1]);
        
        System.out.println("Trying to print an element above the array length : " + intArray[3]);
	}
	
}
