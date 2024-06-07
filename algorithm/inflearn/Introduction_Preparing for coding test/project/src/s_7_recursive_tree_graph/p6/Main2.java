package s_7_recursive_tree_graph.p6;

public class Main2 {

  static int n;
  static int[] ch;

  public void DFS(int L) {
    if (L == n + 1) {
      String tmp = "";
      for (int i = 1; i <= n; i++) {
        if (ch[i] == 1) {
          tmp += i + " ";
        }
      }

      if (tmp.length() > 0) {
        System.out.println(tmp);
      }
    } else {
      ch[L] = 1; // L 사용
      DFS(L + 1);
      ch[L] = 0; // L 미사용
      DFS(L + 1);
    }
  }

  public static void main(String[] args) {
    Main2 T = new Main2();
    n = 3;
    ch = new int[n + 1];
    T.DFS(1);
  }
}
