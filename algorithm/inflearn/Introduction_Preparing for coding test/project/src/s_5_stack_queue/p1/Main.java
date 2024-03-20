package s_5_stack_queue.p1;

import java.util.Scanner;
import java.util.Stack;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.next();

    Stack<Character> stack = new Stack<>();

    for (char c : input.toCharArray()) {
      if (c == '(') {
        stack.push(c);
      } else if (c == ')') {
        if (stack.isEmpty() || stack.pop() == ')') {
          System.out.println("NO");
          return;
        }
      }
    }

    if (!stack.isEmpty()) {
      System.out.println("NO");
      return;
    }

    System.out.println("YES");
  }
}
