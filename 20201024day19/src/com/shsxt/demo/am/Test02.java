package com.shsxt.demo.am;

import com.shsxt.demo.homework.work01.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test02 {
    static List<Employee> emps = Arrays.asList(
            new Employee("张三", 18),
            new Employee("李四", 38),
            new Employee("王五", 50),
            new Employee("赵六", 16),
            new Employee("田七", 28) );
    public static void main(String[] args) {
        Stream<Employee> stream = emps.stream();
        Stream<Employee> s = stream.filter((v) -> {
            System.out.println("--------过滤一-------");
            return v.getAge() >= 18;
        });
        s=s.filter((v)->{
            System.out.println("---------过滤二---------");
            return !"田七".equals(v.getName());
        });
        s=s.limit(2);
        System.out.println("sansna");
        s=s.skip(1);
        //终止条件
        s.forEach(System.out::println);

    }
}
