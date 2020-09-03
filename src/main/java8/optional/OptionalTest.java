package main.java8.optional;

import java.util.Arrays;
import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Hello");
        if (optional.isPresent()) {
            System.out.println(optional.get());
        }
        optional.ifPresent(i -> System.out.println(i));//推荐的Optional使用方式
        System.out.println("------------------------");
        optional = Optional.empty();
        System.out.println(optional.orElse("World"));

        System.out.println("------------");
        Company company = new Company();
        System.out.println(Optional.ofNullable(company.getEmployees()).orElse(Arrays.asList(new Employee("will"))));
        company.setEmployees(Arrays.asList(new Employee("zhangsan"),new Employee("lisi")));
        System.out.println(Optional.ofNullable(company.getEmployees()).orElse(Arrays.asList(new Employee("will"))));


    }
}
