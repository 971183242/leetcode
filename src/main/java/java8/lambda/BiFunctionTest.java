package main.java.java8.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionTest {
    public static void main(String[] args) {
        BiFunctionTest test = new BiFunctionTest();
        System.out.println(test.math(1, 2, (a, b) -> a + b));
        System.out.println(test.compute(2, 3, (a, b) -> a + b, i -> i*i));//25
        /**BiFunction 没有compose方法
         * 因为BiFunction 要两个参数，
         * 如果要实现compose方法，那返compose方法返回的结果一定要是BiFunction
         * 所以限制性的方法回要返回两个参数才可以
         * 但是BiFunction执行完之后，之后返回一个参数
         * */
    }

    public int math(int a, int b, BiFunction<Integer, Integer, Integer> biFunction) {
        return biFunction.apply(a, b);
    }

    public int compute(int a, int b, BiFunction<Integer, Integer, Integer> biFunction, Function<Integer, Integer> function) {
        return biFunction.andThen(function).apply(a, b);
    }
}
