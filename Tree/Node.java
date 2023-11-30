public class Node
{
    private int data;
    private Node right;
    private Node left;

    public Node(int data)
    {
        this.data = data;
        left = right = null;
    }
    
    public int getData()
    {
        return this.data;
    }

    public void setData(int data)
    {
        this.data = data;
    }

    public Node getRight()
    {
        return this.right;
    }

    public Node getLeft()
    {
        return this.left;
    }

    public void setRight(Node newNode)
    {
        this.right = newNode;
    }

    public void setLeft(Node newNode)
    {
        this.left = newNode;
    }
}

