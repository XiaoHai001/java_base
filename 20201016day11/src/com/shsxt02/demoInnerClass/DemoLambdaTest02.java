package com.shsxt02.demoInnerClass;

public class DemoLambdaTest02 {
    public static void main(String[] args) {
        Write write=new Write() {
            @Override
            public String writeStr(String str, int i) {
                String s="";
                for (int j = 0; j <i ; j++) {
                    s+=str;
                }
                return s;
            }
        };
        System.out.println(write.writeStr("sd", 5));
    }
}
interface Write{
    String writeStr(String str,int i);
}
