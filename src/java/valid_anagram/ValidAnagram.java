package src.java.valid_anagram;

import java.util.HashSet;
import java.util.Stack;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {

        if(s.length() !=  t.length()){
            return false;
        }

        int[] charCounts = new int[26]; // Assuming the strings contain only lowercase English letters

        for (int i = 0; i < s.length(); i++) {
            charCounts[s.charAt(i) - 'a']++;
            charCounts[t.charAt(i) - 'a']--;
        }

        for (int count : charCounts) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}
