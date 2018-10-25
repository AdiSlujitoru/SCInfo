import java.util.*;

public class FestivalStatisticsThread implements Runnable {

	private FestivalGate gate;
	int i = 0;

	public FestivalStatisticsThread(FestivalGate gate) {
		this.gate = gate;

	}

	public void read(Thread t1) {
		try {
			while (t1.isAlive()) {
				Thread.sleep(5000);
				System.out.println(gate.getL().size() + " people entered");
				System.out.println(gate.getL1() + " people have full tickets");
				System.out.println(gate.getL2() + " have free passes");
				System.out.println(gate.getL3() + " have full VIP passes");
				System.out.println(gate.getL4() + " have one-day passes");
				System.out.println(gate.getL5() + " have one-day VIP passes \r\n");
			}
		} catch (Exception e) {
		}

	}

	public void run() {
		FestivalAttendeeThread p = new FestivalAttendeeThread(new TicketType(), gate);
		Thread t1 = new Thread(p);
		t1.start();

		read(t1);

	}

}
