package s_5_stack_queue.p2;

import java.util.Scanner;
import java.util.Stack;

public class Main2 {

  public String solution(String str) {
    String answer = "";
    Stack<Character> stack = new Stack<>();

    for (char x : str.toCharArray()) {
      if (x == ')') {
        while (stack.pop() != '(')
          ;
      } else {
        stack.push(x);
      }
    }

    for (int i = 0; i < stack.size(); i++) {
      answer += stack.get(i);
    }

    return answer;
  }

  public static void main(String[] args) {
    Main2 T = new Main2();
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    System.out.println(T.solution(str));
  }
}
