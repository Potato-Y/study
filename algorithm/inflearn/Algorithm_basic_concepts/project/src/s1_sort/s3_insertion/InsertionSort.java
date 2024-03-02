package s1_sort.s3_insertion;

import java.util.Arrays;

public class InsertionSort {

  static void insertionSort(int[] array) {
    int size = array.length;

    for (int step = 1; step < size; step++) {
      int key = array[step];
      int j = step - 1;

      // 키보다 작은 요소가 발견될 때까지 키를 왼쪽에 있는 각 요소와 비교한다.
      // 내림차순은 >로 변경한다.
      while (j >= 0 && key < array[j]) {
        array[j + 1] = array[j];
        --j;
      }

      // 키보다 작은 요소 뒤에 키를 배치한다.
      array[j + 1] = key;
    }
  }

  public static void main(String[] args) {
    int[] data = {9, 5, 1, 4, 3};
    insertionSort(data);
    System.out.println(Arrays.toString(data));
  }
}
