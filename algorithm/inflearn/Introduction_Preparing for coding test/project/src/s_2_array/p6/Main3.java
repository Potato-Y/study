package s_2_array.p6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * 시험용
 */
public class Main3 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    int[] arr = new int[n];
    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    for (int x : solution(n, arr)) {
      System.out.print(x + " ");
    }
  }

  static ArrayList<Integer> solution(int n, int[] arr) {
    ArrayList<Integer> answer = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      int tmp = arr[i];
      int res = 0;
      while (tmp > 0) {
        int t = tmp % 10;
        res = res * 10 + t;
        tmp = tmp / 10;
      }

      if (isPrime(res)) {
        answer.add(res);
      }
    }

    return answer;
  }

  static boolean isPrime(int num) {
    if (num == 1) {
      return false;
    }

    for (int i = 2; i < num; i++) {
      if (num % i == 0) {
        return false;
      }
    }

    return true;
  }
}
