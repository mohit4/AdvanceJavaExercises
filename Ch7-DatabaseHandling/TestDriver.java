import java.sql.*;

public class TestDriver {
	public static void main(String[] args) {
		try {
			Driver d = (Driver)Class.forName("com.mysql.jdbc.Driver").newInstance();
			System.out.println("DB connected!");
		}
		catch (Exception e) {
			System.out.println("Connection failed!");
		}
	}
}
