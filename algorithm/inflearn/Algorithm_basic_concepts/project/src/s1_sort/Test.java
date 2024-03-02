package s1_sort;

import java.util.Arrays;

public class Test {

  static void insertionSort(int[] array) {
    int size = array.length;

    for (int step = 1; step < size; step++) {
      int key = array[step];
      int i = step - 1;

      while (i >= 0 && key < array[i]) {
        array[i + 1] = array[i];
        i--;
      }

      array[i + 1] = key;
    }
  }

  public static void main(String[] args) {
    int[] data = {20, 12, 10, 15, 2};
    insertionSort(data);
    System.out.println(Arrays.toString(data));
  }
}
