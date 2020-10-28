package com.shsxt.demo.pm;

import com.shsxt.demo.homework.work01.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

public class Test01 {
    static List<Employee> emps = Arrays.asList(
            new Employee("张三", 18),
            new Employee("李四", 38),
            new Employee("王五", 50),
            new Employee("赵六", 16),
            new Employee("田七", 28) );
    public static void main(String[] args) {
        Stream<Employee> employeeStream = emps.parallelStream();
        Optional<Employee> any = employeeStream.findAny();
        System.out.println(any);
        Stream<Employee> booleanStream = employeeStream.map((a) ->{
           return new Employee();
        });
        System.out.println(booleanStream);
    }
}
