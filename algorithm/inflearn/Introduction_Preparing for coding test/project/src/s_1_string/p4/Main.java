package s_1_string.p4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    for (int i = 0; i < N; i++) {
      String input = br.readLine();
      for (int j = input.length() - 1; j >= 0; j--) {
        System.out.print(input.charAt(j));
      }
      System.out.println();
    }
  }
}
