package src.java.Excel_Sheet_Column_Title;

import java.util.HashMap;
import java.util.Map;

class ExcelSheetColumnTitle {

    /**
     * - > This is the first way that we can go !!  we get the result but this way is not so fast !
     * *
     * public String convertToTitle(int columnNumber) {
     * <p>
     * Map<Integer, Character> keyValueMap = new HashMap<>();
     * <p>
     * // Add key-value pairs to the Map
     * keyValueMap.put(1, 'a');
     * keyValueMap.put(2, 'b');
     * keyValueMap.put(3, 'c');
     * keyValueMap.put(4, 'd');
     * keyValueMap.put(5, 'e');
     * keyValueMap.put(6, 'f');
     * keyValueMap.put(7, 'g');
     * keyValueMap.put(8, 'h');
     * keyValueMap.put(9, 'i');
     * keyValueMap.put(10, 'j');
     * keyValueMap.put(11, 'k');
     * keyValueMap.put(12, 'l');
     * keyValueMap.put(13, 'm');
     * keyValueMap.put(14, 'n');
     * keyValueMap.put(15, 'o');
     * keyValueMap.put(16, 'p');
     * keyValueMap.put(17, 'q');
     * keyValueMap.put(18, 'r');
     * keyValueMap.put(19, 's');
     * keyValueMap.put(20, 't');
     * keyValueMap.put(21, 'u');
     * keyValueMap.put(22, 'v');
     * keyValueMap.put(23, 'w');
     * keyValueMap.put(24, 'x');
     * keyValueMap.put(25, 'y');
     * keyValueMap.put(26, 'z');
     * <p>
     * <p>
     * if (columnNumber <= 26) {
     * return keyValueMap.get(columnNumber).toString().toUpperCase();
     * }
     * if (columnNumber == 52) {
     * return "AZ";
     * }
     * int a = columnNumber;
     * int b = 0;
     * String output = "";
     * while (a > 0) {
     * b = a % 26;
     * a = (a - 1) / 26; // Subtract 1 from a to handle the case when b is 0
     * if (b == 0) {
     * b = 26; // Set b to 26 instead of 0
     * //a--; // Decrement a when b is 0
     * }
     * output = keyValueMap.get(b) + output;
     * }
     * return output.toUpperCase();
     * }
     */

    public String convertToTitle(int columnNumber) {

        StringBuilder output = new StringBuilder();
        int a = columnNumber;
        int b = 0;
        while (a > 0) {
            b = (a - 1) % 26; // a-1, for finding the digit - > we start from the A ascii code of A from the table.!!
            char digit = (char) (b);

            a = (a - 1) / 26;
            output.insert(0, digit);
        }

        return output.toString();
    }


}