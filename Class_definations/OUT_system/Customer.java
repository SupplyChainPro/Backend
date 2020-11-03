package OUT_system;


class Customer {
	
	
	// class attributes 
	
	long Customer_ID;
	String Customer_Name;
	String Customer_Address;
	long phone_No;
	
	// class function 
	
	
	public Customer() {
		Customer_ID = 0;
	}
    
	
	public void AddCustomer(long ID, String Name, String Address, long PhoneNO) {
		//Conect to database via JDBC
		//Check if customer already exists
			//if yes
				//retrieve back to login page with msg "Customer already exists"
			//if no
				//continue with below function
		 
		Customer_ID = ID;
		Customer_Name = Name;
		Customer_Address = Address;
		phone_No = PhoneNO;
		
		//add info to database
 
	}
	/*
	//To Validate customer login
	public void validate(long ID , String password){
		 //Conect to database via JDBC
		 //check for valid info
		 	if ID matched in database but password doesn't
				//retrieve with message "Wrong password"
			
			if both ID and password matched in database
				//login the customer in the system
				
			else 
				//retrieve with msg "Customer doesn't exist"
	}
	*/
	
	public void EditCustomer(long ID, String Name, String Address, long PhoneNO) {
		
		 //Conect to database via JDBC
		//Check if customer exists
			//if yes
				//let customer edit the info
				//update in database
			//if no
				//retrieve with error msg "customer doesn't exist"
		Customer_ID = ID;
		Customer_Name = Name;
		Customer_Address = Address;
		phone_No = PhoneNO;
 
	}
	 
	public void DeleteCustomer(long ID) {
		
		//Conect to database via JDBC
		//Check if customer exists
			//if yes
				//delete the customer from database
			//if no
				//retrieve with error msg "customer doesn't exist"
		Customer_ID = ID;
		
		Customer_ID = 0;
		Customer_Name = "";
		Customer_Address =  "";
		phone_No = 0;

	}
	
	

}



