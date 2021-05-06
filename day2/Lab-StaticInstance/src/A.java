
public class A {
	//static member
	  public static int staticCount = 0;

	  //instance member
	  public int instanceCount = 0;

	  public A() {
	    staticCount++;
	    this.instanceCount++;
	  }
	  
	//static getter
	  public static int getStaticCount() {
	    return A.staticCount;
	  }
	//static setter
	  public static void setStaticCount(int staticCount) {
	    A.staticCount = staticCount;
	  }
	  
	//instance getter
	  public int getInstanceCount() {
	    return this.instanceCount;
	  }
	  
	//instance setter
	  public void setInstanceCount(int instanceCount) {
	    this.instanceCount = instanceCount;
	  }
	}