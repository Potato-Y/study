package s_6_sorting_and_searching.p4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int size = Integer.parseInt(st.nextToken());
    int n = Integer.parseInt(st.nextToken());

    int[] work = new int[n];
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < n; i++) {
      work[i] = Integer.parseInt(st.nextToken());
    }

    Cache cache = new Cache(size);
    for (int x : work) {
      cache.run(x);
    }

    for (int x : cache.work) {
      System.out.print(x + " ");
    }
  }
}

class Cache {

  int[] work;

  public Cache(int size) {
    work = new int[size];
  }

  public void run(int id) {
    int index = indexOf(id);
    if (index == -1) {
      for (int i = work.length - 1; i > 0; i--) {
        work[i] = work[i - 1];
      }
      work[0] = id;
      return;
    }

    for (int i = index; i > 0; i--) {
      int tmp = work[i];
      work[i] = work[i - 1];
      work[i - 1] = tmp;
    }
  }

  /**
   * id의 위치를 반환
   *
   * @param id 찾을 id
   * @return id의 위치, 없을 경우 -1
   */
  private int indexOf(int id) {
    for (int i = 0; i < work.length; i++) {
      if (work[i] == id) {
        return i;
      }
    }

    return -1;
  }
}
