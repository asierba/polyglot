package asierba.fizzbuzz;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {
    public static List<String> range(int from, int to) {
        return IntStream.range(from, to+1).mapToObj(FizzBuzz::range).collect(Collectors.toList());
    }

    public static String range(int number) {
        if (FizzBuzz.isMultipleOf(number, 3) && FizzBuzz.isMultipleOf(number, 5))
            return "FizzBuzz";
        if (FizzBuzz.isMultipleOf(number, 3))
            return "Fizz";
        if (FizzBuzz.isMultipleOf(number, 5))
            return "Buzz";
        return Integer.toString(number);
    }

    private static boolean isMultipleOf(int number, int divisor) {
        return number % divisor == 0;
    }
}
