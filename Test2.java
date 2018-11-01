import java.sql.*;

public class Test2 {

	static void test() {
		try {
			Connection conn = DBUtil.getConnection();
			if (conn == null) {
				System.out.println("Connection null");
			} else {
				Statement st1 = conn.createStatement();
				Statement st2 = conn.createStatement();
				String sql1 = "select accomodation.type " + "from accomodation join accomodationfairrelation "
						+ "on accomodation.id=accomodationfairrelation.id_accomodation";
				String sql2 = "select roomfair.value, roomfair.season " + "from roomfair";
				ResultSet rs1 = st1.executeQuery(sql1);
				ResultSet rs2 = st2.executeQuery(sql2);
				while (rs1.next() && rs2.next()) {
					System.out.print(rs1.getString(1) + " ");
					System.out.println(rs2.getInt(1) + " " + rs2.getString(2));
				}

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
