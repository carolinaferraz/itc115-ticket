
public class WalkUp extends Ticket {
	
	public WalkUp(int tnumber) {
    super(tnumber);
	}

	public double getPrice() {
		return 50;
		}

	public String toString() {
		return ("Number: " + getNumber() + ", Price: " + getPrice());
		}
}
