
/*
* You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?



Example 1:

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step


Constraints:

1 <= n <= 45
* */

package src.java.climbing_stairs;

public class ClimbingStairs {

    public int solution(int n) {
        int[] m = new int[n+1]; // We need to cache data to make the algo faster!!
        return climbStairsWithCache(n, m);
    }
    public static int climbStairsWithCache(int n, int[] m) {
        if(m[n]>0){ // If we have the value just return the value !!
            return m[n];
        }
        if(n == 1){
            m[n] = 1;
        } else if (n == 2) {
            m[n] = 2;
        } else {
            m[n] = climbStairsWithCache(n-1, m) + climbStairsWithCache(n-2, m);
            // We reach to the n`th stairs with 2 way, using the n-1 stairs or the n-2 stairs!! so we must find the number
            // for those stairs too.
        }
        return m[n];
    }
}
