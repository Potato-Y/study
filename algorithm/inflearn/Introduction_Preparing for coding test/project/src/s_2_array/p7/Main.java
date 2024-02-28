package s_2_array.p7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());

    int[] input = new int[n];
    for (int i = 0; i < n; i++) {
      input[i] = Integer.parseInt(st.nextToken());
    }

    int score = 0;
    int count = 0;
    for (int i = 0; i < n; i++) {
      if (input[i] == 1) {
        count++;
        score += count;
        continue;
      }

      count = 0;
    }

    System.out.println(score);
  }

}
