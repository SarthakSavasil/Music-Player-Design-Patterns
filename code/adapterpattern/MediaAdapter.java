package adapterpattern;

public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMusicPlayer;
 
    public MediaAdapter(String audioType){
      //Implementing factory pattern to create instances of VlcPlayer and Mp4Player 
      
       if(audioType.equalsIgnoreCase("vlc") ){
          advancedMusicPlayer = new VlcPlayer();			
          
       }else if (audioType.equalsIgnoreCase("mp4")){
          advancedMusicPlayer = new Mp4Player();
       }	
    }
    // STRATEGY PATTERN
    @Override
    public void play(String audioType, String fileName) {
    
       if(audioType.equalsIgnoreCase("vlc")){
          advancedMusicPlayer.playVlc(fileName);
       }
       else if(audioType.equalsIgnoreCase("mp4")){
          advancedMusicPlayer.playMp4(fileName);
       }
    }
 }