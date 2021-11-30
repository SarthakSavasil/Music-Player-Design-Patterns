import java.io.File;

import adapterpattern.AudioPlayer;
import playpausecommand.PlayPauseFunctionality;

public class MusicPlayerFacade {
    Player player = new Player();
    // FileLoader loader = new FileLoader();
    FileLoader loader = new FileLoader();
    AudioPlayer audioPlayer = new AudioPlayer();

   //giving all responsibility to this single method
    public void play(String ext, String fileName) {
            System.out.println("Starting");
            
            File musicFile = loader.withName("SongName").withArtist("artistName")
                                                    .withDur(100)
                                                    .withMovieName("Song Movie Name")
                                                    .loadFile(fileName);
           
            PlayPauseFunctionality ppf = new PlayPauseFunctionality();
            ppf.playPause();
            //action listeners to be used in playpausefunctionality
            Decoder decoder = new Decoder();
            byte[] stream = decoder.decode(musicFile);  
            audioPlayer.play(ext, fileName);
            player.init();
            player.startStreaming(stream);
            player.showTitle(fileName);  
            player.showDuration(15);     
            

    }
}