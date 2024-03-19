package s_4_hashmap_treeset.p2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    HashMap<Character, Integer> word1 = new HashMap<>();
    HashMap<Character, Integer> word2 = new HashMap<>();

    String input = sc.next();
    for (char c : input.toCharArray()) {
      word1.put(c, word1.getOrDefault(c, 0) + 1);
    }
    input = sc.next();
    for (char c : input.toCharArray()) {
      word2.put(c, word2.getOrDefault(c, 0) + 1);
    }

    if (word1.size() != word2.size()) {
      no();
      return;
    }

    for (Map.Entry<Character, Integer> entry : word1.entrySet()) {
      if (entry.getValue() != word2.getOrDefault(entry.getKey(), 0)) {
        no();
        return;
      }
    }

    System.out.println("YES");
  }

  static void no() {
    System.out.println("NO");
  }
}
