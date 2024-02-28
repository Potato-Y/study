package s_2_array.p3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class Main {

  static final int SCISSORS = 1; // 가위
  static final int ROCK = 2; // 바위
  static final int PAPER = 3; // 보

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringJoiner sj = new StringJoiner("\n");
    int N = Integer.parseInt(br.readLine());

    int[] A = new int[N];
    int[] B = new int[N];

    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      A[i] = Integer.parseInt(st.nextToken());
    }
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      B[i] = Integer.parseInt(st.nextToken());
    }

    for (int i = 0; i < N; i++) {
      sj.add(match(A[i], B[i]));
    }

    System.out.println(sj);
  }

  static String match(int A, int B) {
    switch (A) {
      case SCISSORS:
        if (B == ROCK) {
          return "B";
        }
        if (B == PAPER) {
          return "A";
        }
        break;
      case ROCK:
        if (B == SCISSORS) {
          return "A";
        }
        if (B == PAPER) {
          return "B";
        }
        break;
      case PAPER:
        if (B == SCISSORS) {
          return "B";
        }
        if (B == ROCK) {
          return "A";
        }
        break;
    }

    return "D";
  }

}
