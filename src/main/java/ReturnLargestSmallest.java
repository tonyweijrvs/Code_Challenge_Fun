/**
 * Return the largest and the smallest integers in an unsorted integer array
 */
public class ReturnLargestSmallest {
  public static void largestAndSmallest(int[] numbers) {
    int largest = Integer.MIN_VALUE;
    int smallest = Integer.MAX_VALUE;
    for (int number : numbers) {
      if (number > largest) {
        largest = number;
      } else if (number < smallest) {
        smallest = number;
      }
    }
  }
}
