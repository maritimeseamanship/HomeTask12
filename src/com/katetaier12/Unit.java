package com.katetaier12;

public class Unit {

    protected int x;
    protected int y;
    protected boolean destroyable = true;

    public Unit(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isDestroyable() {
        return destroyable;
    }

    @Override
    public String toString() {
        return "Unit{" + "x=" + x + ", y=" + y + ", destroyable=" + destroyable + '}';
    }
}
