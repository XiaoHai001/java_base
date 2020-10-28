package com.shsxt.demo.night.demoException;

import java.util.ArrayList;
import java.util.List;

public class Test03 {
    public static void main(String[] args) {
        List<? extends String>list;
        List<String>list1=new ArrayList<>();
        list=list1;

    }
}
