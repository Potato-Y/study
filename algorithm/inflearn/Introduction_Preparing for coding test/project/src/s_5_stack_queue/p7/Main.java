package s_5_stack_queue.p7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String essential = br.readLine();
    String plan = br.readLine();

    Queue<Character> queue = new LinkedList<>();
    for (char x : essential.toCharArray()) {
      queue.add(x);
    }

    for (char x : plan.toCharArray()) {
      if (queue.isEmpty()) {
        break;
      }
      if (x == queue.peek()) {
        queue.poll();
      }
    }

    if (queue.isEmpty()) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}
