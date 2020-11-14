package OUT_system;
package DB_Utilities:

import java.sql.*; 
import MyDB;

class Customer {
	
	
	// class attributes 
	
	long Customer_ID;
	String Customer_Name;
	String Customer_Address;
	long phone_No;
	
	// class function 
	
	
	public Customer() {
		Customer_ID = 0;
		Customer_Name="";
		Customer_Address="";
		phone_No=0;
	}
    
	
	public int AddCustomer(long c_ID, String Name, String Address, long PhoneNO) {
		
		
		//connect to database
		MyDB DB = new MYDB();

				String SQL_Query = "";
		//To check if customer already exists
			//code here
			
			//if no
			Customer_ID = c_ID;
			Customer_Name = Name;
			Customer_Address = Address;
			phone_No = PhoneNO;
		
			ResultSet Results = DB.Execute(SQL_Query);
 
	}
	
	static int find_ID(int Customer_ID) {
    	
		// need to fill this befour use 
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
	
	//To Validate customer login
	public int validate(long c_ID , String password){
	
		/* return error codes :
	    	 * 	-2 : error in SQL query
	    	 * 	-1 : Order not found  
	    	 * 	 0 : error in connection 
	    	 * 	 1 : Success
	    	 */
		 
		int var = find_id(c_ID);
    		//if id found in database
		if (var) {
			 //Conect to database via JDBC
			MyDB DB = new MYDB();
	
				String SQL_Query = "";
	
				try {
	
					ResultSet Results = DB.Execute(SQL_Query);
	
					if(Results == null ){
							return -2;
					}
	
					return 1;
	
				}
				catch(Exception e) {
	
					return 0;
				}
					
		}
		//id not found in DB	
		else {
				return -1;
		}
    	}
	
	
	public int EditCustomer(long c_ID, String Name, String Address, long PhoneNO) {
		
		 /* return error codes :
	    	 * 	-2 : error in SQL query
	    	 * 	-1 : Order not found  
	    	 * 	 0 : error in connection 
	    	 * 	 1 : Success
	    	 */
		 
		int var = find_id(c_ID);
    		//if id found in database
		if (var) {
			 //Conect to database via JDBC
			MyDB DB = new MYDB();
	
				String SQL_Query = "";
	
				try {
	
					ResultSet Results = DB.Execute(SQL_Query);
	
					if(Results == null ){
							return -2;
					}
	
					return 1;
	
				}
				catch(Exception e) {
	
					return 0;
				}
					
		}
		//id not found in DB	
		else {
				return -1;
		}
	}
	 
	public int DeleteCustomer(long c_ID) {
		
		/* return error codes :
	    	 * 	-2 : error in SQL query
	    	 * 	-1 : Order not found  
	    	 * 	 0 : error in connection 
	    	 * 	 1 : Success
	    	 */
		 
		int var = find_id(c_ID);
    		//if id found in database
		if (var) {
			 //Conect to database via JDBC
			MyDB DB = new MYDB();
	
				String SQL_Query = "";
	
				try {
	
					ResultSet Results = DB.Execute(SQL_Query);
	
					if(Results == null ){
							return -2;
					}
	
					return 1;
	
				}
				catch(Exception e) {
	
					return 0;
				}
					
		}
		//id not found in DB	
		else {
				return -1;
		}
	
}



