import java.util.Random;

public class TicketType {

	private Tickets ticket;

	public Tickets getTicket() {
		return ticket;
	}

	Tickets[] list = Tickets.values();
	Random random = new Random();

	public TicketType() {
		this.ticket = list[random.nextInt(list.length)];
	}

}
