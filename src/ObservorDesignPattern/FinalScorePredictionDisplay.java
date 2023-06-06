package ObservorDesignPattern;

public class FinalScorePredictionDisplay implements Observor {
    @Override
    public void update(Subject s) {
        display((CricketData) s);
    }

    private void display(CricketData s) {
        System.out.println("FinalScorePredictionDisplay  ============= ");
        if (s.getWicket() == 0) {

            double nrr = s.getRuns() * 1.0 / s.getOvers();
            int pfscore = (int) nrr * 50;
            System.out.println("Predicted final score " + pfscore);

        } else {
            double rpw = s.getRuns() * 1.0 / s.getWicket();
            int pfscore = (int) rpw * 50;

            System.out.println("Predicted final score " + pfscore);
        }
    }
}
