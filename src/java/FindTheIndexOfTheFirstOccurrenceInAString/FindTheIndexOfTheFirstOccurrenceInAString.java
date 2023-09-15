/**
 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: haystack = "sadbutsad", needle = "sad"
 * Output: 0
 * Explanation: "sad" occurs at index 0 and 6.
 * The first occurrence is at index 0, so we return 0.
 * Example 2:
 * <p>
 * Input: haystack = "leetcode", needle = "leeto"
 * Output: -1
 * Explanation: "leeto" did not occur in "leetcode", so we return -1.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= haystack.length, needle.length <= 104
 * haystack and needle consist of only lowercase English characters.
 */

package src.java.FindTheIndexOfTheFirstOccurrenceInAString;

public class FindTheIndexOfTheFirstOccurrenceInAString {


    public int Solution(String haystack, String needle) {

        // This is the first way that solve this problem
        /*
        int x = 0, y = 0;

        if(needle.length() > haystack.length()){
            return -1;
        }
        while (true) {

            if (needle.charAt(x) != haystack.charAt(y)) {
                y = y - x;
                x = 0;
            } else {
                x++;
            }
            if (x > needle.length()-1)
                return y+1-x;
            else if ((x == 0 && y == haystack.length()-1) || x>y+1)
                return -1;
            else if (y == haystack.length()-1)
                return -1;
            else
                y++;
        }*/

        int haystackLength = haystack.length();
        int needleLength = needle.length();

        // Check for edge cases
        if (needleLength == 0) return 0;
        if (haystackLength < needleLength) return -1;

        for (int i = 0; i <= haystackLength - needleLength; i++) {
            int j;
            for (j = 0; j < needleLength; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break; // mismatch, move to the next position in haystack
                }
            }

            // If we reached the end of the needle, it means we found a match.
            if (j == needleLength) {
                return i;
            }
        }

        return -1; // Needle not found in haystack
    }

}
