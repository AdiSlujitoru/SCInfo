
public class Main {
	public static void main(String[] args) throws Exception {
		FestivalGate gate = new FestivalGate();
		TicketType ticket = new TicketType();
		FestivalAttendeeThread person = new FestivalAttendeeThread(ticket, gate);
		FestivalStatisticsThread stats = new FestivalStatisticsThread(gate);
		stats.run();

	}
}