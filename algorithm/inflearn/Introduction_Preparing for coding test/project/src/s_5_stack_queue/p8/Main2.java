package s_5_stack_queue.p8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main2 {

  public int solution(int n, int m, int[] arr) {
    int answer = 1;
    Queue<Person> Q = new LinkedList<>();
    for (int i = 0; i < n; i++) {
      Q.add(new Person(i, arr[i]));
    }
    while (!Q.isEmpty()) {
      Person tmp = Q.poll();
      for (Person x : Q) {
        if (x.priority > tmp.priority) {
          Q.add(tmp);
          tmp = null;
          break;
        }
      }

      if (tmp != null) {
        if (tmp.id == m) {
          return answer;
        } else {
          answer++;
        }
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    Main2 T = new Main2();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println(T.solution(n, m, arr));
  }
}

class Person {

  int id;
  int priority;

  public Person(int id, int priority) {
    this.id = id;
    this.priority = priority;
  }
}