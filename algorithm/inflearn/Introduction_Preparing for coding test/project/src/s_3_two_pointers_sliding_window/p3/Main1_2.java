package s_3_two_pointers_sliding_window.p3;

import java.util.Scanner;

/**
 * Sliding Window를 통해 다시 풀이
 */
public class Main1_2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] sales = new int[n];
    for (int i = 0; i < n; i++) {
      sales[i] = sc.nextInt();
    }

    int sum = 0;
    for (int i = 0; i < k; i++) {
      sum += sales[i];
    }
    int top = sum;

    for (int i = k; i < n; i++) {
      sum -= sales[i - k];
      sum += sales[i];
      top = Integer.max(top, sum);
    }

    System.out.println(top);
  }
}
