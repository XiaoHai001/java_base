package com.shsxt.demoInnterClass;

public class Test01 {
    public static void main(String[] args) {
        int x=3;
        int y=4;
        A a=(int t1,int t2)->{
            System.out.println(x*y);
        };
        a.test(x,y);
        A b=(int t1,int t2)->{
            System.out.println(Math.pow(x,y));
        };
        b.test(x,y);

        A c=new A() {
            @Override
            public void test(int a, int b) {
                System.out.printf("%-4d,%-4d",a,b);
            }
        };
        c.test(3,4);

    }


}
interface A{
    public void test(int a,int b);

}
