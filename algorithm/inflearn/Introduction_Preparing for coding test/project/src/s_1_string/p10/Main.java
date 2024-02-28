package s_1_string.p10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    StringJoiner sj = new StringJoiner(" ");

    String s = st.nextToken();
    char search = st.nextToken().charAt(0);

    for (int i = 0; i < s.length(); i++) {
      int saveCount = Integer.MAX_VALUE;
      int count = 0;

      for (int j = i; j >= 0; j--) {

        if (s.charAt(j) == search) {
          if (count < saveCount) {
            saveCount = count;
          }
          break;
        }
        count++;
      }

      count = 0;
      for (int j = i; j < s.length(); j++) {
        if (s.charAt(j) == search) {
          if (count < saveCount) {
            saveCount = count;
          }
          break;
        }
        count++;
      }

      sj.add(String.valueOf(saveCount));
    }

    System.out.println(sj);
  }
}
