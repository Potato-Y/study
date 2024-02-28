package s_1_string.p7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();
    input = input.toLowerCase();

    for (int i = 0; i < input.length() / 2; i++) {
      if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
        System.out.println("NO");
        return;
      }
    }

    System.out.println("YES");
  }
}
