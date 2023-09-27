package src.java.length_of_last_word;

public class LengthOfLastWord {
    public int Solution(String s) {
        int size = s.length();
        int length = 0;
        boolean weSeenTheWord = false;

        for (int i = size - 1; i >=0 ; i--) {
            if(s.charAt(i) != ' '){
                length++;
                weSeenTheWord = true;
            } else if(s.charAt(i) == ' ' && weSeenTheWord){
                return length;
            }
        }
        return length;
    }
}
