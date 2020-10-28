package com.shsxt.demo.night.dateObjectDemo;

import java.io.*;

public class Test02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream ou=new ObjectOutputStream(new FileOutputStream("c.txt"));
        ou.writeObject(new Person("lishihai",18));
        ou.flush();
        ou.close();
        ObjectInputStream in=new ObjectInputStream(new FileInputStream("c.txt"));
        Person person = (Person) in.readObject();
        System.out.println(person);
        OutputStream ouw=new FileOutputStream("a.txt",true);
    }
}
