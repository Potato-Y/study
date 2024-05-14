package s_5_stack_queue.p4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();

    Stack<Integer> num = new Stack<>();
    for (char x : input.toCharArray()) {
      if (x == '/') {
        int num1 = num.pop();
        int num2 = num.pop();

        num.push(num2 / num1);
        continue;
      }
      if (x == '*') {
        int num1 = num.pop();
        int num2 = num.pop();

        num.push(num2 * num1);
        continue;
      }
      if (x == '+') {
        int num1 = num.pop();
        int num2 = num.pop();

        num.push(num2 + num1);
        continue;
      }
      if (x == '-') {
        int num1 = num.pop();
        int num2 = num.pop();

        num.push(num2 - num1);
        continue;
      }

      num.push(x - 48);
    }

    System.out.println(num.pop());
  }

}
