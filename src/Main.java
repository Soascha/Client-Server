import utils.*;
public class Main {

    public static void main(String[] args){
        Connection c = new Connection("time-b.timefreq.bldrdoc.gov", 13);

        String Leerzeile = c.receive();
        String serverTime = c.receive();
        System.out.println("Serverzeit: " + serverTime);

        c.close();
    }
}
