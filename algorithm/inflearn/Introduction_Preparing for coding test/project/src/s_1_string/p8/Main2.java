package s_1_string.p8;

import java.util.Scanner;

public class Main2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    input = input.toUpperCase().replaceAll("[^A-Z]", "");

    String tmp = new StringBuilder(input).reverse().toString();
    if (input.equals(tmp)) {
      System.out.println("YES");
      return;
    }

    System.out.println("NO");
  }
}
