package songdetails;

public class Song {

    public int number;
    public String songName;

    public String filmName;
    public  String language;

    public String singerName;

    public int year;

    public void getDetails(){
        System.out.println("The Song number of the song is:" +this.number);
        System.out.println("The Song Name is:" +this.songName);
        System.out.println("The Film name is:" +this.filmName);
        System.out.println("The Language of the song is:" +this.language);
        System.out.println("The Singer Name of the song is:"+this.singerName);
        System.out.println("The published year of the song is:" +this.year);

    }
}


