package OUT_system;
package DB_Utilities:

import java.sql.*; 
import MyDB;

class Supplier {
	
	
	// class attributes 
	
		long Supplier_ID;
		String Supplier_Name;
		String Supplier_Address;
		long phone_No;
		
		// class function 
		
		
		public Supplier() {
			Supplier_ID = 0;
			Supplier_Name="";
			Supplier_Address="";
			phone_No=0;
		}
	    
		
		public int AddSupplier(long s_ID, String Name, String Address, long PhoneNO) {
			//connect to database
			MyDB DB = new MYDB();

				String SQL_Query = "";

			
				Supplier_ID = s_ID;
				Supplier_Name = Name;
				Supplier_Address = Address;
				phone_No = PhoneNO;
				
			ResultSet Results = DB.Execute(SQL_Query);
	 
		}
		
		static int find_ID(int Supplier_ID) {
    	
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
		
		//To Validate supplier login
		public int validate(long s_ID , String password){
	
			/* return error codes :
	    	 * 	-1 : error in SQL query 
	    	 * 	 0 : error in connection 
	    	 * 	 1 : Success
	    	 */
	
			int var = find_id(s_ID);
			
			//if id found in database
			if (var) {
				 //Conect to database via JDBC
				
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
	
	

			//id not found in DB	
			else {
					return -1;
			}
    		}
		
		public int EditSupplier(long s_ID, String Name, String Address, long PhoneNO) {
			
			  /* return error codes :
	    	 * 	-1 : error in SQL query 
	    	 * 	 0 : error in connection 
	    	 * 	 1 : Success
	    	 */
	
			int var = find_id(s_ID);
			
			//if id found in database
			if (var) {
				 //Conect to database via JDBC
				
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
	
	

			//id not found in DB	
			else {
					return -1;
			}
	 
		}
		
		public int DeleteSupplier(long s_ID) {
			
			/* return error codes :
	    	 * 	-1 : error in SQL query 
	    	 * 	 0 : error in connection 
	    	 * 	 1 : Success
	    	 */
	
			int var = find_id(s_ID);
			
			//if id found in database
			if (var) {
				 //Conect to database via JDBC
				
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
	
	

			//id not found in DB	
			else {
					return -1;
			}

		}
		
}
