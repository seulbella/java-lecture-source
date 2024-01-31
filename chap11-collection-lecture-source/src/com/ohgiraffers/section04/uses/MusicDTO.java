package com.ohgiraffers.section04.uses;

import java.io.Serializable;

public class MusicDTO implements Serializable {

    private static int nextId = 1;

    private int id;
    private String artist;
    private String title;

    public MusicDTO(String artist, String title) {
        this.id = MusicDTO.nextId++;
        this.artist = artist;
        this.title = title;
    }

    public MusicDTO(int id, String artist, String title) {
        this.id = id;
        this.artist = artist;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "MusicDTO{" +
                "id=" + id +
                ", artist='" + artist + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
