package s_6_sorting_and_searching.p9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    int lt = 1, rt = 10_000, answer = 10_000;
    while (rt >= lt) {
      int mid = (lt + rt) / 2;
      if (cal(arr, m, mid)) {
        answer = mid;
        rt = mid - 1;
      } else {
        lt = mid + 1;
      }
    }

    System.out.println(answer);
  }

  static boolean cal(int[] arr, int boxSize, int mid) {
    int[] box = new int[boxSize];
    int index = 0;
    for (int i = 0; i < arr.length; i++) {
      if (box[index] + arr[i] > mid) {
        index++;
        if (index == boxSize) { // 박스의 갯수를 넘음
          return false;
        }
        if (arr[i] > mid) { // 최소 크기보다 큼
          return false;
        }
      }
      box[index] += arr[i];
    }

    return true;
  }
}
