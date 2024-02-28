package s_1_string.p12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int size = Integer.parseInt(br.readLine());
    String input = br.readLine();

    char[] ch = new char[size];
    int gap = input.length() / size;
    for (int i = 0; i < size; i++) {
      int lt = gap * i;
      int rt = lt + gap;

      String tmp = input.substring(lt, rt).replace("#", "1").replace("*", "0");
      ch[i] = (char) Integer.parseInt(tmp, 2);
    }

    System.out.println(ch);
  }
}
