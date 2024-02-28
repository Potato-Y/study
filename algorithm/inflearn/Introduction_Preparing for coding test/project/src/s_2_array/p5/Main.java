package s_2_array.p5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());

    boolean[] arr = new boolean[num + 1];

    // 소수의 경우 true
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

    int count = 0;
    for (int i = 2; i <= num; i++) {
      if (!arr[i]) {
        count++;
      }
    }

    System.out.println(count);
  }
}
