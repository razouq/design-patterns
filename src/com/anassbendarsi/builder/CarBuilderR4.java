package com.anassbendarsi.builder;

public class CarBuilderR4 implements ICarBuilder {

    private R4 r4;

    public CarBuilderR4() {
        this.r4 = new R4();
    }

    @Override
    public void buildWheels() {
        System.out.println("build wheels");
        this.r4.setWheels(4);
        System.out.println(this.r4.getWheels());
    }

    @Override
    public void buildColor() {
        this.r4.setColor("white");
    }

    @Override
    public void buildChairs() {
        this.r4.setChairs(4);
    }

    @Override
    public void buildEngine() {
        this.r4.setEngine("weak");
    }

    @Override
    public Car getCar() {
        return this.r4;
    }
}
