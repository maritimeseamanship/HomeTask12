package com.katetaier12;

public class Soldier extends Unit {

    public Soldier(int x, int y) {
        super(x, y);
        destroyable = true;
    }

    public void move() {
        x++;
        y++;
    }

    public void fire() {
        System.out.println("Fire");
    }
}
