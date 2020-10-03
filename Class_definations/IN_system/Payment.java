package IN_system;


public class Payment{
	int Paymant_Id;
	int Payment_Amount;
	int Paymant_Customer_Id;
	
	
	public Payment(){
		 Paymant_Id=0;
		 Payment_Amount=0;
		 Paymant_Customer_Id=0;
		}
	
	public Payment(int pid , int pamt , int pcid ){
		 Paymant_Id=pid;
		 Payment_Amount=pamt;
		 Paymant_Customer_Id=pcid;
	}
	
	public void Display(){
		System.out.println("\n"+Paymant_Id+" \t\t\t "+Payment_Amount+" \t\t\t"+Paymant_Customer_Id);
	}
	
	public void Search_Payment(int pid , int m[]){
		
		
	}

}
