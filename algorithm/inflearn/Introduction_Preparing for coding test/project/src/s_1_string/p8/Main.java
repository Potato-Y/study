package s_1_string.p8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();

    StringBuilder sb = new StringBuilder();
    for (char c : input.toCharArray()) {
      if (Character.isAlphabetic(c)) {
        sb.append(c);
      }
    }

    String original = sb.toString();
    if (original.equalsIgnoreCase(sb.reverse().toString())) {
      System.out.println("YES");
      return;
    }

    System.out.println("NO");
  }
}
