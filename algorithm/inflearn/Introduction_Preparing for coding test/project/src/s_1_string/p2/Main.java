package s_1_string.p2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();
    char[] text = input.toCharArray();

    for (int i = 0; i < text.length; i++) {
      if (text[i] < 97) {
        text[i] += 32;
      } else {
        text[i] -= 32;
      }
    }

    for (char c : text) {
      System.out.printf("%s", c);
    }
  }
}
