import java.sql.*;

public class Tables {
	public static void createTables(Connection conn) {
		try {
			String sql1 = "Create table accomodation(Id int primary key, type varchar(32), bedType varchar(32),"
					+ "maxGuests int, description varchar(32));";

			String sql2 = "Create table roomfair(id int primary key, value double precision, season varchar(32));";

			String sql3 = "Create table accomodationfairrelation(id int primary key, id_accomodation int references accomodation(Id),"
					+ "id_room_fair int references roomfair(Id));";

			Statement stm = conn.createStatement();
			stm.execute(sql1);
			stm.execute(sql2);
			stm.execute(sql3);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
