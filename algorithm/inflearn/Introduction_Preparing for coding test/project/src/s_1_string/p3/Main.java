package s_1_string.p3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] input = br.readLine().split(" ");
    int count = 0, index = 0;
    for (int i = 0; i < input.length; i++) {
      if (input[i].length() > count) {
        count = input[i].length();
        index = i;
      }
    }

    System.out.println(input[index]);
  }
}
