package IN_system;

public class Product {
	int Product_Id;
	int Supplier_Id;
	
	public Product(){
		Product_Id = 0;
		Supplier_Id = 0;
	}
	
	public Product(int pid  , int sid){
		Product_Id = pid;
		Supplier_Id = sid;
	}
	
	public void showData(){																													
		
		System.out.println("\n"+Product_Id+" \t\t\t "+Supplier_Id);
		
	}
	public void Delete_Product(int pid){
		
	}
	
	
	
}

