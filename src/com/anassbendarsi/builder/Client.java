package com.anassbendarsi.builder;

public class Client {
    public static void main(String[] args) {

        // build new car
        CarBuilderR4 carBuilderR4 = new CarBuilderR4();
        CarDirector carDirector = new CarDirector(carBuilderR4);
        carDirector.buildCar();
        Car r4 = carBuilderR4.getCar();

        System.out.println(r4.toString());
    }
}
