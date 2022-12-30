import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

public class RecursionTest {

    @Test
    @DisplayName("Should return the resulting power")
    public void powerTest() {
        // when
        int result1 = Recursion.power(2, 0);
        int result2 = Recursion.power(2, 2);
        int result3 = Recursion.power(2, 4);
        int result4 = Recursion.power(4, 4);
//        int result5 = Recursion.power(2, -4);

        // then
        assertAll("",
                () -> assertThat(result1).isEqualTo(1),
                () -> assertThat(result2).isEqualTo(4),
                () -> assertThat(result3).isEqualTo(16),
                () -> assertThat(result4).isEqualTo(256)
        );
    }

    @Test
    @DisplayName("Should return the product of an integer and all the integers below it")
    public void factorialTest() {
        // when
        int result1 = Recursion.factorial(1);
        int result2 = Recursion.factorial(2);
        int result3 = Recursion.factorial(4);
        int result4 = Recursion.factorial(7);
//        int result5 = Recursion.factorial(-4);

        // then
        assertAll("",
                () -> assertThat(result1).isEqualTo(1),
                () -> assertThat(result2).isEqualTo(2),
                () -> assertThat(result3).isEqualTo(24),
                () -> assertThat(result4).isEqualTo(5040)
        );
    }

    @Test
    @DisplayName("Should return a product of all numbers in array")
    public void productOfArrayTest() {
        // given
        int[] array1 = {1,2,3};
        int[] array2 = {1,2,3,10};
        int[] array3 = {1,0,3};
        int[] array4 = {1,-2,3};

        // when
        int result1 = Recursion.productOfArray(array1);
        int result2 = Recursion.productOfArray(array2);
        int result3 = Recursion.productOfArray(array3);
        int result4 = Recursion.productOfArray(array4);

        // then
        assertAll("",
                () -> assertThat(result1).isEqualTo(6),
                () -> assertThat(result2).isEqualTo(60),
                () -> assertThat(result3).isZero(),
                () -> assertThat(result4).isEqualTo(-6)
        );
    }

    @Test
    @DisplayName("Should return a the sum of number passed in and all numbers below it, down until 0")
    public void recursiveRangeTest() {
        // when
        int result1 = Recursion.recursiveRange(6);
        int result2 = Recursion.recursiveRange(10);
//        int result4 = Recursion.recursiveRange(-2);

        // then
        assertAll("",
                () -> assertThat(result1).isEqualTo(21),
                () -> assertThat(result2).isEqualTo(55)
//                () -> assertThat(result3).isEqualTo(0)
//                () -> assertThat(result4).isEqualTo(-6)
        );
    }

    @Test
    @DisplayName("Should return the nth number in the Fibonacci sequence")
    public void fibTest() {
        // when
        int result1 = Recursion.fib(4);
        int result2 = Recursion.fib(10);
        int result3 = Recursion.fib(28);
        int result4 = Recursion.fib(35);

        // then
        assertAll("",
                () -> assertThat(result1).isEqualTo(3),
                () -> assertThat(result2).isEqualTo(55),
                () -> assertThat(result3).isEqualTo(317811),
                () -> assertThat(result4).isEqualTo(9227465)
        );
    }
}
