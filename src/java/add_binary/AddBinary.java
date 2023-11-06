/*
Given two binary strings a and b, return their sum as a binary string.
Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"
 

Constraints:

1 <= a.length, b.length <= 104
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself.
*/

package src.java.add_binary;

public class AddBinary {

    public String solution(String a, String b) {
        // Variables to store the length of the strings
        int sizeStringA = a.length() - 1; // index should start from the last character
        int sizeStringB = b.length() - 1; // index should start from the last character
        int carry = 0; // This will hold the carry over when adding two binary digits

        // StringBuilder is a mutable sequence of characters. Used here for efficient string concatenation
        StringBuilder output = new StringBuilder();

        // Continue looping until both strings have been fully traversed
        while (sizeStringA >= 0 || sizeStringB >= 0) {
            int sum = carry; // Start with the current carry value

            // If we haven't gone past the beginning of String a, add the digit to sum
            if (sizeStringA >= 0) {
                sum += a.charAt(sizeStringA) - '0'; // Convert char to int and add it to sum
                sizeStringA--; // Move to the next character
            }

            // If we haven't gone past the beginning of String b, add the digit to sum
            if (sizeStringB >= 0) {
                sum += b.charAt(sizeStringB) - '0'; // Convert char to int and add it to sum
                sizeStringB--; // Move to the next character
            }

            // Append the right digit to output and update carry
            if (sum <= 1) {
                output.append(sum); // If the sum is 0 or 1, append it directly
                carry = 0; // No carry if sum is less than 2
            } else if (sum == 2) {
                output.append("0"); // If the sum is 2, append 0 and carry over 1
                carry = 1; // Set carry to 1
            } else {
                output.append("1"); // If the sum is 3 (1+1+carry), append 1 and carry over 1
                carry = 1; // Set carry to 1
            }
        }

        // If there's still a carry after the main loop, append it
        if (carry == 1) {
            output.append("1");
        }

        // Since we've been appending digits in reverse order, we need to reverse the StringBuilder contents
        return output.reverse().toString();
    }
}