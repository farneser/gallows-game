package com.farneser.gallows_game;

import java.util.Scanner;

public class Main {

    public static String[] GetWordList() {
        return new String[]{
                "bag", "bed", "beer", "bird", "book", "box", "bull", "car", "cassette", "castle", "cat", "computer",
                "cow", "cup", "diskette", "dog", "door", "dress", "drink", "duck", "flag", "flower", "glass", "horse",
                "house", "chair", "chicken", "jacket", "keyboard", "lamp", "lightning", "magazine", "monitor",
                "newspaper", "notepad", "paper", "pen", "pencil", "picture", "printer", "rabbit", "rain", "room",
                "scissors", "sheep", "snow", "storm", "sun", "table", "thunderbolt", "tree", "trousers",
                "videorecorder", "wall", "water", "wind", "window",
        };
    }

    public static void main(String[] args) {

        var menu = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:\n1: Gallows Game\n2: Exit");
            String choose = menu.nextLine();

            switch (choose) {
                case "1" -> {
                    var game = new Game(GetWordList());
                    game.startGameCycle();
                }
                case "2" -> System.exit(1);
                default -> {
                }
            }
        }
    }
}

