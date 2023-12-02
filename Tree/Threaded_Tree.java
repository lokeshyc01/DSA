public class BST {
    private Node root;

    public BST() {
        root = null;
    }

    public boolean insert(int data) {
        Node newNode = new Node(data);

        if (root == null) {
            root = newNode;
            return true;
        }

        Node temp = root;
        while (true) {
            if (temp.getData() == data) {
                return false;
            }

            // left node insertion
            if (data < temp.getData()) {
                if (temp.getLeft() == null) {
                    // temp.setLeft(newNode);
                    newNode.setRight(temp);
                    newNode.setLeft(null);
                    temp.setLeft(newNode);
                    temp.setlflag('L');
                    return true;
                }
                temp = temp.getLeft();
            }
            // right node insertion
            else {
                if (temp.getRight() == null) {
                    newNode.setRight(temp.getRight());
                    temp.setRight(newNode);
                    temp.setrflag('L');
                    return true;
                }
                temp = temp.getRight();
            }
        }
    }

    public void InOrder() {
        Node temp = root;

        while (temp != null) {
            while (temp.getLeft() != null) {
                temp = temp.getLeft();
            }
            System.out.println(temp.getData() + " ");
            char flag = temp.rflag();
            temp = temp.getRight();
            if (flag == 'T') {
                System.out.println(temp.getData() + " ");
            }

            flag = temp.rflag();
            temp = temp.getRight();
        }
    }

}
