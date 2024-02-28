package s_1_string.p5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    Main T = new Main();
    T.run();
  }

  public void run() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char[] input = br.readLine().toCharArray();

    int lt = 0, rt = input.length - 1;
    while (lt < rt) {
      while (!isAlphabet(input[lt])) {
        lt++;
      }
      while (!isAlphabet(input[rt])) {
        rt--;
      }

      char tmp = input[lt];
      input[lt] = input[rt];
      input[rt] = tmp;

      lt++;
      rt--;
    }

    System.out.println(input);
  }

  public boolean isAlphabet(char ch) {
    if ((ch >= 65) && (ch <= 90)) {
      return true;
    } else if ((ch >= 97) && (ch <= 122)) {
      return true;
    }

    return false;
  }
}
