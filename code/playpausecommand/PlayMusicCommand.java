package playpausecommand;

public class PlayMusicCommand implements Command{  
    private Song song;  
    public PlayMusicCommand(Song song) {  
        this.song = song;  
    }  
    @Override  
    public void execute() {  
        song.play();  
    }  
}  