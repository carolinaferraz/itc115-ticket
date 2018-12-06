
public class StudentAdvance extends Advance {
	
	private int days;

    public StudentAdvance (int tnumber, int days) {
        super(tnumber);
        this.days = days;
        }
    
    public double getPrice() {  	
    	if(days >= 10)
    	return 15;
    	else
        return 20;
    	}

    public String toString() {
        return ("Number: " + getNumber() +", Price: " + getPrice());
        }
}