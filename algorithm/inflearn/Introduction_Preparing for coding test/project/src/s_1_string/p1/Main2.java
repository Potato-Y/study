package s_1_string.p1;

import java.util.Scanner;

public class Main2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    char search = sc.next().charAt(0);

    input = input.toLowerCase();
    search = Character.toLowerCase(search);

    int count = 0;
//    for (int i = 0; i < input.length(); i++) {
//      if (input.charAt(i) == search) {
//        count++;
//      }
//    }
//    또는
    for (char c : input.toCharArray()) {
      if (c == search) {
        count++;
      }
    }

    System.out.println(count);
  }
}
