package main.java.java8.lambda.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("zhangsan", 20);
        Person person2 = new Person("lisi", 25);
        Person person3 = new Person("wangwu", 22);
        List<Person> personList = Arrays.asList(person1, person2, person3);
        PersonTest test = new PersonTest();
        test.getPersonByNames(Collections.singletonList("zhangsan"), personList).forEach(i -> System.out.println(i.getUserName()));
        test.getPersonByAge(21, personList, (age, persons) -> persons.stream().filter(person -> person.getAge() > age).collect(Collectors.toList())).forEach(i -> System.out.println(i.getUserName()));
        Predicate<String> predicateTest = p -> p.length() > 5;
        System.out.println(predicateTest.test("Hello World"));
        test.predicateTest(personList, i -> i.getAge() > 20, i -> i.getUserName().length() > 4);

    }

    public void predicateTest(List<Person> personList, Predicate<Person> predicate1, Predicate<Person> predicate2) {
        System.out.println("-----------------------------------------");
        personList.forEach(person -> {
            if (predicate1.and(predicate2).test(person)) {
                System.out.println(person.getUserName());
            }
        });
        System.out.println("-----------------------------------------");
        personList.forEach(person -> {
            if (predicate1.or(predicate2).test(person)) {
                System.out.println(person.getUserName());
            }
        });
        System.out.println("-----------------------------------------");
        personList.forEach(person -> {
            if (predicate1.and(predicate2).negate().test(person)) {
                System.out.println(person.getUserName());
            }
        });

    }

    public List<Person> getPersonByNames(List<String> names, List<Person> personList) {
        return personList.stream().filter(person -> names.contains(person.getUserName())).collect(Collectors.toList());
    }

    public List<Person> getPersonByAge(int age, List<Person> personList, BiFunction<Integer, List<Person>, List<Person>> biFunction) {
        return biFunction.apply(age, personList);
    }
}
