package s_7_recursive_tree_graph.p2;

/**
 * 재귀함수를 이용한 이진수 출력
 */
public class Main2 {

  public void DFS(int n) {
    if (n == 0) {
      return;
    } else {
      DFS(n / 2);
      System.out.print(n % 2 + " ");
    }
  }

  public static void main(String[] args) {
    Main2 T = new Main2();
    T.DFS(11);
  }
}
