package thisKeyWord6Usage;

public class ThisClassInstance {
	int rollno;  
	String name;  
	float fee;  

	ThisClassInstance(int rollno,String name,float fee){  
		this.rollno=rollno; // Refers class instance variable rollno 
		this.name=name;  // Refers class instance variable name
		this.fee=fee;   // Refers class instance variable fee
	}  

	void display(){System.out.println(rollno+" "+name+" "+fee);}  

}  

	  

class TestThis2{  

	public static void main(String args[]){  

		ThisClassInstance s1=new ThisClassInstance(111,"ankit",5000f);  

		ThisClassInstance s2=new ThisClassInstance(112,"sumit",6000f);  

		s1.display();  
	
		s2.display();  

	}
}
