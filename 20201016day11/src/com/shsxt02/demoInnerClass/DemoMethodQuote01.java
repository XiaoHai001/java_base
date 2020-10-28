package com.shsxt02.demoInnerClass;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.function.*;

public class DemoMethodQuote01 {
    public static void main(String[] args) {
        Consumer<String> con = (s) -> {
            System.out.println(s);
        };
        con.accept("sd");
        PrintStream ps=System.out;
        Consumer<String>consumer=ps::println;
        consumer.accept("ef");


        System.out.println("------------");
        Employee employee=new Employee("zs",19);
//        Supplier<String>sup=()->{
//           return  employee.getName();
//        };
        Supplier<String>sup=employee::getName;
        System.out.println(sup.get());


        System.out.println("-------------------");
//        Comparator<Integer> com=(x,y)->{
//          return Integer.compare(x,y) ;
//        };
        //System.out.println(com.compare(2, 3));

        Comparator<Integer> com=Integer::compare;
        System.out.println(com.compare(3, 5));

        //BiPredicate<String,String>bp=(x,y)->{return x.equals(y);};
        //System.out.println(bp.test("er", "er"));
        //BiPredicate<String,String>bp=String ::equals;
        Supplier<Employee>emp=Employee::new;
        System.out.println(emp.get().getName());
        BiFunction<String,Integer,Employee> func=(x, y)->{return new Employee(x,y);};
        BiFunction<String,Integer,Employee> func2=Employee::new;
        Employee sisi = func2.apply("sisi", 78);
        System.out.println(sisi.getAge());

    }
}
