package s_7_recursive_tree_graph.p1;

/**
 * 재귀함수
 */
public class Main2 {

  public void DFS(int n) {
    if (n == 0) {
      return;
    } else {
      DFS(n - 1);
      System.out.print(n + " ");
    }
  }

  public static void main(String[] args) {
    Main2 T = new Main2();
    T.DFS(3);
  }
}
