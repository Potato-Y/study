package s_3_two_pointers_sliding_window.p2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    int m = sc.nextInt();
    int[] b = new int[m];
    for (int i = 0; i < m; i++) {
      b[i] = sc.nextInt();
    }

    for (int x : solution(n, m, a, b)) {
      System.out.print(x + " ");
    }
  }

  private static ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
    ArrayList<Integer> answer = new ArrayList<>();

    Arrays.sort(a);
    Arrays.sort(b);

    int p1 = 0, p2 = 0;
    while (p1 < n && p2 < n) {
      if (a[p1] == b[p2]) {
        answer.add(a[p1]);
        p1++;
        p2++;
      } else if (a[p1] < b[p2]) {
        p1++;
      } else {
        p2++;
      }
    }

    return answer;
  }
}
