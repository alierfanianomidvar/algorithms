package src.java.palindrome_number;

import java.util.ArrayList;

public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        int original = x;
        int reversNumber = 0;
        if(x < 0){
            return false;
        } else if (x < 10 && x >= 0) {
            return true;
        } else if (x % 10 == 0) {
            return false;
        } else {
            while (x > 0) {
                int number = x % 10;
                reversNumber = reversNumber * 10 + number;
                x /= 10;
            }
            return original == reversNumber;
        }
    }
}
