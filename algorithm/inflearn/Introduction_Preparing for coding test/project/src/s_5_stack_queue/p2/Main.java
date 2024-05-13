package s_5_stack_queue.p2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();

    Stack<Boolean> brackets = new Stack<>();
    StringBuilder sb = new StringBuilder();
    for (char c : input.toCharArray()) {
      if (c == '(') {
        brackets.push(true);
        continue;
      }
      if (c == ')') {
        brackets.pop();
        continue;
      }

      if (brackets.empty()) {
        sb.append(c);
      }
    }

    System.out.println(sb);
  }
}
