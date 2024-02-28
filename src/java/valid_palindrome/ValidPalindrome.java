package src.java.valid_palindrome;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start <= end) {
            char x = s.charAt(start);
            char y = s.charAt(end);
            if ((x < 97 || x > 122) && (x < 48 || x > 57) && (x < 65 || x > 90)) {
                start++;
            } else if ((y < 97 || y > 122) && (y < 48 || y > 57) && (y < 65 || y > 90)) {
                end--;
            } else {
                if (Character.toLowerCase(x) != Character.toLowerCase(y)) {
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }
}
