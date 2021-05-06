package com.Sekou;

public class Product {
	
	private int id;
	//constructor
	public Product(int id){
        this.id = id;
      }
    //getter
    public int getId(){
            return this.id;
          }
    // setter
    public void setId(int id){
            this.id = id;
          }

    @Override
    public boolean equals(Object obj) {
          if (obj instanceof Product){
                Product other = (Product) obj;

                if (other.getId() == this.id){
                      return true;
                  }
            }
      return false;
  }
}
