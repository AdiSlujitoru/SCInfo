import java.sql.*;

public class Main {
	public static void main(String[] args) {
		try {
			Connection conn = DBUtil.getConnection();
			//Tables.createTables(conn);
			 Test2.test();
		} catch (Exception e) {
			e.getMessage();
		}

	}
}
