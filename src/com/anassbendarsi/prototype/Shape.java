package com.anassbendarsi.prototype;

public class Shape implements Cloneable {

    public Shape(int l, int h) {
        this.l = l;
        this.h = h;
    }

    int l;
    int h;

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }


    @Override
    public Shape clone() throws CloneNotSupportedException {
        return (Shape) super.clone();
    }

    @Override
    public String toString() {
        return "Shape{" +
                "l=" + l +
                ", h=" + h +
                '}';
    }
}
