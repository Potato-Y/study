package s_4_hashmap_treeset.p3;

import java.util.HashMap;
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

    HashMap<Integer, Integer> set = new HashMap();
    for (int i = 0; i < k; i++) {
      set.put(arr[i], set.getOrDefault(arr[i], 0) + 1);
    }
    System.out.print(set.size() + " ");
    for (int i = k; i < n; i++) {
      set.put(arr[i - k], set.get(arr[i - k]) - 1);
      if (set.get(arr[i - k]) == 0) {
        set.remove(arr[i - k]);
      }

      set.put(arr[i], set.getOrDefault(arr[i], 0) + 1);

      System.out.print(set.size() + " ");
    }
  }
}
