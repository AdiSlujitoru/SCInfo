
public class FestivalAttendeeThread implements Runnable {

	private Tickets ticket;
	private FestivalGate gate;

	FestivalAttendeeThread(TicketType ticket, FestivalGate gate) {
		this.ticket = ticket.getTicket();
		this.gate = gate;
	}

	public Tickets giveTicket() {
		return ticket;
	}

	public void run() {
		try {
			for (int i = 0; i < 100; i++) {
				Thread.sleep(250);
				this.ticket = new TicketType().getTicket();
				gate.gatePass(this);

			}

		} catch (InterruptedException e) {

		}

	}
}
