package s_6_sorting_and_searching.p10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int c = Integer.parseInt(st.nextToken());

    int[] x = new int[n];
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < n; i++) {
      x[i] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(x);

    int lt = x[0], rt = x[x.length - 1], answer = 0;
    while (lt <= rt) {
      int mid = (lt + rt) / 2;
      int count = count(x, mid);
      if (count >= c) {
        answer = mid;
        lt = mid + 1;
      } else {
        rt = mid - 1;
      }
    }

    System.out.println(answer);
  }

  static int count(int[] x, int interval) {
    int answer = 1;
    int step = 1, index = 1;
    for (int i = x[0] + 1; i <= x[x.length - 1]; i++, step++) {
      if (x[index] == i) {
        if (step >= interval) {
          answer++;
          step = 0;
        }
        index++;
      }
    }

    return answer;
  }
}
