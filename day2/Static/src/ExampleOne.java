
public class ExampleOne {
	// class var 
	public static int staticVar = 0;
	
	// instance var 
	public int instanceVar = 0 ; 
	
	// constructor 
	
	public ExampleOne() {
		this.instanceVar++;
		staticVar++;
	}

	public static void main(String[] args) {
		// invoke static method with className.staticMethodName
		
//		wakeUp();
		ExampleOne.wakeUp();
		
		ExampleOne instance1 = new ExampleOne();
		ExampleOne instance2 = new ExampleOne();
		
		System.out.println("instance var belong to instance"+ instance1.instanceVar);
		System.out.println("instance var belong to instance"+ instance2.instanceVar);
		
		System.out.println("static var belong to class "+ staticVar);// same as 
		System.out.println("static var belong to class "+ ExampleOne.staticVar);



		
	}
	
	public static void wakeUp() {
		System.out.println("Wake Up");
	}
	
}
