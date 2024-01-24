package ru.agabekova;

import java.util.List;

public class Hippodrome {
    private List<Horse> horses;

    public List<Horse> getHorses(){
        return horses;
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }
    public void move(){
        horses.forEach(horse -> horse.move());
    }
    public void print(){
        horses.forEach(horse -> horse.print());
        for (int i = 0; i < 10; i++) {
            System.out.println("");
        }
    }

    public Horse getWinner() {
        int winner = 0;
        for (int i = 0; i < horses.size(); i++) {
            if (horses.get(i).distance > horses.get(winner).distance) winner = i;
        }
        return horses.get(winner);
    }

    public void printWinner(){
        System.out.println("Winner is " + getWinner().name +"!");
    }

}
