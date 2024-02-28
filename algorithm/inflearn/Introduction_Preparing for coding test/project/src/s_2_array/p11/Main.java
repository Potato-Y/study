package s_2_array.p11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[][] students = new int[n][5];

    // 정보 받기
    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      for (int j = 0; j < 5; j++) {
        students[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    // 최고 학생 저장
    int saveCount = Integer.MIN_VALUE, studentId = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) { // i 번째 학생에 대해 계산

      int count = 0;
      for (int j = 0; j < n; j++) { // 학년별 비교
        for (int k = 0; k < 5; k++) {
          if (students[i][k] == students[j][k]) {
            count++;
            break; // 사람 수 이기 때문에 이 사람에 대한 체크는 그만한다.
          }
        }
      }

      if (saveCount < count) {
        saveCount = count;
        studentId = i;
      }
    }

    System.out.println(studentId + 1);
  }
}