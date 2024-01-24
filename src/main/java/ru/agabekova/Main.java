package ru.agabekova;

import java.util.ArrayList;

public class Main {
    public static Hippodrome game;
    public static void main(String[] args) throws InterruptedException {
        Horse horse1 = new Horse("first", 3, 0);
        Horse horse2 = new Horse("second", 3, 0);
        Horse horse3 = new Horse("third", 3, 0);
        game = new Hippodrome(new ArrayList<>());
        game.getHorses().add(horse1);
        game.getHorses().add(horse2);
        game.getHorses().add(horse3);

        game.run();
        game.printWinner();
    }
}