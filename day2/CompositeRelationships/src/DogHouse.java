
public class DogHouse {
	
	Dog d;
	
	// constructor
	public DogHouse() {
		d = new Dog();
		d.setName("Ralph");
	}
	
	// instance methods 
	public String getOwner() {
		return d.getName();
	}
	
	// main 
	
	public static void main(String[] args) {
		DogHouse house = new DogHouse();
		house.d.talk();
		System.out.println("This house belongs to : " + house.getOwner());
	}
	

}
