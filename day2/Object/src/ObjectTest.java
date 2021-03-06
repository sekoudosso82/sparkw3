

class Person {
	private String name;
	
	// getter 
	public String getName() {
		return name;
	}
	// setter 
	public void setName(String name) {
		this.name = name;
	}
	
	// overriding toString method
	public String toString() {
		return "Hi, I'm " + this.name;
	}

}
 
public class ObjectTest {
	
	public static String print(Object o) {
		return o.toString();
	}
	
	public static void main(String[] args) {
		Person someone = new Person();
		
		someone.setName("Joe");
		
		System.out.println(print(someone));
	}

}
