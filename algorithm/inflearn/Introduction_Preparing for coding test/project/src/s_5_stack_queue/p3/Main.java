package s_5_stack_queue.p3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int inputSize = Integer.parseInt(br.readLine());

    int[][] box = new int[inputSize][inputSize];
    for (int i = 0; i < inputSize; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      for (int j = 0; j < inputSize; j++) {
        box[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    Stack<Integer> getBox = new Stack<>();
    int getSize = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());

    int boomCount = 0;
    for (int i = 0; i < getSize; i++) {
      int item = getItem(box, Integer.parseInt(st.nextToken()));
      if (item == -1) {
        continue;
      }
      if (getBox.isEmpty()) {
        getBox.push(item);
        continue;
      }
      if (getBox.peek() == item) {
        boomCount += 2;
        getBox.pop();
        continue;
      }

      getBox.push(item);
    }

    System.out.println(boomCount);
  }

  static int getItem(int[][] box, int index) {
    for (int i = 0; i < box.length; i++) {
      if (box[i][index - 1] != 0) {
        int item = box[i][index - 1];
        box[i][index - 1] = 0;
        return item;
      }
    }

    return -1;
  }
}
