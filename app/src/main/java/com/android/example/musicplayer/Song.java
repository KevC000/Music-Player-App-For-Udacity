package com.android.example.musicplayer;

public class Song {

    private String name;
    private String artist;
    private String duration;
    private int image;
    private String link;

    public Song(String name,String artist,String duration,int image){
        this.name=name;
        this.artist=artist;
        this.duration=duration;
        this.image=image;
    }

    public Song(String name,String artist,String duration,int image,String link){
        this.name=name;
        this.artist=artist;
        this.duration=duration;
        this.image=image;
        this.link=link;
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public String getDuration() {
        return duration;
    }

    public int getImage() {
        return image;
    }

    public String getLink() {
        return link;
    }


}
