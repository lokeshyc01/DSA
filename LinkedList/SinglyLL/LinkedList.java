public class LinkedList {

  private Node Head;
  private Node Last;

  private int count = 0;

  public LinkedList() {
    Head = null;
  }

  public Node getHead() {
    return this.Head;
  }

  public boolean insertFirst(int data) {
    Node newNode = new Node(data);
    if (Head == null) {
      Head = newNode;
      Last = newNode;
    } else {
      newNode.setNext(Head);
      Head = newNode;
    }
    count++;
    return true;
  }

  public boolean insertEnd(int data) {
    Node newNode = new Node(data);
    if (Head == null) {
      Head = newNode;
      Last = newNode;
    } else {
      // takes 0(n) complexity to insert element at end
      // Node temp = Head;

      // while(temp.getNext() != null)
      // {
      //     temp = temp.getNext();
      // }
      // temp.setNext(newNode);

    //   takes 0(1) to add element at the end of linked list
      Last.setNext(newNode);
      Last = newNode;
    }

    count++;
    return true;
  }

  public boolean insertAtPos(int data, int pos) {
    if (pos < 1 && pos > count + 1) {
      return false;
    }

    if (pos == 1) {
      insertFirst(data);
    } else if (pos == count + 1) {
      insertEnd(data);
    }

    Node temp = Head;
    Node newNode = new Node(data);

    for (int iCnt = 1; iCnt < pos - 1; iCnt++) {
      temp = temp.getNext();
    }

    newNode.setNext(temp.getNext());
    temp.setNext(newNode);
    count++;
    return true;
  }

  public void display() {
    Node temp = this.Head;

    while (temp != null) {
      System.out.print(temp.getData() + "=>");
      temp = temp.getNext();
    }
    System.out.print("NULL");
    System.out.println();
  }

  public void displayRev(Node firstNode) {
    if (firstNode == null) {
      return;
    }
    displayRev(firstNode.getNext());
    System.out.print(firstNode.getData() + "=>");
  }

  public boolean deleteFirst()
  {
        if(Head == null)
        {
            return false;
        }

        Head = Head.getNext();
        count--;
        return true;
  }

  public boolean deleteLast()
  {
        if(Head == null)
        {
            return false;
        }

        Node temp = Head;
        while(temp.getNext().getNext() != null)
        {
            temp = temp.getNext();
        }

        Last = temp;
        Last.setNext(null);
        count--;
        return true;
  }

  public boolean deleteAtPos(int pos)
  {
        if(pos < 0 && pos > count)
        {
            return false;
        }

        if(pos == 1)
        {
            deleteFirst();
        }
        else if(pos == count)
        {
            deleteLast();
        }

        Node temp = Head;

        for(int iCnt = 1; iCnt < pos - 1; iCnt++)
        {
            temp = temp.getNext();
        }

        temp.setNext(temp.getNext().getNext());
        count--;
        return true;
  }
}
