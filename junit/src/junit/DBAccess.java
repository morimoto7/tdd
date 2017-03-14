package junit;

import java.sql.*;

public class DBAccess {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Connection con = null;
		Statement stmt = null;
		
		try {
			Class.forName("org.postgresql.Driver");
			
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/DBACCESS");
			
			stmt = con.createStatement();
			
			ResultSet rset = stmt.executeQuery("select * from TEST");  
			
		}catch(Exception ex){
			con.rollback();
			ex.printStackTrace();
		}

	}
	
	abstract class Abstract{
		
	}

}
