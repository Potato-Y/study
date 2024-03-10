package s_2_array.p12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken()); // 학생 수
    int m = Integer.parseInt(st.nextToken()); // 시험 수

    int[][] record = new int[m][n];

    // 기록 저장
    for (int i = 0; i < m; i++) {
      st = new StringTokenizer(br.readLine());

      for (int j = 0; j < n; j++) {
        int id = Integer.parseInt(st.nextToken());
        record[i][id - 1] = j + 1;
      }
    }

    int count = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (i == j) {
          continue;
        }
        if (checkRank(record, i, j)) {
          count++;
        }
      }
    }

    System.out.println(count);
  }

  /**
   * s1이 항상 s2보다 등수가 높은지 확인한다.
   *
   * @param s1
   * @param s2
   * @return
   */
  static boolean checkRank(int[][] record, int s1, int s2) {
    for (int i = 0; i < record.length; i++) {
      if (record[i][s1] > record[i][s2]) {
        return false;
      }
    }

    return true;
  }
}
