package IN_system;

public class Stock{
	
	int Product_Id;
	int Quantity;
	int Supplier_Id;
	
	Stock(){
		Product_Id = 0;
		Quantity = 0;
		Supplier_Id = 0;
	}
	
	public Stock(int pid , int quan , int sid){
		Product_Id = pid;
		Quantity = quan;
		Supplier_Id = sid;
	}
	
	public void showData(){
		
		System.out.println("\n"+Product_Id+" \t\t\t "+Quantity);
		
	}
}
