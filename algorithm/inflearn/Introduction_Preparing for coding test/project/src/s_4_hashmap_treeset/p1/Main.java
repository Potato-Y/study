package s_4_hashmap_treeset.p1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    HashMap<Character, Integer> candidate = new HashMap<>();
    candidate.put('A', 0);
    candidate.put('B', 0);
    candidate.put('C', 0);
    candidate.put('D', 0);
    candidate.put('E', 0);

    int n = sc.nextInt();
    String vote = sc.next();
    for (int i = 0; i < n; i++) {
      char alphabet = vote.charAt(i);
      candidate.put(alphabet, candidate.get(alphabet) + 1);
    }

    int num = Integer.MIN_VALUE;
    char alphabet = '1';
    for (Map.Entry<Character, Integer> entry : candidate.entrySet()) {
      if (num < entry.getValue()) {
        alphabet = entry.getKey();
        num = entry.getValue();
      }
    }

    System.out.println(alphabet);
  }
}
