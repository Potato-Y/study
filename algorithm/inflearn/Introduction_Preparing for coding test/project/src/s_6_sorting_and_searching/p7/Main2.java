package s_6_sorting_and_searching.p7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<Point> arr = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      arr.add(new Point(x, y));
    }

    Collections.sort(arr);
    for (Point o : arr) {
      System.out.println(o.x + " " + o.y);
    }
  }
}

class Point implements Comparable<Point> {

  public int x, y;

  Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public int compareTo(Point o) {
    // 내림차순 object - this
    // 오름차순 this - object
    if (this.x == o.x) {
      return this.y - o.y;
    } else {
      return this.x - o.x;
    }
  }
}
