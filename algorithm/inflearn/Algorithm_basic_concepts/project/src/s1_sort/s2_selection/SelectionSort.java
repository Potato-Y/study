package s1_sort.s2_selection;

import java.util.Arrays;

/**
 * https://www.programiz.com/dsa/selection-sort
 */
public class SelectionSort {

  static void selectionSort(int[] array) {
    int size = array.length;

    for (int step = 0; step < size; step++) {

      int min_idx = step; // 제일 작은 값이 어디에 있는지 저장

      for (int i = step; i < size; i++) {
        if (array[i] < array[min_idx]) {
          min_idx = i;
        }
      }

      // 내림차순으로 정렬하려면 <
      // 각 반복에서 최소 요소를 선택한다.
      int temp = array[step];
      array[step] = array[min_idx];
      array[min_idx] = temp;
    }
  }

  public static void main(String[] args) {
    int[] data = {20, 12, 10, 15, 2};
    selectionSort(data);
    System.out.println(Arrays.toString(data));
  }
}
