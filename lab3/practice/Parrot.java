package ru.mirea.lab3.practice;

public class Parrot extends Animal {
    @Override
    public void live() {
        System.out.println("Alive");
    }

    public Parrot(String sex) {
        super(sex);
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "sex='" + sex + '\'' +
                '}';
    }
}
