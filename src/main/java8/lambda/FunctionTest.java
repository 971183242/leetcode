package main.java8.lambda;

import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        FunctionTest test = new FunctionTest();
        System.out.println(test.compute(1,i -> 2*i));
        System.out.println(test.compute(2, i -> 5+i));
        System.out.println(test.compute(3, i -> i*i));
        //java中，思路是传递行为，提升行为的普遍性，把行为抽象为对象，本质上传递的是匿名内部类的对象
        Function<Integer,Integer> function = i -> i*i*i;
        System.out.println(test.compute(4,function));
        /**lambda表达式的作用：
         * 传递行为，而不仅仅是值
         * Detail：
         * 提升抽象层次
         * API的重用性更好
         * 更加灵活
         * */

        /**高阶函数：
         * 定义：如果一个函数，接受一个函数作为参数，或者返回一个函数作为返回值，那么该函数就叫做高阶函数
         * */
    }

    public int compute(int a, Function<Integer,Integer> functional){
        return functional.apply(a);
    }
}
