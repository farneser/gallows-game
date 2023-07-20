package com.farneser.gallows_game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class SecretWord {
    private final String _secretWord;
    private final ArrayList<Character> _correctChars = new ArrayList<>();

    public SecretWord(String secretWord) {
        this._secretWord = secretWord;
    }

    public String getWord() {
        var newWord = new StringBuilder();

        for (var letter : _secretWord.toCharArray()) {

            if (_correctChars.contains(letter)) {
                newWord.append(letter);
            } else {
                newWord.append("_");
            }

        }
        return newWord.toString();
    }

    public boolean openLetter(Character character) {
        for (var letter : _secretWord.toCharArray()) {
            if (character == letter) {
                _correctChars.add(letter);
                return true;
            }
        }
        return false;
    }

    public boolean isComplicated() {
        return new HashSet<>(Arrays.asList(_secretWord.split(""))).toArray().length == _correctChars.toArray().length;
    }

    @Override
    public String toString() {
        return getWord();
    }
}
