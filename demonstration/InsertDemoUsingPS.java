package jdbc.demonstration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemoUsingPS 
{
public static final String SQL = "insert into user_tbl(user_name, password)values(?, ?)";
	
	
	
	public static void main(String[] args) throws ClassNotFoundException
	{
		
		try {

			PreparedStatement ps = DbUtil.getConnection().prepareStatement(SQL);
			
			ps.setString(1, "Gopal");
			ps.setString(2, "gg");
			
			ps.executeUpdate();
			System.out.printf("Data inserted!");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		}
}
