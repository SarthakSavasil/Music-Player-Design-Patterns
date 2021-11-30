import java.io.File;

public class FileLoader {
    String name;
    int dur;
    String artist;
    String movieName;
    //implementing builder pattern to create song file instance
    public FileLoader withName(String name) {
        this.name = name;
        return this;
     }
     
     public FileLoader withDur(int dur) {
         this.dur = dur;
         return this;
     }
     
     public FileLoader withArtist(String artist) {
         this.artist = artist;
         return this;
     }
     
     public FileLoader withMovieName(String movieName) {
         this.movieName = movieName;
         return this;
     }
     
    public File loadFile(String fileName) {
        this.name = fileName;
        return new File(fileName);
    }
}