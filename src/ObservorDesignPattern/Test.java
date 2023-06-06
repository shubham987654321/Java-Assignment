package ObservorDesignPattern;

public class Test {

    public static void main(String[] args) {
        CricketData cd = new CricketData();
        cd.setOvers(10);
        cd.setRuns(50);
        cd.setWicket(1);
        cd.setData(50,1,7);

        // List of Observers
        ScoreCardDisplay scd = new ScoreCardDisplay();
        NetRunRateDisplay nrrd = new NetRunRateDisplay();
        FinalScorePredictionDisplay fsd = new FinalScorePredictionDisplay();

        cd.register(scd);
        cd.register(nrrd);
        cd.register(fsd);

        cd.setData(100,2,30);
        cd.setData(150,3,35);

        System.out.println("--------------------");
        cd.unRegister(fsd);
        cd.setData(200,5,45);
    }
}
