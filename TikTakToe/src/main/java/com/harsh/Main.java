package com.harsh;

import com.harsh.model.TIKTOKTOE;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        TIKTOKTOE game = new TIKTOKTOE();
        game.initializeGame();
        System.out.println("game winner is: " + game.startGame());
    }
}