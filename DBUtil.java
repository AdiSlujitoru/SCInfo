import java.sql.*;

public class DBUtil {
	public static void loadDriver() {
		try {
			Class.forName("org.postgresql.Driver").newInstance();
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
	}

	public static Connection getConnection() throws SQLException {
		loadDriver();
		Connection connection = null;
		String url = "jdbc:postgresql://localhost:5432/postgres?user=postgres&password=paroladeneghicit";
		connection = DriverManager.getConnection(url);
		return connection;
	}

}
