public class ChallengingRecursion {
    private ChallengingRecursion() {}

    public static String reverse(String string) {
        if (string.length() == 1) {
            return string;
        }

        String lastChar = string.substring(string.length() - 1);

        return lastChar + reverse(string.substring(0, string.length() - 1));
    }
    /*
    base case: if string = 1 return string

    reverse("heyo"): "o" + reverse("hey")
        reverse(): "y" + reverse("he")
            reverse(): "e" + reverse("h")
                reverse(): "h"
     */

    public static boolean isPalindrome(String string) {
        if (string.length() == 1) {
            return true;
        }

        if (string.charAt(0) != string.charAt(string.length() - 1)) {
            return false;
        }

        return isPalindrome(string.substring(1, string.length() - 1));
    }
    /*
    base case: if string.length() = 1 return true

    isPalindrome("peiep"): "o" + isPalindrome("eie")
        isPalindrome(): "y" + isPalindrome("i")
     */
}
