package ru.mirea.lab3.practice;

public class Main {
    public static void main(String[] args) {
        Human r =  new Human("Rocco", 10);
        System.out.println(r);
        Cat v = new Cat("Matilda", 5,4);
        System.out.println(v);
        v.say();
        v.jump();
        r.say();
        r.jump();
        Parrot p1 = new Parrot("Female");
        System.out.println(p1);
        Circle c = new Circle("red",true,1.3);
        System.out.println(c);
        System.out.println(c.getArea());
        System.out.println(c.getPerimeter());
            }
}
