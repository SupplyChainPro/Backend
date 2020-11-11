package IN_system;
package DB_Utilities:

import java.sql.*;
import Stock 
import BD_Connect

// Import check_stock_avl from Stock  
public class Order{
	
    int Order_ID;
    int Product_ID;
    int Quantity;
    int Customer_ID;
    String Customer_name;
    float ammount;
    String Order_date;

    Order(){
        Order_ID=0;
        Customer_ID=0;
        Customer_name="";
        ammount=0.0;
        Order_date="";
        Product_ID = 0;
        Quantity = 0;
    }
 
    public int Add_order(int o_ID,int c_ID,String c_name, float a, String o_date,int p_ID,int Quan){
	    
    Stock Order_stock = new Stock(Product_ID);
    
    boolen var = Order_stock.Get_Stock_avl(Quan);
    
    if (var) {
    	
    	// need to fill this befour use 
    	String Conn_URL = "";
    	String Username = "";
    	String Password = "";
    	
    	DB_Connect Conn = new DB_Connect();

		Connection con = Conn.Connect(Conn_URL,Username,Password);
		
		String SQL_Query = ""; // create the add query as pr the database 
		
		try {
			ResultSet RR = Conn.Run_Query(SQL_Query);
			return 1:
		}
		catch(Exception e) {
			return 0;
		}
	else {
			return -1;
		}
    	
	
	
    }
    
    static int find_ID(int order_ID) {
    	
    	// need to fill this befour use 
    	String Conn_URL = "";
    	String Username = "";
    	String Password = "";
    	
    	DB_Connect Conn = new DB_Connect();

		Connection con = Conn.Connect(Conn_URL,Username,Password);
		
		String SQL_Query = ""; // create the add query as pr the database
		
		try {
			ResultSet RR = Conn.Run_Query(SQL_Query);
			return 1:
		}
		catch(Exception e) {
			return 0;
		}
		
    	
    } 
    	
    }

    public void Edit_order(int o_ID,int Product_ID,int c_ID,String c_name, float a, String o_date,int Quantity ){
      
    	int var = find_id(o_ID);
    	
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
    	else {
    			return -1;
    		}
    }

    public void Cancel_order(int ID){
    	
    	int var = find_id(o_ID);
    	
    	if (var) {
        	
        	// need to fill this befour use 
        	String Conn_URL = "";
        	String Username = "";
        	String Password = "";
        	
        	DB_Connect Conn = new DB_Connect();

    		Connection con = Conn.Connect(Conn_URL,Username,Password);
    		
    		String SQL_Query = ""; // create the cancle query as pr the database 
    		
    		try {
    			ResultSet RR = Conn.Run_Query(SQL_Query);
    			return 1:
    		}
    		catch(Exception e) {
    			return 0;
    		}
    	else {
    			return -1;
    		}
    	
    }
}
