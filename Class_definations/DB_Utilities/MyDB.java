1package DB_Utilities;

import java.sql.*;

public class MyDB {
	/* this is a class to perform very basic JDBC opetrations */

	public Connection con = null ;
	public Statement statement = null;
	public PreparedStatement preparedStatement = null;
	public ResultSet resultSet = null;

	// private info
	private String URL = "jdbc:mysql://localhost:3306/DB_name" // need to add DB name
	private String Username = "SupplychainPro"; // need to add user name here
	private String Password = "Wearebestthatswhywedoit"; // need to add password here

  static Connection Connect() throws Exception {
    	/* function provides sequre way to connnect to the database
			and return connection string */
    	try{
    		Class.forName("com.mysql.jdbc.Driver");

    		this.con = DriverManager.getConnection(this.URL, this.Username,this.Password);

    		}

    	catch(Exception e){
    		throw e;

    		}

    }


  static ResultSet Run_Query(String SQL_Query) throws SQLException {
			/* function provides a way to run the SQL Qureies directly on
			the SQL database */
    	statement =con.createStatement();

    	resultSet =statement.executeQuery(SQL_Query);

    	return resultSet;

	}



   static void Close() throws Exception {
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

		public int Execute(String query){
			/*
			executes the given sql query in the database
			arg : string
				SQL query

			return: ResultSet
			 codes :
				 ResultSet : successful execution
				null : error in SQL Query
			*/
			connect();

			try {

				ResultSet RR = Run_Query(query);
				Close();

				return RR;
			}
			catch(Exception e) {

				Close();

				return null;
		}

		}






}
