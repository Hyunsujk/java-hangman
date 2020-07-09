package com.project;

public class Hangman {

    public static void main(String[] args) {
	// write your code here
        Game game = new Game("missouri");
        Prompter prompter = new Prompter(game);
        while (game.getRemainingTries() > 0) {
            prompter.displayProgress();
            prompter.promptForGuess();
        }
    }
}
