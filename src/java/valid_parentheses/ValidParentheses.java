/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "()"
 * Output: true
 * Example 2:
 * <p>
 * Input: s = "()[]{}"
 * Output: true
 * Example 3:
 * <p>
 * Input: s = "(]"
 * Output: false
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 104
 * s consists of parentheses only '()[]{}'.
 */


package src.java.valid_parentheses;

import java.util.LinkedList;

public class ValidParentheses {

    public boolean solution(String s) {

        LinkedList<Character> characters = new LinkedList<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!characters.isEmpty()) {
                if ((int) (characters.getLast() - c) <= 1
                        && (int) (characters.getLast() - c) >= -2
                        && characters.getLast() != c) {
                    characters.removeLast();
                } else {
                    characters.add(c);
                }
            } else characters.push(c);
        }
        return characters.isEmpty();
    }

}

/**
 * Intuition
 * <p>
 * The best approach I had in mind to solve this problem was using a linked list because it is easier and faster to add and remove elements from a linked list.
 * <p>
 * Let's see an example of how this works with a linked list:
 * <p>
 * Given the string s = "(){[]}".
 * We encounter an opening parenthesis '(', so we add it to our linked list
 * Next, we encounter a closing parenthesis ')', which matches the last element in our linked list '('the opening parenthesis '()', so we remove it from the linked list.
 * We continue this process, examining each character in the string and adding or removing corresponding elements from the linked list.
 * Using this method, we can efficiently check whether the given string containing parentheses is valid (properly nested and balanced) or not. The linked list allows us to keep track of the opening parentheses in the order they appear, and we can easily match them with the corresponding closing parentheses. This approach ensures that each opening parenthesis has a corresponding closing parenthesis and that they are correctly nested. If the linked list is empty after processing the entire string, the string is valid; otherwise, it is not.
 * <p>
 * Approach
 * <p>
 * Based on what we discussed, we will create a linked list:
 * <p>
 * LinkedList<Character> characters = new LinkedList<Character>();
 * Once we begin our task, we'll read characters from the given string and store each in variable c. If the linked list is empty, there's no need to perform any checks; we can simply add the character to our linked list.
 * <p>
 * if ((int)(characters.getLast() - c) <= 1
 * && (int)(characters.getLast() - c) >= -2
 * && characters.getLast() != c) {
 * ...
 * }
 * We are dealing with six characters: '(', ')', '{', '}', '[', and ']'. Their respective ASCII codes are as follows: '(': 40, ')': 41, '{': 123, '}': 125, '[': 91, and ']': 93. Analyzing their ASCII codes allows us to recognize a pattern between opening and closing parentheses. For instance, if the last character in our linked list is '(' and the current character is ')', the difference between their ASCII codes results in -1. Similarly, the difference between the ASCII codes of '[' and ']' is -2. However, it's important to note that the difference between, for example, '(' and '}' is -85. This observation underscores the connection between open and close parentheses.
 * <p>
 * Thus, our condition ((int)(characters.getLast() - c) >= -2) ensures that we only consider differences greater than or equal to -2 and not beyond 1. We aim to filter out inappropriate values.
 * <p>
 * The final condition, characters.getLast() != c, guards against removing a character from the linked list when the current value is the same.
 * <p>
 * By following this approach, we can efficiently determine whether a given string containing parentheses is valid, well-nested, and balanced. Our linked list retains track of the opening parentheses in sequence, allowing us to match them accurately with their corresponding closing counterparts. Consequently, we ensure the proper nesting and balance of these parentheses. If, after evaluating the entire string, the linked list remains empty, the string is valid; otherwise, it is not.
 * <p>
 * Complexity
 * <p>
 * Time complexity: o(n)
 * Space complexity: o(n)
 */