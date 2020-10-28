package com.shsxt.demo;

public class TableBuble {
    Buble buble;

    public TableBuble(Buble buble) {
        this.buble = buble;
    }

    public Buble getBuble() {
        return buble;
    }

    public void setBuble(Buble buble) {
        this.buble = buble;
    }
    public void open(){
        buble.open();
    }
    public void close(){
        System.out.println("关灯");
    }
}
