package s_6_sorting_and_searching.p7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Coordinate[] coordinates = new Coordinate[n];
    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      coordinates[i] = new Coordinate(st.nextToken(), st.nextToken());
    }
    Arrays.sort(coordinates);

    for (Coordinate c : coordinates) {
      System.out.println(c.x + " " + c.y);
    }
  }
}

class Coordinate implements Comparable<Coordinate> {

  int x;
  int y;

  public Coordinate(String x, String y) {
    this.x = Integer.parseInt(x);
    this.y = Integer.parseInt(y);
  }

  @Override
  public int compareTo(Coordinate o) {
    if (this.x == o.x) {
      return this.y - o.y;
    } else {
      return x - o.x;
    }
  }
}
