package s_1_string.p9;

import java.util.Scanner;

public class Main2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.next();

    int answer = 0;
    for (char x : input.toCharArray()) {
      if (x >= 48 && x <= 57) {
        answer = answer * 10 + (x - 48);
      }
    }

    System.out.println(answer);
  }
}
