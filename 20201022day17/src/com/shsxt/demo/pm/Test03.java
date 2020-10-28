package com.shsxt.demo.pm;

public class Test03 {
    public static void main(String[] args) {
        say();
    }
    @Deprecated
    public static void say(){
        System.out.println("opopop");
    }
}
class G{
    public void say(){

    }
}
class H extends G{
    @Override
    public void say(){

    }
}
