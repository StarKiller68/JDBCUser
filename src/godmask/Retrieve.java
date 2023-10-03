package godmask;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class Retrieve {

	public static void main(String[] args) {
		
		try {
			Connection con = null;
			ResultSet rs = null;
			String query = "SELECT * FROM users";
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb?user=root&password=sicilian");
		
			
			Statement stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				System.out.println("The name of user is: " + rs.getString(1));
				System.out.println("The age of user is: " + rs.getInt(2));
				System.out.println();
			}
			
			rs.close();
			con.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
