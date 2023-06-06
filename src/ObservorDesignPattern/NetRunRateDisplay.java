package ObservorDesignPattern;

public class NetRunRateDisplay implements Observor {


    @Override
    public void update(Subject s) {
        display((CricketData) s);
    }

    public void display(CricketData d) {
        System.out.println("NetRunRateDisplay  ============= ");

        System.out.println(" Runs - " + d.getRuns());
        System.out.println(" WWickets - " + d.getWicket());

        System.out.println(" Overs - " + d.getOvers());


    }
}