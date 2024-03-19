package s_3_two_pointers_sliding_window.p6;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();

    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    int zeroCnt = 0, lt = 0, bigSize = Integer.MIN_VALUE;
    for (int rt = 0; rt < n; rt++) {
      if (arr[rt] == 0) {
        zeroCnt++;
      }
      if (zeroCnt > k) {
        bigSize = Integer.max(bigSize, rt - lt);

        while (zeroCnt > k) {
          if (arr[lt++] == 0) {
            zeroCnt--;
          }
        }
      }
    }

    System.out.println(bigSize);
  }
}
