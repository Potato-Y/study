package s_5_stack_queue.p5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader sb = new BufferedReader(new InputStreamReader(System.in));
    String input = sb.readLine();

    Stack<Character> line = new Stack<>();
    int count = 0;
    for (int i = 0; i < input.length(); i++) {
      if (input.charAt(i) == '(') {
        line.push('(');
      }
      if (input.charAt(i) == ')') {
        line.pop();
        if (input.charAt(i - 1) == '(') {
          count += line.size();
        } else {
          count++;
        }
      }
    }

    System.out.println(count);
  }
}
