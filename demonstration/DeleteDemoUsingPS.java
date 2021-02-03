package jdbc.demonstration;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteDemoUsingPS 
{
public static final String SQL = "delete from user_tbl where id=?";
	
	
	
	public static void main(String[] args) throws ClassNotFoundException
	{
		
		try {

			PreparedStatement ps = DbUtil.getConnection().prepareStatement(SQL);
			
			ps.setInt(1, 4);
			
			ps.executeUpdate();
			System.out.printf("Data deleted!");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		}
}
