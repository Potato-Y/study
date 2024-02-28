package s_1_string.p1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();
    String search = br.readLine();

    input = input.toLowerCase();
    search = search.toLowerCase();

    int count = 0;
    for (int i = 0; i < input.length(); i++) {
      if (input.charAt(i) == search.charAt(0)) {
        count++;
      }
    }

    System.out.println(count);
  }
}
