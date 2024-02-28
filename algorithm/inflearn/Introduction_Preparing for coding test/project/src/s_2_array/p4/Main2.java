package s_2_array.p4;

import java.util.Scanner;

public class Main2 {

  public static void main(String[] args) {
    Main2 T = new Main2();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int x : T.solution(n)) {
      System.out.print(x + " ");
    }
  }

  public int[] solution(int n) {
    int[] answer = new int[n];

    answer[0] = 1;
    answer[1] = 1;

    for (int i = 2; i < n; i++) {
      answer[i] = answer[i - 2] + answer[i - 1];
    }

    return answer;
  }

}
