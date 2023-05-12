package com.startjava.lesson_2_3_4.animal;
import com.startjava.lesson_2_3_4.animal.Wolf;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setSex("самец");
        wolf.setName("Роан");
        wolf.setWeight(24.3);
        wolf.setAge(2);
        wolf.setColor("серый");
        System.out.println("Пол волка: " + wolf.getSex() + "\nКличка: " + wolf.getName() +
                "\nВозраст: " + wolf.getAge() + "\nВес: " + wolf.getWeight() + "\nЦвет: " + wolf.getColor());
        wolf.move();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}