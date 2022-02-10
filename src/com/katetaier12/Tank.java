package com.katetaier12;

public class Tank extends Soldier {

    public Tank(int x, int y) {
        super(x, y);
        destroyable = true;
    }

    public void reload() {
        System.out.println("Reload");
    }
}
