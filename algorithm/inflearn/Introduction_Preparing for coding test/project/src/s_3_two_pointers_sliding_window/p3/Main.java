package s_3_two_pointers_sliding_window.p3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());
    int[] sales = new int[n];
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < n; i++) {
      sales[i] = Integer.parseInt(st.nextToken());
    }

    int top = Integer.MIN_VALUE;
    for (int i = 0; i < n - k; i++) {
      int sum = 0;
      for (int j = i; j < i + k; j++) {
        sum += sales[j];
      }
      top = Integer.max(top, sum);
    }

    System.out.println(top);
  }
}
