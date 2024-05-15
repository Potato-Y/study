package s_5_stack_queue.p6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());

    Queue<Integer> queue = new LinkedList<>();
    for (int i = 0; i < n; i++) {
      queue.add(i + 1);
    }

    while (queue.size() > 1) {
      for (int i = 0; i < k; i++) {
        if (i != k - 1) {
          queue.add(queue.poll());
          continue;
        }
        queue.poll();
      }
    }

    System.out.println(queue.poll());
  }
}
