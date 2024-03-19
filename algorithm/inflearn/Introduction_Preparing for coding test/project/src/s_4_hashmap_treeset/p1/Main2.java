package s_4_hashmap_treeset.p1;

import java.util.HashMap;
import java.util.Scanner;

public class Main2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String str = sc.next();
    System.out.println(solution(n, str));
  }

  static char solution(int n, String s) {
    char answer = ' ';

    HashMap<Character, Integer> map = new HashMap<>();
    for (char x : s.toCharArray()) {
      map.put(x, map.getOrDefault(x, 0) + 1);
    }

    int max = Integer.MIN_VALUE;
    for (char key : map.keySet()) {
      if (map.get(key) > max) {
        max = map.get(key);
        answer = key;
      }
    }

    return answer;
  }
}
