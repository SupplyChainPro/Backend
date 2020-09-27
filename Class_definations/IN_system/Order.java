package IN_system;

public class Order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class order{
    int Order_ID;
    int Customer_ID;
    String Customer_name;
    float ammount;
    String Order_date;

    order(){
        Order_ID=0;
        Customer_ID=0;
        Customer_name="";
        ammount=0;
        Order_date="";
    }

    order(int o_ID,int c_ID,String c_name, float a, String o_date){
        Order_ID=o_ID;
        Customer_ID=c_ID;
        Customer_name=c_name;
        ammount=a;
        Order_date=o_date;
    }

    public void Add_order(){
        //get order details and add to the database.
    }

    public void Edit_order(){
        //get order from database to edit.update databse with modified data
    }

    public void Cancel_order(){
        //cancel given order
    }
}
