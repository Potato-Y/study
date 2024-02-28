package s_1_string.p6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();

    LinkedHashSet<Character> set = new LinkedHashSet<>();
    for (char c : input.toCharArray()) {
      set.add(c);
    }

    for (char c : set) {
      System.out.printf("%s", c);
    }
  }
}
