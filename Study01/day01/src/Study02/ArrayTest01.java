package Study02;

import java.util.Arrays;

public class ArrayTest01 {
    public static void main(String[] args) {
        String[] abc = new String[] {"a", "b", "c"};

        System.out.println(Arrays.toString(abc));

        System.out.println("==============");

        Arrays.stream(abc).forEach(System.out::println);

        System.out.println("==============");

        for(String ABC : abc) {
            System.out.println(ABC);
        }
    }
}
