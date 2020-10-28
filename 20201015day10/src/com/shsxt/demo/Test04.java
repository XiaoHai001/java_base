package com.shsxt.demo;

import java.util.ArrayList;
import java.util.List;

public class Test04 {
    public static void main(String[] args) {
        // 上下界 只能规定类型   数据
        List<? extends F> list  = null;
        List<Object> list1 = new ArrayList<Object>();

        List<S> list2 = new ArrayList<S>();
        list = list2;
        list2.add(new S());

    }
}

class F{

}
class S extends F{

}