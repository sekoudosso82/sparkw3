
public class Parrot {
	
	public static void main(String[] args) {
        //create a class instance
		Parrot parrot  = new Parrot();
        //call your first method here
		parrot.talk();
		
		// call repeat method 
		String[] words = {"Howdy", "Polly", "wanna", "cracker"};
	    parrot.repeat(words);
	    
	    int crackers = parrot.crackersMethod(11 , 10 );
	    System.out.println("This parrot consumed "+ crackers +" crackers.");
		
		
    }


    //create your first method here
	 public void talk(){
	        System.out.println("squawk");
	    }
	 
	 public void repeat(String[] words) {
		 
//		 for (String x:words)
//	        {
//	            System.out.println(x);
//	        }
		 for (int i = 0; i < words.length; i++) {
	            System.out.println("Value of words at index: " + i + " is "+ words[i]);
	    }
		 	
	 }
	 
	 public int crackersMethod(int stole, int given) {
		 return (stole + given) ;
	 }

}
