package s_7_recursive_tree_graph.p3;

/**
 * 팩토리얼
 */
public class Main2 {

  public int DFS(int n) {
    if (n == 1) {
      return 1;
    } else {
      return n * DFS(n - 1);
    }
  }

  public static void main(String[] args) {
    Main2 T = new Main2();
    System.out.println(T.DFS(5));
  }
}
