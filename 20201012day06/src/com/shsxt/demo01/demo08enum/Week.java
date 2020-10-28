package com.shsxt.demo01.demo08enum;

public enum Week {
    MONDAY(1,"libaiyi"),QUESDAY(2,"libaiyi"),WENESDAY(3,"libaiyi"),THIRDAY(1,"libaiyi"),FRIDAY(1,"libaiyi"),SATRDAY(1,"libaiyi"),SUNDAY(1,"libaiyi");

    private int i;
    private  String str;

    Week(int i, String i1) {
        this.i=i;
        this.str=i1;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
