package StateDesignPattern.Solutions;

public class AudioPlayer {
//    String state;

    AudioPlayerState state ;
    public AudioPlayer(){
       // this.state = "standby";
        this.state = new StandByState();
    }

    public  void pressPlay(){
        this.state.pressPlay(this);

    }


    public void  pressChangeSource(){

        this.state.pressChangeSource(this);
    }


}
