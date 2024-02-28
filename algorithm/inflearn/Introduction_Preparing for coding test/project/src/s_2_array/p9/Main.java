package s_2_array.p9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    int[][] arr = new int[n][n];
    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      for (int j = 0; j < n; j++) {
        arr[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    int topSum = 0;

    // 가로 더하기
    for (int i = 0; i < n; i++) {
      int sum = Arrays.stream(arr[i]).sum();
      if (topSum < sum) {
        topSum = sum;
      }
    }

    // 세로 더하기
    for (int i = 0; i < n; i++) {
      int sum = 0;
      for (int j = 0; j < n; j++) {
        sum += arr[j][i];
      }

      if (topSum < sum) {
        topSum = sum;
      }
    }

    // 대각선
    int sum = 0;
    for (int i = 0, j = 0; i < n; i++, j++) {
      sum += arr[i][j];
    }
    if (topSum < sum) {
      topSum = sum;
    }

    sum = 0;
    for (int i = 0, j = n - 1; i < n; i++, j--) {
      sum += arr[i][j];
    }
    if (topSum < sum) {
      topSum = sum;
    }

    System.out.println(topSum);
  }
}
