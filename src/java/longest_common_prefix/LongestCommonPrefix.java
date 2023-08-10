/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 *
 *
 * Example 1:
 *
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 *
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 *
 *
 * Constraints:
 *
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] consists of only lowercase English letters.

 */


package src.java.longest_common_prefix;

public class LongestCommonPrefix {

    // Function to find the longest common prefix among an array of strings.
    public String longestCommonPrefix(String[] stringList) {
        if (stringList.length == 0) {
            return ""; // If the array is empty, there's no common prefix.
        }

        int minLength = Integer.MAX_VALUE;
        // Calculate the minimum length among all strings to prevent index out of bounds.
        for (String str : stringList) {
            minLength = Math.min(minLength, str.length());
        }

        int j = 0; // Initialize a variable to keep track of the character index.
        while (j < minLength) {
            char currentChar = stringList[0].charAt(j); // Get the character at index 'j' from the first string.
            for (int i = 1; i < stringList.length; i++) {
                // Compare the character at index 'j' of each string with the current character.
                if (stringList[i].charAt(j) != currentChar) {
                    return stringList[i].substring(0, j); // Return the common prefix found so far.
                }
            }
            j++; // Move to the next character position to continue checking.
        }
        // If the loop completes, all characters in the common prefix are the same across all strings.
        return stringList[0].substring(0, j); // Return the full common prefix.
    }
}

