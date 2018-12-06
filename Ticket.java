//Ticket superclass

public abstract class Ticket {
	
	private int tnumber; //ticket number
	
    public Ticket(int tnumber) {
    	this.tnumber = tnumber;
    	}
    
    public int getNumber() {
    	return tnumber;
    	}
    
    public abstract double getPrice();
    public abstract String toString();
}