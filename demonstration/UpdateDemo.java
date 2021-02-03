package jdbc.demonstration;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDemo
{

	public static final String SQL = "update user_tbl set user_name='Krishna', password='dfdf' where id = 3";
	
	
	
	public static void main(String[] args) throws ClassNotFoundException
	{
		
		try {

			Connection con = DbUtil.getConnection();
			Statement st = con.createStatement();
			
			st.executeUpdate(SQL);
			System.out.printf("Data Updated!");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		}
}
