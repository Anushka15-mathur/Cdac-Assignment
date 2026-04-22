import java.util.*;
class Inventory<T>{
      private T product;
	  
	  //add product
	  void addProduct(T product){
	      this.product = product;
	  }
	  
	  //retrieve product
	    T getProduct(){
		   return product;
		}
}

class Electronic{
	
	String name;
	double price;
	
	Electronic(String name, double price){
		this.name = name;
		this.price = price;
	}
	
	void display(){
		
		System.out.println("Electronics Products: ");
		System.out.println("Name: "+name);
		System.out.println("Price: "+price);
	}
}

class Clothing{
	
	String name;
	String size;
	
	Clothing(String name, String size){
		this.name = name;
		this.size = size;
	}
	
	void display(){
		
		System.out.println("Clothing Products: ");
		System.out.println("Name: "+name);
		System.out.println("Size: "+size);
	}
}

class ElectronicsMain{
    
	public static void main(String args[]){
		
		Inventory<Electronic> eInventory = new Inventory<>();
		Electronic e1 = new Electronic("Laptop",75000);
		eInventory.addProduct(e1);
		
		Electronic eProduct = eInventory.getProduct();
		eProduct.display();
		
		System.out.println("-------------------------");
		
		Inventory<Clothing> cInventory = new Inventory<>();
		Clothing c1 = new Clothing("T-Shirt","M");
		cInventory.addProduct(c1);
		
		Clothing cProduct = cInventory.getProduct();
		cProduct.display();
	}

}