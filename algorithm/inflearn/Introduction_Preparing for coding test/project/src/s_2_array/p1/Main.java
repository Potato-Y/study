package s_2_array.p1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int[] input = new int[N];

    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    for (int i = 0; i < N; i++) {
      input[i] = Integer.parseInt(st.nextToken());
    }

    StringJoiner sj = new StringJoiner(" ");

    int tmp = Integer.MIN_VALUE;
    for (int num : input) {
      if (tmp < num) {
        sj.add(String.valueOf(num));
      }
      tmp = num;
    }

    System.out.println(sj);
  }

}
