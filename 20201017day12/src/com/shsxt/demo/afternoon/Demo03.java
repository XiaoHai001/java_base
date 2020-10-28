package com.shsxt.demo.afternoon;

import java.io.*;

public class Demo03 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("f.txt"));
        oos.writeObject(new Person("zdf",20,true));
        oos.flush();
        oos.close();

        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("f.txt"));
        Person p = (Person)ois.readObject();
        System.out.println(p.getName());
        System.out.println(p);
        ois.close();
    }
}
