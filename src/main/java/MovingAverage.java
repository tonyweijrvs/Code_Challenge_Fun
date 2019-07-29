import java.util.LinkedList;
import java.util.Queue;

/**
 * Given a stream of integers and a window size, calculate the moving average of all integers in the sliding window.
 * Example:
 * MovingAverage m = new MovingAverage(3);
 * m.next(1) = 1
 * m.next(10) = (1 + 10) / 2
 * m.next(3) = (1 + 10 + 3) / 3
 * m.next(5) = (10 + 3 + 5) / 3
 */
public class MovingAverage {
  private Queue<Integer> queue;
  private int size;
  private int sum;
  public MovingAverage(int size) {
    this.queue = new LinkedList<>();
    this.size = size;
    this.sum = 0;
  }

  public double next(int val) {
    if (queue.size() == size) {
      sum -= queue.poll();
    }
    queue.add(val);
    sum += val;
    return sum/queue.size();
  }


}
