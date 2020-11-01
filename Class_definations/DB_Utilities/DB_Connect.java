package DB_Utilities;

import java.sql.*;

public class DB_Connect {
	/* this is a class to perform very basic JDBC opetrations */

	public Connection con = null ;
	public Statement statement = null;
	public PreparedStatement preparedStatement = null; 
	public ResultSet resultSet = null;
	
    public Connection Connect(String Conn_URL , String Username , String Password) throws Exception {
    	
    	try{  
    		Class.forName("com.mysql.jdbc.Driver");  
    		
    		con=DriverManager.getConnection(Conn_URL, Username,Password);  
    		 
    		return con;
    		
    		}
    	
    	catch(Exception e){ 
    		throw e;
    
    		}  
    	
    } 
    
    
    public ResultSet Run_Query(String SQL_Query) throws SQLException {
    	
    	statement =con.createStatement();  
    	
    	resultSet =statement.executeQuery(SQL_Query);  
    	
    	return resultSet;
		
	}
    
    
    public void Close() throws Exception {
    	 try {
             if (resultSet != null) {
                 resultSet.close();
             }

             if (statement != null) {
                 statement.close();
             }

             if (con != null) {
                 con.close();
             }
    	 }
    	catch(Exception e){ 
    		throw e;
    	}
    }
    
    
  
    
}
    

