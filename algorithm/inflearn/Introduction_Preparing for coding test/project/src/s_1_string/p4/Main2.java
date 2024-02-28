package s_1_string.p4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {

  public ArrayList<String> solution(int n, String[] str) {
    ArrayList<String> answer = new ArrayList<>();
    for (String x : str) {
      String tmp = new StringBuilder(x).reverse().toString();
      answer.add(tmp);
    }

    return answer;
  }

  public static void main(String[] args) {
    Main2 T = new Main2();
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
