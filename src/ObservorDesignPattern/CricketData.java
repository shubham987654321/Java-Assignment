package ObservorDesignPattern;

public class CricketData extends Subject {
    private int runs;

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    private int overs;

    public int getOvers() {
        return overs;
    }

    public void setOvers(int overs) {
        this.overs = overs;
    }

    private int wicket;


    public int getWicket() {
        return wicket;
    }

    public void setWicket(int wicket) {
        this.wicket = wicket;
    }

    public void setData(int runs , int wickets,  int overs){
        this.setRuns(runs);
        this.setOvers(overs);
        this.setWicket(wickets);
        super.notifyObservors();
    }
}
