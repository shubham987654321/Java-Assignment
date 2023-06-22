package StateDesignPattern.Solutions;

public class StandByState extends AudioPlayerState {
    @Override
    public void pressPlay(AudioPlayer p1) {
        System.out.println("Invalid Operation");
    }

    @Override
    public void pressChangeSource(AudioPlayer p1) {
        System.out.println("Setting Source to radio");
        p1.state= new RadioState();
    }
}
