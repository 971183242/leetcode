package main.java8.lambda;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        TheInterface1 interface1 = () -> {};
        System.out.println(interface1.getClass().getInterfaces()[0]);
        /**lambda 表达式的类型，一定要根据上下文才能推断出来
         * lambda表达式本身并不关心具体实现的是什么方法*/

        new Thread(()-> System.out.println("Using Lambda to init thread")).start();
        List<String> list = Arrays.asList("hello","world");
        list.forEach(item -> System.out.println(item.toUpperCase()));
        List<String> list2 = list.stream().map(item -> item.toUpperCase()).collect(Collectors.toList());
        System.out.println(list2);
        //map，给定一个值，映射一个值
        list.stream().map(String::toUpperCase).forEach(System.out::println);

        //list.stream()//串行流
        //list2.parallelStream()//并行流

        Function<String,String> function = String::toUpperCase;
        System.out.println(function.getClass().getInterfaces()[0]);

        //实例方法：
        //静态方法：




    }


    @FunctionalInterface
    interface TheInterface1{
        void myMethod();
    }

    @FunctionalInterface
    interface TheInterface2{
        void myMethod2();
    }
}
