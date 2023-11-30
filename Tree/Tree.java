public class Tree {

  private Node root;

  public Tree() {
    root = null;
  }

  public Node getRootNode() {
    return this.root;
  }

  public boolean insert(int data) {
    Node newNode = new Node(data);

    if (root == null) {
      root = newNode;
      return true;
    }

    Node temp = root;

    while (true) 
    {
      if (data == temp.getData()) 
      {
        return false;
      }

      if (data < temp.getData()) {
        if (temp.getLeft() == null) {
          temp.setLeft(newNode);
          return true;
        }
        temp = temp.getLeft();
      } 
      else 
      {
        if (temp.getRight() == null) {
          temp.setRight(newNode);
          return true;
        }
        temp = temp.getRight();
      }
    }
  }

  public boolean delete(int data) {
    Node delNode = root;
    Node prev = delNode;

    //  go to that respective node
    while (delNode.getData() != data) {
      if (data < delNode.getData()) {
        prev = delNode;
        delNode = delNode.getLeft();
      } else {
        prev = delNode;
        delNode = delNode.getRight();
      }
    }
    // check  if that node is terminal node or not
    if (delNode.getRight() == null && delNode.getLeft() == null) {
      if (prev.getRight() == delNode) {
        prev.setRight(null);
      } else {
        prev.setLeft(null);
      }
      return true;
    } 
    else 
    {
        // check if delete node contains a right subtree
      if (delNode.getRight() != null) {
        Node min = delNode.getRight();

        while (min.getLeft() != null) {
          prev = min;
          min = min.getLeft();
        }

        int temp = min.getData();
        min.setData(delNode.getData());
        delNode.setData(temp);

        delNode = min;
        if (prev.getLeft() == delNode) {
          prev.setLeft(null);
        } else {
          prev.setRight(null);
        }
      }
    //   delnode contains left subtree
      else 
      {
        Node max = delNode.getLeft();

        while (max.getRight() != null) {
          prev = max;
          max = max.getRight();
        }
        int temp = max.getData();
        max.setData(delNode.getData());
        delNode.setData(temp);

        delNode = max;
        if (prev.getLeft() == delNode) {
          prev.setLeft(null);
        } else {
          prev.setRight(null);
        }
      }
      return true;
    }
  }

  public boolean search(Node root, int data) {
    while (true) {
      if (root == null) {
        return false;
      }

      if (data == root.getData()) {
        return true;
      }
      if (data > root.getData()) {
        root = root.getRight();
      } else {
        root = root.getLeft();
      }
    }
  }

  public void preOrder(Node root) {
    if (root == null) {
      return;
    }

    System.out.print(root.getData() + " ");
    preOrder(root.getLeft());
    preOrder(root.getRight());
  }
}
