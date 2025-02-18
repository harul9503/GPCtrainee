import java.util.*;
import java.util.stream.*;

class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 5, 20, 15, 30, 25);

        List<Integer> resultlst = numbers.stream()
                .filter(n -> n > 15)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(resultlst);
    }
}
