package s_4_hashmap_treeset.p5;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();

    Integer[] arr = new Integer[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    Arrays.sort(arr, Collections.reverseOrder());

    int cnt = 0;
    HashSet<Integer> hashSet = new HashSet<>();
    for (int i = 0; i < n - 2; i++) {
      for (int j = i + 1; j < n - 1; j++) {
        for (int l = j + 1; l < n; l++) {
          int num = arr[i] + arr[j] + arr[l];
          // 3중 for문에서 바로 답을 구하려고 하면 모든 경우의 수를 확인하지 않아 보장되지 않는다.
          // 때문에 통과할 수 없다.
          if (!hashSet.contains(num)) {
            cnt++;
            hashSet.add(num);
            if (cnt == k) {
              System.out.println(num);
              return;
            }
          }
        }

      }
    }
    System.out.println(-1);
  }
}
