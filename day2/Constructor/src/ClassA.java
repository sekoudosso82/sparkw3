
public class ClassA {
	int id ;
	
	// default constructor 
	public ClassA() {
		System.out.println("Inside the no-arg constructor.");
		id = 1; 
	}
	
	//  constructor with parameters 
		public ClassA(int input) {
			id = input;
			System.out.println("Inside the constructor with parameters." + id);
		}
		
	public static void main(String[] args) {
		
		ClassA obj1 = new ClassA();
		System.out.println("After instantiation : " + obj1.id);
		
		ClassA obj2 = new ClassA(4);
		System.out.println("After instantiation : " + obj2.id);
	
	}

}
