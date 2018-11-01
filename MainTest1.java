import java.sql.*;

import org.junit.jupiter.api.Test;

class MainTest1 {

	@Test
	void test() {
		try {
			Connection conn = DBUtil.getConnection();
			if (conn == null) {
				System.out.println("Connection null");
			} else {
				PreparedStatement s1 = null;
				PreparedStatement s2 = null;
				PreparedStatement s3 = null;
				String str1 = "insert into accomodation values(?, ?, ?, ?, ?)";
				String str2 = "insert into roomfair values(?, ?, ?)";
				String str3 = "insert into accomodationfairrelation values(?, ?, ?)";
				try {
					conn.setAutoCommit(false);
					// S x = Statement for Table x insertion
					s1 = conn.prepareStatement(str1);
					s2 = conn.prepareStatement(str2);
					s3 = conn.prepareStatement(str3);
					for (int j = 1; j <= 4; j++) {
						s1.setInt(1, j);
						if (j == 1) {
							s1.setString(2, "OnePerson");
							s1.setString(3, "NormalSize");
							s1.setInt(4, 1);
							s1.setString(5, "One Room");
						}
						if (j == 2) {
							s1.setString(2, "Double");
							s1.setInt(4, 2);
							s1.setString(5, "One Room");
						}
						if (j == 3) {
							s1.setString(2, "Suite");
							s1.setInt(4, 4);
							s1.setString(5, "Two Rooms");
						}
						if (j == 4) {
							s1.setString(2, "VIP");
							s1.setInt(4, 2);
							s1.setString(5, "Two Rooms");
						}
						if (j != 1) {
							s1.setString(3, "BigSize");
						}
						s1.executeUpdate();
						conn.commit();
					}

					for (int i = 0; i < 16; i++) {
						int count = (i + 4) % 4;
						int price = (i / 8) + 1;
						s2.setInt(1, i + 1);

						if (count == 0) {
							s2.setInt(2, 100 * price);
							s2.setString(3, "Spring");
						}
						if (count == 1) {
							s2.setInt(2, 200 * price);
							s2.setString(3, "Summer");
						}
						if (count == 2) {
							s2.setInt(2, 300 * price);
							s2.setString(3, "Autumn");
						}
						if (count == 3) {
							s2.setInt(2, 400 * price);
							s2.setString(3, "Winter");
						}
						s3.setInt(1, i + 1);
						s3.setInt(2, (i / 4) + 1);

						s3.setInt(3, i + 1);

						s2.executeUpdate();
						s3.executeUpdate();

						conn.commit();
					}
				}

				catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		} catch (Exception e) {
			e.getMessage();
		}

	}

}
