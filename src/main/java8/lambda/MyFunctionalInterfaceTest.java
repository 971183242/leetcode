package main.java8.lambda;

@FunctionalInterface
interface MyFunctionalInterface {

    void test();

    String toString();
}

/**函数式接口：
 * 一个接口中有且只有一个抽象方法（且这个抽象方法不是复写Java的Object类，因为所有的类都会直接或间接继承Object）
 * 从java8开始，接口中可以有具体实现的方法
 * 函数式接口的实例可以通过lambda表达式创建、
 * 方法引用或构造方法引用来实现*
 *
 * 1、如果一个接口只有一个抽象方法，那它就是一个函数式接口
 * 2、如果我们在某个接口上声明了FunctionalInterface注解，那么编译器就会按照函数式接口的定义来要就该接口
 * 3、如果某个接口只有一个抽象方法，但是并没有给该接口声明FunctionInterface注解，那么编译器依旧会将该接口看作是函数式接口。
 * */

public class MyFunctionalInterfaceTest{
    public void test(MyFunctionalInterface functionalInterface){
        System.out.println("test1");
        functionalInterface.test();
        System.out.println("test2");
    }

    public static void main(String[] args) {
        MyFunctionalInterfaceTest functionalInterfaceTest = new MyFunctionalInterfaceTest();
        functionalInterfaceTest.test(new MyFunctionalInterface() {
            @Override
            public void test() {
                System.out.println("Functional Interface print");
            }
        });
        System.out.println("----------------------------------");
        functionalInterfaceTest.test(() -> System.out.println("Functional Interface print with lambda"));
        System.out.println("----------------------------------");
        MyFunctionalInterface myFunctionalInterface = () -> System.out.println("build Functional Interface");
        System.out.println(myFunctionalInterface.getClass());
        System.out.println(myFunctionalInterface.getClass().getSuperclass());
        System.out.println(myFunctionalInterface.getClass().getInterfaces()[0]);
    }
}
