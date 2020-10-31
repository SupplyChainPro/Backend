package IN_system;

// Import check_stock_avl from Stock  
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
	    
	    
	// Stock Avlb  --- > ( check for the avlb Of that product ) { by calling Stock.java } 
		// Connect to the Database via JDBC 
	    	// Perform add data operation to Mysql DB server  
	// else 
	    	// Retrive back with Out of stock 
	    
    	Order_ID=o_ID;
        Customer_ID=c_ID;
        Customer_name=c_name;
        ammount=a;
        Order_date=o_date;
    	
    }

    public void Edit_order(int o_ID,int c_ID,String c_name, float a, String o_date ){
        //get order from database to edit.update databse with modified data
	    
	    
	// Check for the Order_ID
		// Connect to the Database via JDBC 
		// Perform edit data operation to Mysql DB server 
	// else 
	    	// Retrive back with Error msg " Invalid Order_ID "  
    }

    public void Cancel_order(int ID){
	    
	// Check for the Order_ID
		// Connect to the Database via JDBC 
		// Perform edit data operation to Mysql DB server 
	// else 
	    	// Retrive back with Error msg " Invalid Order_ID "  
    	
    	Order_ID=0;
        Customer_ID=0;
        Customer_name="";
        ammount=0;
        Order_date="";
    	
        //cancel given order
    }
}
