package com.anassbendarsi.singleton;

public class DB {
    private static DB db;

    private DB() {

    }

    public void test() {
        System.out.println("test function");
    }

    public static DB getInstance() {
        if(db == null) {
            db = new DB();
        }
        return db;
    }
}
