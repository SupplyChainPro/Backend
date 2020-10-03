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
		
		 
		Customer_ID = ID;
		Customer_Name = Name;
		Customer_Address = Address;
		phone_No = PhoneNO;
		
 
	}
	
	public void EditCustomer(long ID, String Name, String Address, long PhoneNO) {
		
		 
		Customer_ID = ID;
		Customer_Name = Name;
		Customer_Address = Address;
		phone_No = PhoneNO;
 
	}
	 
	public void DeleteCustomer(long ID) {
		
		Customer_ID = 0;
		Customer_Name = "";
		Customer_Address =  "";
		phone_No = 0;

	}
	
	

}



