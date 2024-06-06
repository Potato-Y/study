package s_7_recursive_tree_graph.p5;

public class Main2 {

  Node root;

  public void DFS(Node root) {
    if (root == null) {
      return;
    } else {
      System.out.print(root.data + " ");
      DFS(root.lt);
      DFS(root.rt);
    }
  }

  public static void main(String[] args) {
    Main2 tree = new Main2();
    tree.root = new Node(1);
    tree.root.lt = new Node(2);
    tree.root.rt = new Node(3);
    tree.root.lt.lt = new Node(4);
    tree.root.lt.rt = new Node(5);
    tree.root.rt.lt = new Node(6);
    tree.root.rt.rt = new Node(7);
    tree.DFS(tree.root);
  }
}

class Node {

  int data;
  Node lt, rt;

  public Node(int val) {
    data = val;
    lt = rt = null;
  }
}
