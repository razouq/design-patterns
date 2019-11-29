package com.anassbendarsi.builder;

public class R4 extends Car{

    private Integer wheels;
    private String color;
    private Integer chairs;
    private String engine;

    public R4() {
    }

    @Override
    public Integer getWheels() {
        return wheels;
    }

    @Override
    public void setWheels(Integer wheels) {
        this.wheels = wheels;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public Integer getChairs() {
        return chairs;
    }

    @Override
    public void setChairs(Integer chairs) {
        this.chairs = chairs;
    }

    @Override
    public String getEngine() {
        return engine;
    }

    @Override
    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "R4{" +
                "wheels=" + wheels +
                ", color='" + color + '\'' +
                ", chairs=" + chairs +
                ", engine='" + engine + '\'' +
                '}';
    }
}
