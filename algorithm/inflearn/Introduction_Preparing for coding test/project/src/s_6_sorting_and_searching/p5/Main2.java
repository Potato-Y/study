package s_6_sorting_and_searching.p5;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {

  public String solution(int n, int[] arr) {
    String answer = "U";

    Arrays.sort(arr);
    for (int i = 0; i < n - 1; i++) {
      if (arr[i] == arr[i + 1]) {
        return "D";
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    Main2 T = new Main2();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println(T.solution(n, arr));
  }
}
