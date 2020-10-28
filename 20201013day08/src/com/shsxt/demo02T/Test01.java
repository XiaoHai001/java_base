package com.shsxt.demo02T;

import java.util.ArrayList;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {
        List<? super   Animal>list=new ArrayList<>();
        list.add(new Animal());
        list.add(new Cat());
        System.out.println(list.get(1));

    }


}
