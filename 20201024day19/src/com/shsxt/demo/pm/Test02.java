package com.shsxt.demo.pm;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test02 {
    static List<Product>list=Arrays.asList(
            new Product("1001","xiezi",100),
            new Product("1002","xiezi",212),
            new Product("1003","xiezi",1020),
            new Product("1003","xiezi",1020),
            new Product("1005","sadf",123),
            new Product("1006","xiezi",34567));
    public static void main(String[] args) {
        test5();
    }
    public static void test5(){
        list.stream().map(e->e.getId()).forEach(System.out::println);
    }
    public static void test4(){
//        Stream<Object> objectStream = list.stream().flatMap((v) -> {
//            List<Character>list=new ArrayList<>();
//            for (char c : v.getId().toCharArray()) {
//                list.add(c);
//            }
//            return list.stream();
//        });
//        objectStream.forEach(System.out::println);
        Stream<Stream<Character>> streamStream = list.stream().map((v) -> {
            List<Character> list = new ArrayList<>();
            for (char c : v.getId().toCharArray()) {
                list.add(c);
            }
            return list.stream();
        });
        streamStream.forEach(ss->ss.forEach(System.out::println));
    }
    public static void test3(){
        Stream<Product> productStream = list.stream().filter((v) -> {
            return v.getSalesNum() > 200;
        });
        productStream = productStream
                .skip(1).limit(2).distinct();
        productStream.forEach(System.out::println);
    }
    public static void test2(){
        Stream<Product> stream = list.stream();
        IntStream stream1 = Arrays.stream(new int[10]);
        Stream<Object> objectStream = Stream.of(new String[]{"1", "2"});

    }
    public static void test1(){
        //1.集合流
        List<String> list=new ArrayList<>();
        Stream<String> stream = list.stream();
        Stream<String> stringStream = list.parallelStream();
        //2.数据流
        Integer[]ints=new Integer[10];
        Stream<Integer> stream1 = Arrays.stream(ints);
        //3.静态of方法
        Stream<String> aa = Stream.of("aa", "bb", "cc");

        String []str={"wq","er","ty"};
        Stream<String> str1 = Stream.of(str);



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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.salesNum, salesNum) == 0 &&
                Objects.equals(id, product.id) &&
                Objects.equals(type, product.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, salesNum);
    }
}

