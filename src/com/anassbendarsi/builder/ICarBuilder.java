package com.anassbendarsi.builder;

public interface ICarBuilder {
    void buildWheels();
    void buildColor();
    void buildChairs();
    void buildEngine();
    Car getCar();
}
