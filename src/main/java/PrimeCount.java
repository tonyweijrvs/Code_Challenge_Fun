/**
 * Count the number of prime numbers less than a non-negative number, n.
 * Example:
 * Input: 10
 * Output: 4
 * Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
 */
public class PrimeCount {
  public int countPrimes(int n) {
    boolean[] a = new boolean[n+1];
    int con=0;
    for(int i=2;i<n;i++){
      if(a[i]==false){
        con++;
        for(int j=2;i*j<n;j++){
          a[i*j]=true;
        }
      }
    }
    return con;
  }
}
