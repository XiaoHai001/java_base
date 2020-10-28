package com.shsxt.demo.singleDemo;

public class Test04 {
    public static void main(String[] args) {
        HG hg=new HG(new Actor());
        hg.play();
    }
}
interface Jijiren{
    void play();
}
class Actor implements Jijiren{
    @Override
    public void play() {
        System.out.println("yanyanyan");
    }
}
class HG implements Jijiren{
    private Actor actor;
    public HG(Actor actor){
        this.actor=actor;
    }
    @Override
    public void play() {
        System.out.println("sssss");
        actor.play();
    }
}
