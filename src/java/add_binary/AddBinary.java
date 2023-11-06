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
        int sizeStringA = a.length();
        int sizeStringB = b.length();
        int carry = 0;
        
        StringBuilder output = new StringBuilder();

        while(sizeStringA >= 0 || sizeStringB >= 0){
            int sum = carry;
            if(sizeStringA >= 0 ){
                sum += a.CharAt(sizeStringA) - '0';
            }
            if(sizeStringB >= 0 ){
                sum += b.CharAt(sizeStringB) - '0';
            }

            if(sum == 0 || sum == 1){
                output.append(sum);
                carry = 0;
            } else if(sum == 2) {
                output.append("0");
                carry = 1;
            } else {
                output.append("1");
                carry = 1;
            }
            sizeStringA --;
            sizeStringB --;
        }

        if(carry == 1){
            output.append("1")
        }
        return output.reverse().tostring(); 
    }

   
    

   
}