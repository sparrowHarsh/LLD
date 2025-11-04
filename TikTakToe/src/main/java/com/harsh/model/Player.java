package com.harsh.model;

public class Player {
    String name;
    PlayingPiece playingPiece;

    public Player(String name, PlayingPiece playingPiece){
        this.name = name;
        this.playingPiece = playingPiece;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public PlayingPiece getPlyaingPiece(){
        return playingPiece;
    }

    public void setPlayingPiece(PlayingPiece playingPiece){
        this.playingPiece = playingPiece;
    }
}
