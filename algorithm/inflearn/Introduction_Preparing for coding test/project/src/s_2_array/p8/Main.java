package s_2_array.p8;

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

    int[] score = new int[n];
    int[] rank = new int[n];

    for (int i = 0; i < n; i++) {
      score[i] = Integer.parseInt(st.nextToken());
    }

    for (int i = 0; i < n; i++) {
      rank[i]++; // 기본 1명 증가
      
      for (int j = 0; j < n; j++) {
        if (score[i] < score[j]) {
          rank[i]++;
        }
      }
    }

    StringJoiner sj = new StringJoiner(" ");
    for (int i = 0; i < n; i++) {
      sj.add(String.valueOf(rank[i]));
    }
    System.out.println(sj);
  }
}
