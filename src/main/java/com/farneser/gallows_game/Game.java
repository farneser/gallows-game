package com.farneser.gallows_game;

import java.util.*;

public class Game {
    private final String[] _words;

    public Game(String[] words) {
        _words = words;
    }

    private String getRandomWord() {
        return _words[new Random().nextInt(0, _words.length)];
    }

    public void startGameCycle() {
        var printer = new GamePrinter(6);
        var scanner = new Scanner(System.in);
        var word = new SecretWord(getRandomWord());

        var usedLetters = new ArrayList<Character>();

        while (printer.getAttempts() > 0) {
            printer.printState(word, usedLetters);

            var letter = scanner.next().charAt(0);

            var isCharUsed = false;
            for (var character : usedLetters) {
                if (character == letter) {
                    isCharUsed = true;
                    break;
                }
            }

            if (isCharUsed) {
                continue;
            } else {
                usedLetters.add(letter);
            }

            if (word.openLetter(letter)) {
                if (word.isComplicated()) {
                    System.out.println("You win!!!");
                    break;
                }
                System.out.println(word);
            } else {
                printer.decrement();
            }
        }

        if (printer.getAttempts() == 0) {
            System.out.println("You die(((");
        }

    }

}
