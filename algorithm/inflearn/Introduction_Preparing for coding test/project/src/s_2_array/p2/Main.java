package s_2_array.p2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());

    int[] line = new int[N];
    for (int i = 0; i < N; i++) {
      line[i] = Integer.parseInt(st.nextToken());
    }

    int max = 0, count = 0;
    for (int height : line) {
      if (max < height) {
        count++;
        max = height;
      }
    }

    System.out.println(count);
  }

}
