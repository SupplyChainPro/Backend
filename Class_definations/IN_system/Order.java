package IN_system;


public class Order{
	
    int Order_ID;
    int Customer_ID;
    String Customer_name;
    float ammount;
    String Order_date;

    public Order(){
        Order_ID=0;
        Customer_ID=0;
        Customer_name="";
        ammount=0;
        Order_date="";
    }

    Order(int o_ID,int c_ID,String c_name, float a, String o_date){
        Order_ID=o_ID;
        Customer_ID=c_ID;
        Customer_name=c_name;
        ammount=a;
        Order_date=o_date;
    }

    public void Add_order(int o_ID,int c_ID,String c_name, float a, String o_date){
    	Order_ID=o_ID;
        Customer_ID=c_ID;
        Customer_name=c_name;
        ammount=a;
        Order_date=o_date;
    	
    }

    public void Edit_order(){
        //get order from database to edit.update databse with modified data
    }

    public void Cancel_order(int ID){
    	
    	Order_ID=0;
        Customer_ID=0;
        Customer_name="";
        ammount=0;
        Order_date="";
    	
        //cancel given order
    }
}
