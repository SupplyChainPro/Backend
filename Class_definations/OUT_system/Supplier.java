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
			
			 
			Supplier_ID = ID;
			Supplier_Name = Name;
			Supplier_Address = Address;
			phone_No = PhoneNO;
			
	 
		}
		
		public void EditSupplier(long ID, String Name, String Address, long PhoneNO) {
			
			 
			Supplier_ID = ID;
			Supplier_Name = Name;
			Supplier_Address = Address;
			phone_No = PhoneNO;
	 
		}
		
		public void DeleteSupplier(long ID) {
			
			Supplier_ID = 0;
			Supplier_Name = "";
			Supplier_Address =  "";
			phone_No = 0;

		}
		
		

	}
