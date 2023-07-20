package com.farneser.gallows_game;

import java.util.ArrayList;

public class GamePrinter {

    private int _attempts;

    public GamePrinter(int attempts) {
        _attempts = attempts;
    }

    public int getAttempts() {
        return _attempts;
    }

    public void decrement() {
        _attempts--;
    }

    public void printState(SecretWord word, ArrayList<Character> usedCharacters) {
        final String combClear = "\033[H\033[2J";
        System.out.print(combClear);
        System.out.flush();

        System.out.println("--- Game ---");
        System.out.println(getAttempts());
        System.out.println(GameStates.States[GameStates.States.length - _attempts]);
        System.out.println(word);
        System.out.println(usedCharacters);

    }
}
