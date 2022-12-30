import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

public class ChallengingRecursionTest {

    @Test
    @DisplayName("Should return the string reversed")
    public void reverseTest() {
        // when
        String result1 = ChallengingRecursion.reverse("heyo");
        String result2 = ChallengingRecursion.reverse("awesome");
        String result3 = ChallengingRecursion.reverse("rithmschool");
        String result4 = ChallengingRecursion.reverse("h");

        // then
        assertAll("",
                () -> assertThat(result1).isEqualTo("oyeh"),
                () -> assertThat(result2).isEqualTo("emosewa"),
                () -> assertThat(result3).isEqualTo("loohcsmhtir"),
                () -> assertThat(result4).isEqualTo("h")
        );
    }

    @Test
    @DisplayName("Should return true if the string passed to it is a palindrome (reads the same forward and backward)")
    public void isPalindromeTest() {
        // when
        boolean result1 = ChallengingRecursion.isPalindrome("awesome");
        boolean result2 = ChallengingRecursion.isPalindrome("foobar");
        boolean result3 = ChallengingRecursion.isPalindrome("tacocat");
        boolean result4 = ChallengingRecursion.isPalindrome("amanaplanacanalpanama");
        boolean result5 = ChallengingRecursion.isPalindrome("amanaplanacanalpandemonium");
        boolean result6 = ChallengingRecursion.isPalindrome("h");

        // then
        assertAll("",
                () -> assertThat(result1).isFalse(),
                () -> assertThat(result2).isFalse(),
                () -> assertThat(result3).isTrue(),
                () -> assertThat(result4).isTrue(),
                () -> assertThat(result5).isFalse(),
                () -> assertThat(result6).isTrue()
        );
    }
}
