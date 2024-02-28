package s_1_string.p3;

import java.util.Scanner;

public class Main2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();

    int m = Integer.MIN_VALUE;
    String answer = "";

    String[] s = input.split(" ");
    for (String x : s) {
      int len = x.length();
      if (len > m) {
        m = len;
        answer = x;
      }
    }

    System.out.println(answer);
  }

  public static void main2(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();

    String answer = "";
    int m = Integer.MIN_VALUE, pos;

    while ((pos = input.indexOf(' ')) != -1) {
      String tmp = input.substring(0, pos);
      int len = tmp.length();
      if (len > m) {
        m = len;
        answer = tmp;
      }
      input = input.substring(pos + 1);
    }
    if (input.length() > m) {
      answer = input;
    }

    System.out.println(answer);
  }

}
