package s_1_string.p10;

import java.util.Scanner;
import java.util.StringJoiner;

public class Main2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    char t = sc.next().charAt(0);

    int[] answer = new int[s.length()];
    int p = 1000;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == t) {
        p = 0;
        answer[i] = p;
      } else {
        p++;
        answer[i] = p;
      }
    }

    p = 1000;
    for (int i = s.length() - 1; i >= 0; i--) {
      if (s.charAt(i) == t) {
        p = 0;
      } else {
        p++;
        answer[i] = Math.min(answer[i], p);
      }
    }

    StringJoiner sj = new StringJoiner(" ");
    for (int x : answer) {
      sj.add(String.valueOf(x));
    }

    System.out.println(sj);
  }
}
