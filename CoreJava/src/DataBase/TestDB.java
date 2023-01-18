package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDB {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// 1. Register Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// 2. getConnection(url, username, password)
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "");
		
		
		// ========== Insert SQL ==========
		
		// a> Write SQL
		//String sql = "insert into user(username, password) values('Hari', 'h1234')";
		
		// b> Create statement/prepared statement
		//Statement stm = con.createStatement();
		
		// c> Execute SQL
		//stm.execute(sql);
		
		// d> Close DB
		//con.close();
		//System.out.println("Success");
		
		/*
		 * For delete:
		 * String sql = "delete from user where id = 3";
		 * Statement stm = con.createStatement();
		 * stm.execute(sql);
		 * System.out.println("Delete Success");
		 */

		// ========== Select SQL ==========
		/*
		String sql = "select * from user";
		Statement stm = con.createStatement();
		ResultSet rs = stm.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println("ID = "+rs.getInt("ID"));
			System.out.println("Username = "+rs.getString("Username"));
			System.out.println("Password = "+rs.getString("Password"));
			System.out.println("==========");
		}
		*/
		
		// ========== Update SQL ==========
		String sql = "update user set password = 'testPassword' where ID = 1";
		Statement stm = con.createStatement();
		stm.execute(sql);
		System.out.println("Update Success");
	}
}
