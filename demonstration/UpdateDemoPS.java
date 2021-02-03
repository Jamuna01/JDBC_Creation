package jdbc.demonstration;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateDemoPS 
{
public static final String SQL = "update user_tbl set user_name=?, password=? where id = ?";
	
	
	
	public static void main(String[] args) throws ClassNotFoundException
	{
		
		try {

			PreparedStatement ps = DbUtil.getConnection().prepareStatement(SQL);
			
			ps.setString(1, "Suraj");
			ps.setString(2, "ksdfd");
			ps.setInt(3, 4);
			
			ps.executeUpdate();
			System.out.printf("Data updated!");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		}
}
