package src.java.power_of_two;

public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }

        if (n % 2 == 0) {
            while (n > 0) {
                n = n / 2;

                if (n % 2 != 0 && n != 1) {

                    return false;
                }
            }
            return true;
        }
        return false;

    }
}
