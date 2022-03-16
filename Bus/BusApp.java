package Bus;
import java.util.Scanner;
public class BusApp {
    
    private static final Scanner sc = new Scanner(System.in);

    private static final Bus bus = new Bus(44, 29, "DPMLJ");
    private static final int nZastavek = 8;
   
    public static void main(String[] args) {
        for (int i=1; i<nZastavek; i++) {
            outIn(i);
        }
        konecna();
    }    
    private static void outIn(int i) {
        System.out.format("%d. zastavka%n", i);
        System.out.println(bus);
        
        System.out.print("Zadej, kolik lidi chce vystoupit a kolik nastoupit: ");
        System.out.println("");
        int getOut = sc.nextInt();
        int getIn = sc.nextInt();
        if (!bus.getOut(getOut)) {
            getOut = bus.getPassengers();
            bus.getOutAll();
            System.out.format("Vystoupit mohlo jenom %d%n", getOut);
        }
        if (!bus.getIn(getIn)) {
            getIn = bus.getFreeSeats();
            bus.getIn(getIn);
            System.out.format("Nastoupit mohlo jenom %d%n", getIn);
        }        
        System.out.println(bus);
        System.out.println();
    }    
    private static void konecna() {
        System.out.format("%d. zastavka. Konecna%n", nZastavek);
        System.out.println(bus);
        bus.getOutAll();
        System.out.println();
        System.out.println(bus);
    }
    
}
