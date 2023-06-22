package StateDesignPattern.Solutions;

public class Mp3PlayingState extends AudioPlayerState {
    @Override
    public void pressPlay(AudioPlayer p1) {
        System.out.println("Playing mp3");
        p1.state = new Mp3PlayingState();
    }

    @Override
    public void pressChangeSource(AudioPlayer p1) {
        System.out.println("Setting source to radio ");
        p1.state = new RadioState();
    }
}
