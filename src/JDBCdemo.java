import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCdemo {
	public static void main(String[] args) {
		ResultSet rs = null;
		Statement stmt = null;
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");				
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/classnet?useUnicode=true&charaterEncoding=UTF-8","root","root");
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select username,password from user_table");
			while(rs.next()) {
				System.out.print(rs.getString("username")+",");
				System.out.println(rs.getInt("password"));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if(stmt != null) {
					stmt.close();
					stmt = null;
				}
				if(conn != null) {
					conn.close();
					conn = null;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
