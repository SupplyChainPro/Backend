package IN_system;
// import Product 

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
	/* Check_Stock_Avl(Product_ID) -- > New function 
	{ connect to the JDBC 
		Check the Stock Count of the Product == Product_ID
		if count == 0 : 
			rturn -1
		else :
			return Stock_count 
	}
	

	Add_Stock(int pid , int quan , int sid){
		 connect to the JDBC 
			Create new Data for supplier 
			}
	Update_stock ( int pid , int quan , int sid ) {
		   connect to the JDBC 
		   	Upadate data
			}
			
	
	public void showData(Supplier_ID) {
		 connect to the JDBC 
			  Retrive all data from the database with Supplier_ID == Supplier_ID 
		
		System.out.println("\n"+Product_Id+" \t\t\t "+Quantity);
		
	}
}
