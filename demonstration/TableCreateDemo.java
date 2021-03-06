package jdbc.demonstration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TableCreateDemo 
{
	public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/jamuna_db";
	public static final String USER_NAME = "root";
	public static final String PASSWORD = "toor";
	public static final String SQL = "create table user_tbl(id int not null auto_increment, "
			+ "user_name varchar(45), password varchar(45), primary key(id))";
	
	public static void main(String[] args) throws ClassNotFoundException
	{
		
		try {

			Connection con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			Statement st = con.createStatement();
			
			st.executeUpdate(SQL);
			System.out.printf("Table Created!");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		}
		
	}


