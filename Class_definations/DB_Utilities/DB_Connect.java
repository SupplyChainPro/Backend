package DB_Utilities;

import java.sql.*;

public class DB_Connect {
	/* this is a class to perform very basic JDBC opetrations */

	public Connection con = null ;
	public Statement statement = null;
	public PreparedStatement preparedStatement = null;
	public ResultSet resultSet = null;

    public Connection Connect(String Conn_URL , String Username , String Password) throws Exception {
    	/* function provides sequre way to connnect to the database
			and return connection string */
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
			/* function provides a way to run the SQL Qureies directly on
			the SQL database */
    	statement =con.createStatement();

    	resultSet =statement.executeQuery(SQL_Query);

    	return resultSet;

	}


    public void Close() throws Exception {
			/* for closing all the connections */
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
