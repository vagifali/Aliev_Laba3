package ru.mirea.lab3.practice;

public class Cat extends Human implements Doable {
    private int v;

    public Cat(String name, int age, int vv) {
        super(name, age);
        this.v = vv;
    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name = " + name +
                " Возраст = " + age +
                "v=" + v +
                '}';
    }
    public void say () {
        System.out.println("мяу");
    }
    public void jump () {
        System.out.println("прыжок на крышу");
    }
}
