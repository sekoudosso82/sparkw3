package examples;

public class Robot {
	
	private int maxSpeed; 
	
	// default constructor
	public Robot() {
		this.maxSpeed = 1; 
	}
	
	// defined constructor 
	public Robot(int maxSpeed) {
		this.maxSpeed = maxSpeed; 
	}
	
	//	getter 
	public int getMaxSpeed() {
		return maxSpeed;
		
	}
	
	// setter
	public void setMaxSpeed(int maxSpeed) {
		if(maxSpeed >- 0) {
			this.maxSpeed = maxSpeed;	
		}
		else {
			this.maxSpeed = 0;
		}
	}
	
	// instance method 
	public void travel() {
		System.out.println("The robot moves a distance of "+ maxSpeed +" units.");
		
	}

}
