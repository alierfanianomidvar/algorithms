package src.java.reverse_bits;

public class ReverseBits {

    public int reverseBits(int n) {

        n = (n >>> 16) | (n << 16);
        n = ((n & 0xff00ff00) >>> 8) | ((n & 0x00ff00ff) << 8);
        n = ((n & 0xf0f0f0f0) >>> 4) | ((n & 0x0f0f0f0f) << 4);
        n = ((n & 0xcccccccc) >>> 2) | ((n & 0x33333333) << 2);
        n = ((n & 0xaaaaaaaa) >>> 1) | ((n & 0x55555555) << 1);

        /**
         ** the Code:
         ** Swap 16-bit blocks: The first operation n = (n >>> 16) | (n << 16); swaps the entire lower 16 bits with
         *  the upper 16 bits of the 32-bit integer.
         ** Swap 8-bit blocks: The next operation deals with each 16-bit half, swapping 8-bit blocks. It uses the mask
         *  0xff00ff00 to isolate blocks and then swaps them using shifts.
         ** Swap 4-bit blocks: It continues to divide the problem by swapping 4-bit blocks within each 8-bit block
         *  using the mask 0xf0f0f0f0.
         ** Swap 2-bit blocks: The process is taken further down to 2-bit blocks using 0xcccccccc.
         ** Swap 1-bit blocks: Finally, individual bits are swapped using the mask 0xaaaaaaaa.
         * */
        return n;
    }
}
