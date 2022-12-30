import java.util.Arrays;

public class Recursion {
    private Recursion() {}

    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }

        return base * power(base, exponent - 1);
    }
    /*
    base case: if exponent = 0 return 1

    power(2, 4): 2 * power(2, 3)
        power(2, 3): 2 * power(2, 2)
            power(2, 2): 2 * power(2, 1)
                power(2, 1): 2 * power(2, 0)
     */

    public static int factorial(int number) {
        if (number == 1) {
            return 1;
        }

        return number * factorial(number - 1);
    }
    /*
    base case: factorial(1) -> 1

    factorial(5): 5 * factorial(4)
        factorial(4): 4 * factorial(3)
            factorial(3): 3 * factorial(2)
                factorial(2): 2 * factorial(1)
                    factorial(1): 1
     */

    public static int productOfArray(int[] intArray) {
        if (intArray.length == 1) {
            return intArray[0];
        }

        return intArray[0] * productOfArray(Arrays.copyOfRange(intArray, 1, intArray.length));
    }
    /*
    base case: productOfArray(n) -> n

    productOfArray(4,3,2): 2 * productOfArray(4, 3)
        productOfArray(4,3): 3 * productOfArray(4)
            productOfArray(4): 4
     */

    public static int recursiveRange(int number) {
        if (number == 1) {
            return 1;
        }

        return number + recursiveRange(number - 1);
    }
    /*
    base case: recursiveRange(1) -> 1

    recursiveRange(4): 4 + recursiveRange(3)
        recursiveRange(3): 3 + recursiveRange(2)
            recursiveRange(2): 2 + recursiveRange(1)
                recursiveRange(1): 1
     */

    public static int fib(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }

        return fib(number - 1) + fib(number - 2);
    }
    /*
    base case: fib(1) and fib(2) = 1

    fib(7): fib(5) + fib(6): 13
        fib(6): fib(4) + fib(5): 8
            fib(5): fib(3) + fib(4): 5
                fib(4): fib(2) + fib(3): 3
                    fib(3): fib(1) + fib(2): 2
                        fib(2): 1: 1
                            fib(1): 1: 1
     */
}

