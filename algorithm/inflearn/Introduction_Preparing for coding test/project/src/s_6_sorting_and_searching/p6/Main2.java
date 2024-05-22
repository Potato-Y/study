package s_6_sorting_and_searching.p6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {

  public ArrayList<Integer> solution(int n, int[] arr) {
    ArrayList<Integer> answer = new ArrayList<>();
    int[] tmp = arr.clone();
    for (int i = 0; i < n; i++) {
      if (arr[i] != tmp[i]) {
        answer.add((i + 1));
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    Main2 T = new Main2();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    for (int x : T.solution(n, arr)) {
      System.out.print(x + " ");
    }
  }
}
