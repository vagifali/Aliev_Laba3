package ru.mirea.gib04.lab3.practice;

public class Human implements Doable {
    protected String name;
    protected int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public void say () {
        System.out.println("хаю хай");
    }
    public void jump () {
        System.out.println("прыжок на скамейку");
    }
}
