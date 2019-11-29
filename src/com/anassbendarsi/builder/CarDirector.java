package com.anassbendarsi.builder;

public class CarDirector {

    ICarBuilder carBuilder;

    public CarDirector(ICarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public void buildCar() {
        carBuilder.buildWheels();
        carBuilder.buildColor();
        carBuilder.buildChairs();
        carBuilder.buildEngine();
    }
}
