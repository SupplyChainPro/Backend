package OUT_system;


class Supplier {
	
	
	// class attributes 
	
		long Supplier_ID;
		String Supplier_Name;
		String Supplier_Address;
		long phone_No;
		
		// class function 
		
		
		public Supplier() {
			Supplier_ID = 0;
		}
	    
		
		public void AddSupplier(long ID, String Name, String Address, long PhoneNO) {
			
			 //Conect to database via JDBC 
			//Check if supplier already exists
			//if yes
				//retrieve back to login page with msg "Supplier already exists"
			//if no
				//continue with below function
			
			Supplier_ID = ID;
			Supplier_Name = Name;
			Supplier_Address = Address;
			phone_No = PhoneNO;
			
	 
		}
		/*
		//To Validate supplier login
		public void validate(long ID , String password){
			 //Conect to database via JDBC
			 //check for valid info
				if ID matched in database but password doesn't
					//retrieve with message "Wrong password"

				if both ID and password matched in database
					//login the supplier in the system

				else 
					//retrieve with msg "Supplier doesn't exist"
		}
		*/
		public void EditSupplier(long ID, String Name, String Address, long PhoneNO) {
			
			  //Conect to database via JDBC
				//let supplier edit the info
				//update in database
			
			Supplier_ID = ID;
			Supplier_Name = Name;
			Supplier_Address = Address;
			phone_No = PhoneNO;
	 
		}
		
		public void DeleteSupplier(long ID) {
			
			//Conect to database via JDBC
				//Delete the supplier from database
				//update in database
			
			Supplier_ID = 0;
			Supplier_Name = "";
			Supplier_Address =  "";
			phone_No = 0;

		}
		
		

	}
