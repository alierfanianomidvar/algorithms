package src.java.isomorphic_strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {


        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> sToTMap = new HashMap<>();
        HashMap<Character, Character> tToSMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            // Check mapping from s to t
            if (sToTMap.containsKey(sChar)) {
                if (sToTMap.get(sChar) != tChar) {
                    return false;
                }
            } else {
                sToTMap.put(sChar, tChar);
            }

            // Check mapping from t to s
            if (tToSMap.containsKey(tChar)) {
                if (tToSMap.get(tChar) != sChar) {
                    return false;
                }
            } else {
                tToSMap.put(tChar, sChar);
            }
        }

        return true;
    }
}
