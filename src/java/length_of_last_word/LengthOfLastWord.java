/**
 * Given a string s consisting of words and spaces, return the length of the last word in the string.
 * <p>
 * A word is a maximal
 * substring
 * consisting of non-space characters only.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "Hello World"
 * Output: 5
 * Explanation: The last word is "World" with length 5.
 * Example 2:
 * <p>
 * Input: s = "   fly me   to   the moon  "
 * Output: 4
 * Explanation: The last word is "moon" with length 4.
 * Example 3:
 * <p>
 * Input: s = "luffy is still joyboy"
 * Output: 6
 * Explanation: The last word is "joyboy" with length 6.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 104
 * s consists of only English letters and spaces ' '.
 * There will be at least one word in s.
 */
package src.java.length_of_last_word;

public class LengthOfLastWord {
    public int Solution(String s) {
        int size = s.length();
        int length = 0;
        boolean weSeenTheWord = false;

        for (int i = size - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
                weSeenTheWord = true;
            } else if (s.charAt(i) == ' ' && weSeenTheWord) {
                return length;
            }
        }
        return length;
    }
}
/*
Alright, let's tackle this problem together! First off, we don't have to start from the beginning of the string.
All we're interested in is finding the length of the last word.
To do that, we'll set up a loop that begins from the end of the string. Now, you might be wondering,
'Why do we need a boolean?' Well, here's the thing: in some cases, the string can end with a space.
So, we need to consider situations where there's a space at the end, but there's no actual word. In those cases,
we don't have to do anything.

However, we still need a way to know when our algorithm encounters a space so that we can stop counting the length.
That's where the boolean comes in handy. When we see a word, we set it to 'true,' and when we eventually spot a space,
we'll know it's time to stop counting.*/