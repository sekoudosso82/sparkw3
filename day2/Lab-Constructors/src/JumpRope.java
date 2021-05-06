
public class JumpRope {
	
	//field of our JumpRope- "state" of our JumpRope object
    //sometimes referred to as a property or attribute
    double length;
    
    public JumpRope( ){
    	System.out.println("No arg constructor ran.");
        length = 7.0; //assigning length a default value
        System.out.println("using no args constructor.");
     }

    public JumpRope(double value){
        //when we call this constructor creating a new JumpRope
        //this code will execute

        //let's print out the value to show that this is executing
        System.out.println(value);
        System.out.println("Inside args constructor.");

       //let's then use that value to set our JumpRope's field
       length = value;
     }

     public static void main(String[] args) {
         //create instances here
        JumpRope jumpRope = new JumpRope(6.5);

        //use the no-arg constructor
        JumpRope jumpRopeNoArg = new JumpRope();
     }
	   
	   

}
