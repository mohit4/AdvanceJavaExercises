import java.sql.*;

public class Connect {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			String un = "root";
			String pw = "2801mohit";
			String url = "jdbc:mysql://localhost/mydb";
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url,un,pw);
			System.out.println("DB conn success");
		}
		catch(Exception e) {
			System.out.println("Can't connect");
		}
		finally {
			if(conn!=null) {
				try{
					conn.close();
					System.out.println("Database conn closed");
				}
				catch(Exception e) {
					System.out.println("DB can't be closed");
				}
			}
		}
	}
}
