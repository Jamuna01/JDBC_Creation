package jdbc.demonstration;

import java.sql.Connection; 

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_Creation 
{
	public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/";
	public static final String USER_NAME = "root";
	public static final String PASSWORD = "toor";
	public static final String SQL = "create database Jamuna_db";
	
	public static void main(String[] args) throws SQLException
	{
		Connection con = null;
		Statement st = null;
		
		try {
			//1. Register the driver
			Class.forName(DRIVER);
			
			//2. Obtain the connection object
			con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			
			//3.Obtain the statement object
			st = con.createStatement();
			
			//4. execute the query
			st.executeUpdate(SQL);
			System.out.printf("DB Created!");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		finally
		{
			try
			{
				//5. Close the connection
				con.close();
				st.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
		
	}
}
