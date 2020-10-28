package com.shsxt.demo.am;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

public class Test01 {
    public static void main(String[] args) throws DocumentException {
        File file=new File("person.xml");
        SAXReader reader=new SAXReader();
        Document read = reader.read(file);
        System.out.println(read.getRootElement().getName());
        Element rootElement = read.getRootElement();
        List<Element> elements = rootElement.elements();
        for (Element element : elements) {
            System.out.println(element.getName());
            Attribute id = element.attribute("id");
            //id.getData()
            List<Element> elements1 = element.elements();
            for (Element element1 : elements1) {
                String name = element1.getName();
                Attribute attribute = element1.attribute(0);
                System.out.println(name+"   =   "+attribute);
            }
            System.out.println("-----------------");
        }

    }
}
