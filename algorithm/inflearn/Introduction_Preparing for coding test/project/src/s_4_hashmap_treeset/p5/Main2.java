package s_4_hashmap_treeset.p5;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Main2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println(solution(arr, n, k));
  }

  static int solution(int[] arr, int n, int k) {
    int answer = -1;
    TreeSet<Integer> tSet = new TreeSet<>(Collections.reverseOrder());

    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        for (int l = j + 1; l < n; l++) {
          tSet.add(arr[i] + arr[j] + arr[l]);
        }
      }
    }

    int cnt = 0;
    for (int x : tSet) {
      cnt++;
      if (cnt == k) {
        return x;
      }
    }

    return answer;
  }

}
