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
