package IN_system;

import java.sql.ResultSet;

public class Product {
	int Product_Id;
	int Supplier_Id;
	
	public Product(){
		Product_Id = 0;
		Supplier_Id = 0;
	}
	
	public get_product_info(int pid ){
		
		MyDB DB = new MYDB();
		
		String SQL_Query = "";

		try {

			ResultSet Results = DB.Execute(SQL_Query);

			if(Results == null ){
				return -2;
			}
			
			while( Results.next()) {
				 
				   customer_name = rs.getString("Product_name"));
				   /*
				    * needs to add the database feilds in to this 
				    */
				
				   
				} 
			 // type cast all the values in to String
			 // and return the array_list of the strings as the output 

			return 1; // modify the result statement 

		}
		catch(Exception e) {

			return 0;
		}
	}
	 
	
	
	
	
}
