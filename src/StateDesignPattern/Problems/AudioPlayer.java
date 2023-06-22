package StateDesignPattern.Problems;

public class AudioPlayer {
    String state;

    public AudioPlayer(){
        this.state = "standby";
    }

    public  void pressPlay(){
        if(this.state.equals("standby")){
            System.out.println("Invalid Operation");
        }else if(this.state.equals("mp3playing")){
            System.out.println("Playing mp3");
            this.state = "mp3playing";
        }else if(this.state.equals("radio")){
            System.out.println("Changing station");


        }
    }


    public void  pressChangeSource(){
        if(this.state.equals("standby")){
            System.out.println("Setting Source to radio");
            this.state = "radio";
        }else if(this.state.equals("mp3playing")){
            System.out.println("Setting source to radio ");
            this.state = "radio";
        }else if(this.state.equals("radio")){
            System.out.println("Setting source to  MP3");
            this.state  ="mp3paused";


        }
    }


}
