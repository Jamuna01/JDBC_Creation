package jdbc.demonstration;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteDemo
{
	public static final String SQL = "delete from user_tbl where id=3";
	
	public static void main(String[] args) throws ClassNotFoundException
	{
		try
		{
			Connection	con = DbUtil.getConnection();
			Statement st = con.createStatement();
			
			st.executeUpdate(SQL);
			System.out.printf("Data deleted!");
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}
