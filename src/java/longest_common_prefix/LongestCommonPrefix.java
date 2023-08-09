package src.java.longest_common_prefix;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] stringList) {
        if (stringList.length == 0) {
            return "";
        }

        int minLength = Integer.MAX_VALUE;
        for (String str : stringList) {
            minLength = Math.min(minLength, str.length()); // to find min length.
        }

        int j = 0;
        while (j < minLength) {
            char currentChar = stringList[0].charAt(j);
            for (int i = 1; i < stringList.length; i++) {
                if (stringList[i].charAt(j) != currentChar) {
                    return stringList[i].substring(0, j);
                }
            }
            j++;
        }
        return stringList[0].substring(0, j);
    }


}
