package IN_system;
package DB_Utilities:

import java.sql.*;
import Stock;
import MyDB;
 
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

    	/* return error codes :
    	 * 	-2 : error in SQL query 
    	 * 	-1 : Stock not avilable 
    	 * 	 0 : error in connection 
    	 * 	 1 : Success 
    	 */
	    Stock Order_stock = new Stock();

	    Boolen var = Order_stock.get_stock(p_ID);
	     

	    if (var) {
				MyDB DB = new MYDB();

				String SQL_Query = "";

				try {

					ResultSet Results = DB.Execute(SQL_Query);

					if(Results == null ){
						return -2;
					}

					return 1;

				}
				catch(Exception e) {

					return 0;
				}
				
			}
			else {

				return -1;
			}



	    }
	
	    static int find_ID(int order_ID) {
	    	/* return error codes :
	    	 * 	-1 : error in SQL query 
	    	 * 	 0 : error in connection 
	    	 * 	 1 : Success
	    	 */
	
				MyDB DB = new MYDB();
	
				String SQL_Query = "";
	
				try {
	
					ResultSet Results = DB.Execute(SQL_Query);
	
					if(Results == null ){
						return -1;
					}
	
					return 1;
	
				}
				catch(Exception e) {
	
					return 0;
				}
	
	
	    }
	
	    public void Edit_order(int o_ID,int Product_ID,int c_ID,String c_name, float a, String o_date,int Quantity ){
	    	/* return error codes :
	    	 * 	-2 : error in SQL query
	    	 * 	-1 : Order not found  
	    	 * 	 0 : error in connection 
	    	 * 	 1 : Success
	    	 */
	
	    	int var = find_id(o_ID);
	
	    	if (var) {
	
					MyDB DB = new MYDB();
	
					String SQL_Query = "";
	
					try {
	
						ResultSet Results = DB.Execute(SQL_Query);
	
						if(Results == null ){
							return -2;
						}
	
						return 1;
	
					}
					catch(Exception e) {
	
						return 0;
					}
					
			}
	    	else {
	    			return -1;
	    	}
	    } 
	
	    public int Cancel_order(int ID){
	    	
	    	/* return error codes :
	    	 * 	-2 : error in SQL query
	    	 * 	-1 : Order not found  
	    	 * 	 0 : error in connection 
	    	 * 	 1 : Success
	    	 */
			
	
	    	int var = find_id(o_ID);
	
			if (var) {
	
						MyDB DB = new MYDB();
	
						String SQL_Query = "";
	
						try {
	
							ResultSet Results = DB.Execute(SQL_Query);
	
							if(Results == null ){
								return -2;
							}
	
							return 1;
	
						}
						catch(Exception e) {
	
							return 0;
						}
						
					}
	
	    	else {
	    			return -1;
	    		}
	
	    }
	    
	    public int Read_order(int ID) {
	    	
	    	/* return error codes :  ( As of now )
	    	 * 	-2 : error in SQL query
	    	 * 	-1 : Order not found  
	    	 * 	 0 : error in connection 
	    	 * 	 1 : Success
	    	 */
			
	
	    	int var = find_id(o_ID);
	
			if (var) {
	
						MyDB DB = new MYDB();
	
						String SQL_Query = "";
	
						try {
	
							ResultSet Results = DB.Execute(SQL_Query);
	
							if(Results == null ){
								return -2;
							}
							
							while( Results.next()) {
								 
								   customer_name = rs.getString("Customer_name"));
								   /*
								    * needs to add the database feilds in to this 
								    */
								
								   
								} 
							 // type cast all the values in to String
							 // and return the array_list of the strings as the output 
	
							return 1; // modify the result statement 
	
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
