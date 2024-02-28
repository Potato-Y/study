package s_2_array.p10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    int[][] grid = new int[n + 2][n + 2];
    for (int i = 1; i < n + 1; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      for (int j = 1; j < n + 1; j++) {
        grid[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    int count = 0;
    for (int i = 1; i < n + 1; i++) {
      for (int j = 1; j < n + 1; j++) {
        int thisHeight = grid[i][j];

        if (thisHeight <= grid[i - 1][j]) {
          continue;
        }
        if (thisHeight <= grid[i][j - 1]) {
          continue;
        }
        if (thisHeight <= grid[i + 1][j]) {
          continue;
        }
        if (thisHeight <= grid[i][j + 1]) {
          continue;
        }

        count++;
      }
    }

    System.out.println(count);
  }
}
