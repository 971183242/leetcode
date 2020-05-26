package main.java.java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringComparator {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tony","Neal","Greg","Lucy","Dave","Will");
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(names);
        Collections.sort(names, Comparator.naturalOrder());//equal to sout o1,o2 -> o1.compareTo(o2)
        System.out.println(names);
    }
}
