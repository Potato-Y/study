package s_1_string.p2;

import java.util.Scanner;

public class Main2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();

    String answer = "";
    for (char x : input.toCharArray()) {
      if (Character.isLowerCase(x)) {
        answer += Character.isUpperCase(x);
      } else {
        answer += Character.toLowerCase(x);
      }
    }

    System.out.println(answer);
  }
}
