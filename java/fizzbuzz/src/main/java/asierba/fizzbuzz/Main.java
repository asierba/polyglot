package asierba.fizzbuzz;

public class Main {

    public static void main(String[] args) {
        final int from = 1;
        final int to = 100;

        System.out.println("FizzBuzz from " + from + " to " +  to + ":");
        for (var value: FizzBuzz.range(from, to)) {
            System.out.print(value);
            System.out.print(" ");
        }
    }
}

