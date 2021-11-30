public class MusicClient{
    public static void main(String args[]) {
          MusicPlayerFacade player = new MusicPlayerFacade();
          System.out.println("calling player");
          player.play("mp3","Song Link");        
    }
}