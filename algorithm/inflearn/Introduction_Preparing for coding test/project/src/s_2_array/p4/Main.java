package s_2_array.p4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringJoiner;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringJoiner sj = new StringJoiner(" ");
    int N = Integer.parseInt(br.readLine());

    int num1 = 1;
    int num2 = 1;
    sj.add(String.valueOf(num1));
    sj.add(String.valueOf(num2));
    for (int i = 0; i < N - 2; i++) {
      int sum = num1 + num2;
      num1 = num2;
      num2 = sum;
      sj.add(String.valueOf(sum));
    }

    System.out.println(sj);
  }
}
