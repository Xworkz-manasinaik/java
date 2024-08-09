import songdetails.Song;
import spotify.Spotify;

public class SpotifyRunner {

    public  static void main(String args[]) {

        System.out.println("MAIN METHOD STARTED");

        Spotify spotify=new Spotify();
        spotify.number = 1;

        Song song=new Song();

        song.number = 1;
        song.songName = "Dwapara";
        song.filmName = "Krishana Priya Saka";
        song.language = "Kannada";
        song.singerName = "Singh";
        song.year=2024;

        spotify.allow(song);

        System.out.println("MAIN ENDED");
    }

}






