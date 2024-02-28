package s_2_array.p3;

import java.util.Scanner;

public class Main2 {

  public static void main(String[] args) {
    Main2 T = new Main2();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    int[] b = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    for (int i = 0; i < n; i++) {
      b[i] = sc.nextInt();
    }

    System.out.println(T.solution(n, a, b));
  }

  public String solution(int n, int[] a, int[] b) {
    String answer = "";
    for (int i = 0; i < n; i++) {
      if (a[i] == b[i]) {
        answer += "D\n";
      } else if (a[i] == 1 && b[i] == 3) {
        answer += "A\n";
      } else if (a[i] == 2 && b[i] == 1) {
        answer += "A\n";
      } else if (a[i] == 3 && b[i] == 2) {
        answer += "A\n";
      } else {
        answer += "B\n";
      }
    }

    return answer;
  }
}
