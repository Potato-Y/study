package s_6_sorting_and_searching.p1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];

    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    for (int num : sort(arr)) {
      System.out.print(num + " ");
    }
  }

  public static int[] sort(int[] in) {
    int[] arr = in;
    for (int i = 0; i < arr.length; i++) {
      int tmp = arr[i];
      int minValue = arr[i];
      int minIndex = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (minValue > arr[j]) {
          minValue = arr[j];
          minIndex = j;
        }
      }

      if (minIndex != i) {
        arr[i] = arr[minIndex];
        arr[minIndex] = tmp;
      }
    }

    return arr;
  }
}
