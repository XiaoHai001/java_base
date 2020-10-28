package com.shsxt.demo.pm;

import org.dom4j.*;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;


public class Test01 {
    public static void main(String[] args) throws Exception {
        SAXReader reader=new SAXReader();
        Document read = reader.read("person.xml");
        //write(read,new File("copy.xml"));
        //writeAll(new File("coo.xml"));

        write(addEle(read),new File("person.xml"));


    }
    public static void write(Document document,File file) throws Exception {
        OutputFormat format=OutputFormat.createPrettyPrint();
        FileOutputStream out=new FileOutputStream(file);
        XMLWriter xmlWriter = new XMLWriter(out, format);
        xmlWriter.write(document);

    }
    public static void writeAll(File file) throws Exception {
        SAXReader reader=new SAXReader();
        Document document = DocumentHelper.createDocument();
        Element sxt = document.addElement("sxt");
        Element bjsxt = sxt.addElement("bjsxt");
        Element name = bjsxt.addElement("name");
        name.addAttribute("id", "01");
        name.addText("lsh");
        Element age = bjsxt.addElement("age");
        age.addText("18");
        //id.setText("01");
        write(document,file);
    }
    public static Document addEle(Document document){
        Element rootElement = document.getRootElement();
        List<Element> elements = rootElement.elements("Person");
        elements.forEach((v)->{
            if ("person".equals(v.getName())){
                System.out.println(1);
                if ("1".equals(v.attribute("id"))){
                    System.out.println(2);
                    Element idd = v.addElement("idd");
                    idd.addText("210");
                }
            }
        });
        return document;
    }
}
