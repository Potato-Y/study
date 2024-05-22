package s_6_sorting_and_searching.p6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
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

    int[] sortArr = arr.clone();
    Arrays.sort(sortArr);
    for (int i = 0; i < n; i++) {
      if (arr[i] != sortArr[i]) {
        System.out.print(i + 1 + " ");
      }
    }

  }
}
