package OUT_system;
package DB_Utilities:

import java.sql.*; 
import DB_Connect

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
    
	
	public void AddCustomer(long c_ID, String Name, String Address, long PhoneNO) {
		
		//connect to database
		String Conn_URL = "";
    		String Username = "";
    		String Password = "";
    	
    		DB_Connect Conn = new DB_Connect();

			Connection con = Conn.Connect(Conn_URL,Username,Password);
		
			String SQL_Query = ""; // create the add query as pr the database 
		
			Customer_ID = c_ID;
			Customer_Name = Name;
			Customer_Address = Address;
			phone_No = PhoneNO;
		
			ResultSet RR = Conn.Run_Query(SQL_Query);
 
	}
	
	static int find_ID(int Customer_ID) {
    	
		// need to fill this befour use 
		String Conn_URL = "";
		String Username = "";
		String Password = "";

		DB_Connect Conn = new DB_Connect();

			Connection con = Conn.Connect(Conn_URL,Username,Password);

			String SQL_Query = ""; // create the search query as pr the database

			try {
				ResultSet RR = Conn.Run_Query(SQL_Query);
				return 1:
			}
			catch(Exception e) {
				return 0;
			}
	} 
	
	//To Validate customer login
	public void validate(long c_ID , String password){
	
		int var = find_id(c_ID);
    	//if id found in database
		if (var) {
			 //Conect to database via JDBC
			String Conn_URL = "";
			String Username = "";
			String Password = "";

			DB_Connect Conn = new DB_Connect();

				Connection con = Conn.Connect(Conn_URL,Username,Password);

			try {
				ResultSet RR = Conn.Run_Query(SQL_Query);
				return 1:
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
	
	
	public void EditCustomer(long c_ID, String Name, String Address, long PhoneNO) {
		
		 nt var = find_id(c_ID);
    	
		if (var) {

			// need to fill this befour use 
			String Conn_URL = "";
			String Username = "";
			String Password = "";

			DB_Connect Conn = new DB_Connect();

			Connection con = Conn.Connect(Conn_URL,Username,Password);

			String SQL_Query = ""; // create the edit query as pr the database 

			try {
				ResultSet RR = Conn.Run_Query(SQL_Query);
				return 1:
			}
			catch(Exception e) {
				return 0;
			}
		}

		else {
				return -1;
		}
	   
	}
	 
	public void DeleteCustomer(long c_ID) {
		
		int var = find_id(c_ID);
    	
		if (var) {

			// need to fill this befour use 
			String Conn_URL = "";
			String Username = "";
			String Password = "";

			DB_Connect Conn = new DB_Connect();

			Connection con = Conn.Connect(Conn_URL,Username,Password);

			String SQL_Query = ""; // create the delete query as pr the database 

			try {
				ResultSet RR = Conn.Run_Query(SQL_Query);
				return 1:
			}
			catch(Exception e) {
				return 0;
			}
		}
			
		else {
				return -1;
		}
	}
	
}



