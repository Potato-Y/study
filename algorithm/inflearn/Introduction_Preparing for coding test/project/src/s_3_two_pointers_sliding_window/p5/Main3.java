package s_3_two_pointers_sliding_window.p5;

import java.util.Scanner;

public class Main3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.print(solution(n));
  }

  static int solution(int n) {
    int answer = 0, cnt = 1;
    n--;
    while (n > 0) {
      cnt++;
      n = n - cnt;
      if (n % cnt == 0) {
        answer++;
      }
    }

    return answer;
  }
}
