package s1_sort.s1_bubble;

import java.util.Arrays;

/**
 * https://www.programiz.com/dsa/bubble-sort
 */
public class BubbleSort {

  static void bubbleSort(int[] array) {
    int size = array.length;

    // 각 요소 하나씩 반복
    for (int i = 0; i < (size - 1); i++) {

      // 배열 요소를 비교하는 루프
      for (int j = 0; j < (size - i - 1); j++) {

        // 인접한 두 요소를 비교한다.
        // 만약 내림차순으로 정렬하려면 <로 변경한다.
        if (array[j] > array[j + 1]) {

          // 요소를 교체한다.
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }
    }
  }

  static void optimizationBubbleSort(int[] array) {
    int size = array.length;

    // 각 요소 하나씩 반복
    for (int i = 0; i < (size - 1); i++) {

      // 교환이 발생하는지 확인
      boolean swapped = false;

      // 배열 요소를 비교하는 루프
      for (int j = 0; j < (size - i - 1); j++) {

        // 인접한 두 요소를 비교한다.
        // 만약 내림차순으로 정렬하려면 <로 변경한다.
        if (array[j] > array[j + 1]) {

          // 요소를 교체한다.
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;

          swapped = true;
        }
      }

      if (!swapped) {
        break;
      }
    }
  }

  public static void main(String[] args) {

    int[] data = {-2, 45, 0, 11, -9};
    bubbleSort(data);
    System.out.println(Arrays.toString(data));

    int[] data2 = {-2, 45, 0, 11, -9};
    optimizationBubbleSort(data2);
    System.out.println(Arrays.toString(data2));
  }
}
