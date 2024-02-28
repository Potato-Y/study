package s_1_string.p7;

import java.util.Scanner;

public class Main3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.next();

    String answer = "YES";
    String tmp = new StringBuilder(input).reverse().toString();

    if (!input.equalsIgnoreCase(tmp)) {
      answer = "NO";
    }

    System.out.println(answer);
  }
}
