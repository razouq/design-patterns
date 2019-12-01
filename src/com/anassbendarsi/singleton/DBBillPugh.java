package com.anassbendarsi.singleton;

public class DBBillPugh {

    private DBBillPugh() {
    }

    public void test() {
        System.out.println("test function bill pugh");
    }

    private static class DBBillPushHelper {
        public static final DBBillPugh INSTANCE = new DBBillPugh();
    }

    public static DBBillPugh getInstance() {
        return DBBillPushHelper.INSTANCE;
    }
}
