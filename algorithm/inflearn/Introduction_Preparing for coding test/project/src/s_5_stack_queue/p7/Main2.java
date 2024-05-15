package s_5_stack_queue.p7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main2 {

  public static void main(String[] args) {
    Main2 T = new Main2();
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();
    System.out.println(T.solution(a, b));
  }

  private String solution(String need, String plan) {
    String answer = "YES";
    Queue<Character> Q = new LinkedList<>();
    for (char x : need.toCharArray()) {
      Q.offer(x);
    }
    for (char x : plan.toCharArray()) {
      if (Q.contains(x)) {
        if (x != Q.poll()) {
          return "NO";
        }
      }
    }

    if (!Q.isEmpty()) {
      return "NO";
    }

    return answer;
  }
}
