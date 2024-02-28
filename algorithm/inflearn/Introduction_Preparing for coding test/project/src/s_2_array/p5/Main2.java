package s_2_array.p5;

import java.util.Scanner;

public class Main2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    Main2 T = new Main2();
    System.out.println(T.solution(n));
  }

  public int solution(int n) {
    int answer = 0;
    int[] ch = new int[n + 1];
    for (int i = 2; i <= n; i++) {
      if (ch[i] == 0) {
        answer++;
        for (int j = i; j <= n; j += i) {
          ch[j] = 1;
        }
      }
    }

    return answer;
  }
}
