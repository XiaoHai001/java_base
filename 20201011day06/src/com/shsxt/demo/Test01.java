package com.shsxt.demo;

public class Test01 {
    public static void main(String[] args) {
        Buble buble=new GreenBuble();
        buble.open();
        Buble buble1 = new Buble();
        TableBuble tableBuble = new TableBuble(buble1);
        tableBuble.open();


    }
}
