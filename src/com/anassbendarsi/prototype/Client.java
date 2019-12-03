package com.anassbendarsi.prototype;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Shape shape = new Shape(1, 2);
        Shape shape1 = shape.clone();

        System.out.println(shape + " " + shape1);
        System.out.println(shape == shape1);
    }
}
