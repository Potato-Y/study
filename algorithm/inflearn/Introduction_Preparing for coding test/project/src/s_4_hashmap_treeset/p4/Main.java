package s_4_hashmap_treeset.p4;

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str1 = sc.next();
    String str2 = sc.next();

    HashMap<Character, Integer> checkWord = new HashMap<>();
    HashMap<Character, Integer> searchWord = new HashMap<>();

    for (char c : str2.toCharArray()) {
      searchWord.put(c, searchWord.getOrDefault(c, 0) + 1);
    }

    int count = 0;
    for (int i = 0; i < str2.length() - 1; i++) {
      checkWord.put(str1.charAt(i), checkWord.getOrDefault(str1.charAt(i), 0) + 1);
    }
    for (int i = str2.length() - 1; i < str1.length(); i++) {
      checkWord.put(str1.charAt(i), checkWord.getOrDefault(str1.charAt(i), 0) + 1);
      if (match(checkWord, searchWord)) {
        count++;
      }

      // 맨 앞 알파벳 삭제
      char c = str1.charAt(i - str2.length() + 1);
      checkWord.put(c, checkWord.get(c) - 1);
      if (checkWord.get(c) == 0) {
        checkWord.remove(c);
      }
    }

    System.out.println(count);
  }

  static boolean match(HashMap<Character, Integer> checkWord,
      HashMap<Character, Integer> searchWord) {
    for (char c : searchWord.keySet()) {
      if (!checkWord.containsKey(c)) {
        return false;
      }
      if (!Objects.equals(checkWord.get(c), searchWord.get(c))) {
        return false;
      }
    }

    return true;
  }
}
