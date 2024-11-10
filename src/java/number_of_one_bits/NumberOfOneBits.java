package src.java.number_of_one_bits;

public class NumberOfOneBits {

    public int hammingWeight(int n) {

        int counter = 0;

        while (n > 0) {
            if (n % 2 == 1) {
                counter++;
            }
            n >>= 1;// this make code faster;
        }

        return counter;
    }
}
