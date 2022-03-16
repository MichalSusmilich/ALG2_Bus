package Bus;
public class Bus {
    
    int seats = 40;
    int line = 0;
    String company = "";
    int passengers = 0;
    
    public Bus(int nSeats, int line, String company) {
        this.seats = nSeats;
        this.line = line;
        this.company = company;
    }        
    public int getNum() {
        return line;
    }
    public String getCompany() {
        return company;
    }
    public int getSeats() {
        return seats;
    }
    public int getPassengers() {
        return passengers;
    }
    public void setLine(int line) {
        this.line = line;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    @Override
    public String toString() {
        return String.format("Autobus cislo %d spolecnosti %s s poctem sedadel %d veze %d cestujicich.",
                line, company, seats, passengers
        );
    }    
    public int getFreeSeats() {
        return seats - passengers;
    }    
    public boolean getIn(int getIn) {
        if (getIn > this.getFreeSeats()) {
            return false;
        }
        
        this.passengers += getIn;
        return true;
    }    
    public boolean getOut(int getOut) {
        if (getOut > this.passengers) {
            return false;
        }
        
        this.passengers -= getOut;
        return true;
    }    
    public void getOutAll() {
        this.getOut(this.passengers);
    }
}
