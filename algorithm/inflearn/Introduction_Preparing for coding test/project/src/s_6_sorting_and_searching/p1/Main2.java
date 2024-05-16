package s_6_sorting_and_searching.p1;

import java.util.Scanner;

public class Main2 {

  public int[] solution(int n, int[] arr) {
    for (int i = 0; i < n; i++) {
      int idx = i;
      for (int j = 0; j < n; j++) {
        if (arr[j] < arr[idx]) {
          idx = j;
        }
      }
      int tmp = arr[i];
      arr[i] = arr[idx];
      arr[idx] = tmp;
    }
    return arr;
  }

  public static void main(String[] args) {
    Main2 T = new Main2();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    for (int x : T.solution(n, arr)) {
      System.out.print(x + " ");
    }
  }
}
