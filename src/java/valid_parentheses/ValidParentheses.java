package src.java.valid_parentheses;

import java.util.LinkedList;

public class ValidParentheses {

    public boolean solution(String s) {

        LinkedList<Character> characters = new LinkedList<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(!characters.isEmpty()){
                if ((int)(characters.getLast() - c) <=1
                        && (int)(characters.getLast() - c) >= -2
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
