package ru.mirea.gib04.lab3.practice;

 public class Circle extends Shape {
    private double radious;

     public Circle(String color,boolean filled,double radious) {
         super(color, filled);
         this.radious = radious;
     }

     public Circle(double radious) {
         this.radious = radious;
     }
     public Circle () {
         this.radious=0.0;
     }

     public double getRadious() {
         return radious;
     }

     public void setRadious(double radious) {
         this.radious = radious;
     }

     @Override
     public double getArea() {
         double ac=radious*radious*Math.PI;
         return ac;
     }

     @Override
     public double getPerimeter() {
         double ac=radious*Math.PI;
         return ac;
     }

     @Override
     public String toString() {
         return "Circle{" +
                 "radious=" + radious +
                 ", color='" + color + '\'' +
                 ", filled=" + filled +
                 '}';
     }
 }
