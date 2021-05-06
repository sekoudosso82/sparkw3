
public class Test {

  public static void main(String[] args) {
    A a = new A();

    System.out.println(a.instanceCount);
    // Class A here will count all it instance
    System.out.println("1st Class A instance count " +A.staticCount); // we can't access static data via an object instance.
    
    A a2 = new A();

    System.out.println(a2.instanceCount);
    System.out.println("2nd Class A instance count " +A.staticCount);
    
    // Instance members are associated to an object that is saved in memory. We can manipulate data for an instance and 
    // it won't affect another instance.
    a.setInstanceCount(15);
    
    System.out.println("object a instanceCount: " + a.instanceCount);
    System.out.println("object a2 instanceCount: " + a2.instanceCount);
    
    // The static variable does not affect the instance ones.
    A.setStaticCount(2494);

    System.out.println("class A staticCount: " + A.staticCount);
    
  }
}