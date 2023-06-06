package ObservorDesignPattern;

public class ScoreCardDisplay implements Observor {


    @Override
    public void update(Subject s) {
        display((CricketData) s);
    }

    public void display(CricketData d) {
        System.out.println("ScoreCardDisplay  ============= ");

        System.out.println(" Runs - " + d.getRuns());
        System.out.println(" WIcket - " + d.getWicket());
        System.out.println(" Overs - " + d.getOvers());


    }
}
