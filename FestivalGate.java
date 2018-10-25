import java.util.*;

public class FestivalGate {
	private TicketType t = new TicketType();
	private LinkedList<Tickets> list = new LinkedList<>();
	private List<Tickets> l1 = new LinkedList<>();
	private List<Tickets> l2 = new LinkedList<>();
	private List<Tickets> l3 = new LinkedList<>();
	private List<Tickets> l4 = new LinkedList<>();
	private List<Tickets> l5 = new LinkedList<>();

	public LinkedList<Tickets> getL() {
		return list;
	}

	public int getL1() {
		return l1.size();
	}

	public int getL2() {
		return l2.size();
	}

	public int getL3() {
		return l3.size();
	}

	public int getL4() {
		return l4.size();
	}

	public int getL5() {
		return l5.size();
	}

	private void filter(FestivalAttendeeThread p) {
		
		if (p.giveTicket() == t.list[0]) {
			l1.add(p.giveTicket());
		}
		if (p.giveTicket() == t.list[1]) {
			l2.add(p.giveTicket());
		}
		if (p.giveTicket() == t.list[2]) {
			l3.add(p.giveTicket());
		}
		if (p.giveTicket() == t.list[3]) {
			l4.add(p.giveTicket());
		}
		if (p.giveTicket() == t.list[4]) {
			l5.add(p.giveTicket());
		}
	}

	public void gatePass(FestivalAttendeeThread person) {
		filter(person);
		list.add(person.giveTicket());
	}

}
