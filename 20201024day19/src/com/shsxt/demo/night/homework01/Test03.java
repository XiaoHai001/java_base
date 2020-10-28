package com.shsxt.demo.night.homework01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test03 {
    static List<Product>list= Arrays.asList(
            new Product("1001", "鞋子", 100),
            new Product("1002", "鞋子", 200),
            new Product("1003", "手机", 150),
            new Product("1004", "手机", 50),
            new Product("1005", "鞋子", 180));

    public static void main(String[] args) {
        Stream<Product> stream = list.stream();
        test02(stream);

    }
    public static void test02(Stream<Product>stream){
        stream = stream.filter((v) -> {
            return "手机".equals(v.getType()) ? true : false;
        });

        List<Product> collect = stream.collect(Collectors.toList());
        System.out.println(collect.size());
        stream.forEach((v)->{});  //关闭
    }

    public static void test01(Stream<Product>stream){
        stream = stream.filter((v) -> {  //过滤不是鞋子的；
            if ("鞋子".equals(v.getType())) {
                return true;
            }
            return false;
        });
        stream = stream.sorted((v, t) -> {          //销量递增排序
            return Double.compare(v.getSalesNum(), t.getSalesNum());
        });
        stream.forEach(System.out::println);   //终止
    }

}
class Product{
    private String id;
    private String type;
    private double salesNum;

    public Product() {
    }

    public Product(String id, String type, double salesNum) {
        this.id = id;
        this.type = type;
        this.salesNum = salesNum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSalesNum() {
        return salesNum;
    }

    public void setSalesNum(double salesNum) {
        this.salesNum = salesNum;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", salesNum=" + salesNum +
                '}';
    }
}
