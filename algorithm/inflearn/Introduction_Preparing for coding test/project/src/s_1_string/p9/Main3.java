package s_1_string.p9;

import java.util.Scanner;

public class Main3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.next();

    StringBuilder answer = new StringBuilder();
    for (char x : input.toCharArray()) {
      if (Character.isDigit(x)) {
        answer.append(x);
      }
    }

    System.out.println(Integer.parseInt(answer.toString()));
  }
}
