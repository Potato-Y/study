package s_6_sorting_and_searching.p3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/// 참고 자료: https://velog.io/@kimdukbae/%EC%A0%95%EB%A0%AC-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-Sorting-Algorithm#%EC%82%BD%EC%9E%85-%EC%A0%95%EB%A0%AC-insertion-sort
public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    for (int i = 1; i < n; i++) {
      for (int j = i; j >= 0; j--) {
        if (arr[j] < arr[j - 1]) {
          int tmp = arr[j];
          arr[j] = arr[j - 1];
          arr[j - 1] = tmp;
        } else {
          break;
        }
      }
    }

    for (int x : arr) {
      System.out.print(x + " ");
    }
  }
}
