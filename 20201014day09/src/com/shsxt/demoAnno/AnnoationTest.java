package com.shsxt.demoAnno;

public class AnnoationTest {
    @DefineAno(min = 6,max = 10,description = "名字长度在6到10之间")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
