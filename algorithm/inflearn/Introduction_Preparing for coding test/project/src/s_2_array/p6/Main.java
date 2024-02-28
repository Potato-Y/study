package s_2_array.p6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());

    StringJoiner sj = new StringJoiner(" ");
    for (int i = 0; i < n; i++) {
      int num = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());

      if (check(num)) {
        sj.add(String.valueOf(num));
      }
    }

    System.out.println(sj);
  }

  static boolean check(int num) {
    boolean[] arr = new boolean[num + 1];
    arr[0] = true;
    arr[1] = true;

    for (int i = 2; i <= num; i++) {
      if (arr[i]) {
        continue;
      }

      for (int j = 2 * i; j <= num; j += i) {
        arr[j] = true;
      }
    }

    return !arr[num];
  }
}
