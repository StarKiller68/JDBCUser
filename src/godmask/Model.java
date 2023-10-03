package godmask;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Model {
	
	private String name;
	private int age;
	private boolean success;
	public Model(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// The following method creates the DB connection/transactions
	public boolean createUser() {
		try {
			Connection con = null;
			String sql = "INSERT INTO users (name, age) VALUES(?, ?) ";
			
			
			
			
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb?user=root&password=sicilian");
			PreparedStatement ps = con.prepareStatement(sql);
			con.setAutoCommit(false);
			
			ps.setString(1, this.name);
			ps.setInt(2, this.age);
			
			success = ps.execute();
			con.commit();
			ps.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return success;
		
	}
	

}
