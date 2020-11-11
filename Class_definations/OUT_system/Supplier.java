package OUT_system;
package DB_Utilities:

import java.sql.*; 
import DB_Connect

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
			String Conn_URL = "";
			String Username = "";
			String Password = "";

			DB_Connect Conn = new DB_Connect();

				Connection con = Conn.Connect(Conn_URL,Username,Pass_ID)

				String SQL_Query = ""; // create the add query as pr the database 
			
				Supplier_ID = s_ID;
				Supplier_Name = Name;
				Supplier_Address = Address;
				phone_No = PhoneNO;
				
			ResultSet RR = Conn.Run_Query(SQL_Query);
	 
		}
		
		static int find_ID(int Supplier_ID) {
    	
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
		
		//To Validate supplier login
		public int validate(long s_ID , String password){
	
			int var = find_id(s_ID);
			
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
		
		public int EditSupplier(long s_ID, String Name, String Address, long PhoneNO) {
			
			  int var = find_id(s_ID);
    	
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
		
		public int DeleteSupplier(long s_ID) {
			
			int var = find_id(s_ID);
    	
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
