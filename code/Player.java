import playpausecommand.PlayPauseFunctionality;

public class Player {
    SoundSystem sound;
    PlayPauseFunctionality ppf = new PlayPauseFunctionality();
     public void init() {
         sound = new SoundSystem();
         System.out.println("Initailising Sound Player");
     }

     public void startStreaming(byte[] stream) {
         // Start streaming
         System.out.println("Streaming Started");

     }

     public void showTitle(String title) {
         // Update gui with the title of the song
         System.out.println("Title GUI updated");

     }
  
     public void showDuration(int duration) {
         // update gui with the duration of the song
         System.out.println("GUI showduration updated");

     }
}