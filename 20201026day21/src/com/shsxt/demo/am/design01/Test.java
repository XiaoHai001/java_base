package com.shsxt.demo.am.design01;

public class Test {
    public static void main(String[] args) {

        new Thread(()->{
            SingleTest01.getObj();
        }).start();
        new Thread(SingleTest01::getObj).start();
        new Thread(SingleTest01::getObj).start();
        new Thread(SingleTest01::getObj).start();
        new Thread(SingleTest01::getObj).start();
    }
}
