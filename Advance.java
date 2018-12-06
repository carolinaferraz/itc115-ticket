
public class Advance extends Ticket {
	
	private int days;
	
    public Advance(int tnumber) {
        super(tnumber);
    }
    
    public Advance(int tnumber,int days) {   
        super(tnumber);
        this.days = days;
    }
    
    public double getPrice() {  
        if(days >= 10)
        return 30;
        
        else
        return 40;
    }
    
    public String toString() {
        return ("Number: " + getNumber() + ", Price: " + getPrice());    
    }
}