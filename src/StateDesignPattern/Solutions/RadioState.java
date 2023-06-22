package StateDesignPattern.Solutions;


public class RadioState extends AudioPlayerState {
    @Override
    public void pressPlay(AudioPlayer p1) {
        System.out.println("Changing station");
    }

    @Override
    public void pressChangeSource(AudioPlayer p1) {
        System.out.println("Setting source to  MP3");
        p1.state = new Mp3PausedState();
    }
}
