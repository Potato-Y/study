package s_5_stack_queue.p1;

import java.util.Scanner;
import java.util.Stack;

public class Main2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    System.out.println(solution(str));
  }

  static public String solution(String str) {
    String answer = "YES";
    Stack<Character> stack = new Stack<>();
    for (char c : str.toCharArray()) {
      if (c == '(') {
        stack.push(c);
      } else {
        if (stack.isEmpty()) {
          return "NO";
        }
        stack.pop();
      }
    }

    if (!stack.isEmpty()) {
      return "NO";
    }

    return answer;
  }
}
