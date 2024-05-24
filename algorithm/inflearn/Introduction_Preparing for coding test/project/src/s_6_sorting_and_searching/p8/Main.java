package s_6_sorting_and_searching.p8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(br.readLine());
    int[] input = new int[n];
    for (int i = 0; i < n; i++) {
      input[i] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(input);
    System.out.println(search(input, m));
  }

  static int search(int[] arr, int num) {
    int lt = 0, rt = arr.length - 1, mid = rt / 2;
    while (arr[mid] != num) {
      if (arr[mid] > num) {
        rt = mid;
      }
      if (arr[mid] < num) {
        lt = mid;
      }

      mid = (rt + lt) / 2;
    }

    return mid + 1;
  }
}
