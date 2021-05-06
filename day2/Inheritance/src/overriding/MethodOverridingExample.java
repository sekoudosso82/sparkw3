package overriding;


public class MethodOverridingExample {
	
	public static void makeItTalk(Animal input) {
		input.speak();
		
	}
	public static void main(String[] args) {
		
		Animal myA = new Animal();
		Dog myD = new Dog();
		
		System.out.println(" Make the animal object speak: ");
		makeItTalk(myA); 
		
		System.out.println(" Make the dog object speak: ");
		makeItTalk(myD); 
			
	}
}

class Animal {
	public void speak() {
		System.out.println("Geniric animal noise!");
	}
}

class Dog extends Animal{
	public void speak() {
		System.out.println("Woof!");
	}
	
}
