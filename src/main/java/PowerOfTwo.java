/**
 * Given an integer, write a function to determine if it is a power of two.
 * Example 1:
 * Input: 1
 * Output: true
 * Explanation: 20 = 1
 * Example 2:
 * Input: 16
 * Output: true
 * Explanation: 24 = 16
 * Example 3:
 * Input: 218
 * Output: false
 */
public class PowerOfTwo {
  public boolean isPowerOfTwo(int n) {
    int con=0;
    while(n>0){
      if((n & 1)==1){
        con++;
      }
      n = n >> 1;
    }
    return con==1;
  }
}
