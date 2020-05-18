package main.java.java8.lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaIntroduce {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        list.forEach(item -> System.out.println(item));//lambda

        /**在java中，Lambda表达式其实是一类特别的对象————函数式接口。
         * 在其他语言中，把lambda表达式当作是函数*/
        list.forEach(System.out::println);//method reference

    }

}
