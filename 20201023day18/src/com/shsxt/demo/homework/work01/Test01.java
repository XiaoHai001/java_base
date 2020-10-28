package com.shsxt.demo.homework.work01;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.lang.reflect.Constructor;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test01 {
    public static void main(String[] args) throws Exception {
        SAXReader reader=new SAXReader();
        Document document = reader.read(new File("src\\employee.xml"));
        Set<Employee> test = test(document);
    }
    public static Set<Employee> test(Document document) throws Exception {
        //得到根标签
        Element rootElement = document.getRootElement();
        //得到根标签下的所有标签
        List<Element> elements = rootElement.elements();
        //用来装employee对象
        HashSet<Employee> set = new HashSet<>();
        //遍历子标签
        for (Element element : elements) {
            //得到子标签的子标签
            List<Element> elements1 = element.elements();
            //得到数据
            String name = elements1.get(0).getText();
            int age= Integer.parseInt(elements1.get(1).getText());
            String text1 = elements1.get(2).getText();
            boolean gender="男".equals(text1)?true:false;
            //反射创建对象
            Class<?> aClass = Class.forName("com.shsxt.demo.homework.work01.Employee");
            //得到构造器
            Constructor<?> declaredConstructor = aClass.getDeclaredConstructor(String.class, int.class, boolean.class);
            Employee employee = (Employee) declaredConstructor.newInstance(name, age, gender);
            set.add(employee);
        }
        return  set;
    }
}
