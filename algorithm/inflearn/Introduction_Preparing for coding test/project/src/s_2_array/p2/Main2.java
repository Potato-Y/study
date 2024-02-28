package s_2_array.p2;

import java.util.Scanner;

public class Main2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    int answer = 1, max = arr[0];
    for (int i = 1; i < n; i++) {
      if (arr[i] > max) {
        answer++;
        max = arr[i];
      }
    }

    System.out.println(answer);
  }
}
