package jdbc.demonstration;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectDemo 
{
public static final String SQL = "select * from user_tbl";
	
	
	
	public static void main(String[] args) throws ClassNotFoundException
	{
		
		try {

			PreparedStatement ps = DbUtil.getConnection().prepareStatement(SQL);
			
			//ps.setInt(1, 1);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				System.out.println("Id is: " + rs.getInt(1));
				System.out.println("Username is: " + rs.getString(2));
				System.out.println("Password is: " + rs.getString(3));
				System.out.println("=====================");
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		}
}
