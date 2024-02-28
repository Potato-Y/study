package s_1_string.p11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  static StringBuilder sb = new StringBuilder();
  static char tmp;
  static int count = 0; // 첫 시작을 위해 0으로 초기화


  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();

    tmp = input.charAt(0);

    for (char c : input.toCharArray()) {
      if (c == tmp) {
        count++;
        continue;
      }

      append();
      tmp = c;
      count = 1;
    }
    append();

    System.out.println(sb);
  }

  static void append() {
    sb.append(tmp);

    if (count != 1) {
      sb.append(count);
    }
  }

}
