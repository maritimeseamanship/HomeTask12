package com.katetaier12;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	/* Задана строка из английских слов через пробел. Написать метод который возвращает те же слова в
	   обратном порядке. При этом слова изменены так что в каждом слове первая буква большая а остальные маленькие.
    */
        System.out.println("The initial words: ");
        System.out.print(WordList.printTheInitialList() + "\n\n");
        System.out.println("The initial words with the first letter in uppercase: ");
        System.out.print(WordList.makeFirstLetterInUpperCase() + "\n\n");
        System.out.println("The words in reverse order: ");
        System.out.print(WordList.makeViceVersa() + "\n\n");

    /* Есть игра в которой клетчастое поле (например размером 10x10 клеток) и юниты, в одной клетке один юнит.
       Есть 4 типа юнитов: башня, забор, содат и танк.
       Забор ничего не делает и может быть разрушен;
       Башня ничего не делает и безсмертна;
       Солдат стреляет и двигается - у него можно вызвать методы move() и fire();
       Танк умеет то же что и солдат, плюс еще у него есть метод reload().
    */
        List<Unit> units = new ArrayList<>();
        units.add(new Fence(1, 2));
        units.add(new Tower(3, 4));
        Soldier soldier = new Soldier(5, 7);
        units.add(soldier);
        Tank tank = new Tank(2, 5);
        units.add(tank);

        soldier.fire();
        soldier.move();

        tank.fire();
        tank.move();
        tank.reload();

        for (Unit unit : units) {
            System.out.println(unit);
        }
    }
}