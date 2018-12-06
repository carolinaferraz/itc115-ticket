
public class TicketMain {

	public static void main(String[] args) {
		Ticket t1 = new StudentAdvance(1, 8);
		Ticket walkup = new WalkUp(2);
		
		System.out.println(t1);
		System.out.println(walkup);
	}
}
