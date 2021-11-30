package playpausecommand;

public class PauseMusicCommand implements Command{  
    private Song song;  
    public PauseMusicCommand(Song song) {  
         this.song = song;  
    }  
     @Override  
     public void execute() {  
         song.pause();  
    }  
}