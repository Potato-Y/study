package s_1_string.p4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main3 {

  public ArrayList<String> solution(int n, String[] str) {
    ArrayList<String> answer = new ArrayList<>();
    for (String x : str) {
      char[] s = x.toCharArray();
      int lt = 0, rt = x.length() - 1;
      while (lt < rt) {
        char tmp = s[lt];
        s[lt] = s[rt];
        s[rt] = tmp;
        lt++;
        rt--;
      }

      String tmp = String.valueOf(s);
      answer.add(tmp);
    }

    return answer;
  }

  public static void main(String[] args) {
    Main3 T = new Main3();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] input = new String[n];
    for (int i = 0; i < n; i++) {
      input[i] = sc.next();
    }

    for (String x : T.solution(n, input)) {
      System.out.println(x);
    }
  }
}
