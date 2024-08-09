package spotify;

import songdetails.Song;

public class Spotify {

        public Song song;
        public int number;

        public boolean allow(Song song){
            boolean isPlayed=false;
            if(number==1){
                System.out.println("SONG STARTED");
                if(song!=null){
                    this.song=song;
                    this.song.getDetails();
                    isPlayed=true;
                    System.out.println("Song is being  played now........");
                }
                else
                    System.out.println("ERROR,SONG NOT FOUND");
                System.out.println("SONG ENDED");

            }
            else System.out.println("Song not played");
            return isPlayed;

        }
    }


