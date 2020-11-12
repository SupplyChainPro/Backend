package IN_system;
// import Product 

import java.sql.ResultSet;

public class Stock{
	
	int Product_Id;
 
	int Supplier_Id;
	
	Stock(){
		Product_Id = 0;
		Supplier_Id = 0;
	}
	
	public int get_stock(int pid) {
		
		MyDB DB = new MYDB();
		
		int Quantity;
		
		String SQL_Query = "";

		try {

			ResultSet Results = DB.Execute(SQL_Query);

			if(Results == null ){
				return -1;
			}
			
			while( Results.next() ) {
				Quantity  = rs.getInt("quantity));
			}
			
			

			return Quantity;

		}
		catch(Exception e) {

			return 0;
		}
	}
	
	public int New_Stock(int pid , int quan , int sid){
		 
		/* return error codes :
    	 * 	-1 : error in SQL query
    	 * 	 0 : error in connection 
    	 * 	 1 : Success 
    	 */

	     
		MyDB DB = new MYDB();

		String SQL_Query = "";

		try {

			ResultSet Results = DB.Execute(SQL_Query);

			if(Results == null ){
				return -1;
			}

			return 1;

		}
		catch(Exception e) {

			return 0;
		}
				
	}
	
	public int edit_Stock(int pid , int quan , int sid){
		
		// Directly overwride the values 
		 
		/* return error codes :
    	 * 	-1 : error in SQL query
    	 * 	 0 : error in connection 
    	 * 	 1 : Success 
    	 */

	     
		MyDB DB = new MYDB();

		String SQL_Query = "";

		try {

			ResultSet Results = DB.Execute(SQL_Query);

			if(Results == null ){
				return -1;
			}

			return 1;

		}
		catch(Exception e) {

			return 0;
		}
				
	}
	
	public int delete_Stock(int pid , int sid){
		 
		/* return error codes :
    	 * 	-1 : error in SQL query
    	 * 	 0 : error in connection 
    	 * 	 1 : Success 
    	 */

	     
		MyDB DB = new MYDB();

		String SQL_Query = "";

		try {

			ResultSet Results = DB.Execute(SQL_Query);

			if(Results == null ){
				return -1;
			}

			return 1;

		}
		catch(Exception e) {

			return 0;
		}
				
	}
	
		 


		 
	}
 
