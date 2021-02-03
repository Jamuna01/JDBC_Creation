package jdbc.demonstration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo 
{

	
	public static final String SQL = "insert into user_tbl(user_name, password)values('Ram', 'aa')";
	
	
	//insert into user_tbl(user_name, password)values('Ram', 'aa')"
	//insert into user_tbl(user_name, password)values('Jamuna', 'kkk')"
	//insert into user_tbl(user_name, password)values('Dev', ''jfdljf'')"
	public static void main(String[] args) throws ClassNotFoundException
	{
		
		try {

			Connection con = DbUtil.getConnection();
			Statement st = con.createStatement();
			
			st.executeUpdate(SQL);
			System.out.printf("Inserted Data!");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		}
}
