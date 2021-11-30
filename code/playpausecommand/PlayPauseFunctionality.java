package playpausecommand;
public class PlayPauseFunctionality {  
    public void playPause() {  
        Song song = new Song();  
          
        Command clickPlay = new PlayMusicCommand(song);  
        Command clickPause = new PauseMusicCommand(song);  
        
        clickPlay.execute();
        clickPause.execute();
   }  
}  