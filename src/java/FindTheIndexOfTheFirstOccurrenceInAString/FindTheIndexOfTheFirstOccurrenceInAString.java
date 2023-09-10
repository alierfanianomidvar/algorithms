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

        return 0;
    }

}
