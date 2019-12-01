package com.anassbendarsi.singleton;

public class Client {
    public static void main(String[] args) {

        // option 1
        DB db = DB.getInstance();
        db.test();

        // option 2
        DBBillPugh dbBillPugh = DBBillPugh.getInstance();
        dbBillPugh.test();
    }
}
