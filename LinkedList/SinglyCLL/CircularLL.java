import javax.swing.text.Position;

public class CircularLL 
{
    private Node last;
    private Node head;
    private static int count;

    public CircularLL()
    {
        head = null;
        last = null;
    }

    public boolean insertFirst(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            last = newNode;
            newNode.setNext(head);
            return true;
        }

        if(head.getNext() == head)
        {
           newNode.setNext(head);
           head.setNext(newNode);
           head  = newNode;
            return true;
        }

        Node temp = head;

        while(temp.getNext() != head)
        {
            temp = temp.getNext();
        }

        newNode.setNext(head);
        head = newNode;
        temp.setNext(head);
        count++;
        return true;
    }

    public boolean insertLast(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            last = newNode;
            newNode.setNext(head);
            return true;
        }

        if(head.getNext() == head)
        {
            head.setNext(newNode);
            newNode.setNext(head);
            last = newNode;
            return true;
        }

        Node temp = head;
        
        while(temp.getNext()!=head)
        {
            temp = temp.getNext();
        }

        temp.setNext(newNode);
        newNode.setNext(head);
        last = newNode;
        count++;
        return true;
    }

    public boolean insertAtPos(int data,int position)
    {
        Node newNode = new Node(data);

        Node temp = head;

        for(int iCnt = 1;iCnt < position - 1 ; iCnt++)
        {
            temp = temp.getNext();
        }

        newNode.setNext(temp.getNext());
        temp.setNext(newNode);
        count++;
        return true;
    }

    public boolean insert(int data,int position)
    {
        if(position < 1 || position > count+1)
        {
            return false;
        }

        if(position == 1)
        {
            insertFirst(data);
        }
        else if(position == count + 1)
        {
            insertLast(data);
        }
        else
        {
            insertAtPos(data, position);
        }

        return true;
    }

    public boolean deleteFirst()
    {
        if(head == null)
        {
            return false;
        }

        if(head.getNext() == head)
        {
            head = null;
            last = null;
            count--;
            return true;
        }
        
        head = head.getNext();
        last.setNext(head);
        count--;
        return true;
    }

    public boolean deleteLast()
    {
        if(head == null)
        {
            return false;
        }

        if(head.getNext() == head)
        {
            count--;
            head = null;
            last = null;
        }
         Node temp = head;

         while(temp.getNext().getNext() != head) 
         {
            temp = temp.getNext();
         }
         
         last = temp;
         last.setNext(head);
         count--;
         return true;
    }

    public boolean deleteAtPos(int position)
    {
        if(head == null)
        {
            return false;
        }

        if(head.getNext() == head)
        {
            count--;
            head = null;
            last = null;
        }
        
        Node temp = head;
        for(int iCnt = 1; iCnt < position - 1; iCnt++)
        {
            temp = temp.getNext();
        }

        temp.setNext(temp.getNext().getNext());
        count--;
        return true;
    }

    public boolean delete(int position)
    {
        if(position < 1 || position > count)
        {
            return false;
        }

        if(position == 1)
        {
            deleteFirst();
        }
        else if(position == count)
        {
            deleteLast();
        }
        else
        {
            deleteAtPos(position);
        }
        return true;
    }

    public boolean deleteByValue(int data)
    {
        if(head == null)
        {
            return false;
        }

        if(head.getNext() == head)
        {
            if(head.getData() == data)
            {
                count--;
                head = null;
                last = null;
                return true;
            }
            return false;
        }

        if(head.getData() == data)
        {
            deleteFirst();
            return true;
        }

        if(last.getData() == data)
        {
            deleteLast();
            return true;
        }

        Node temp = head;
        Node prev = null;
        while(temp.getData() != data)
        {
            prev = temp;
            temp = temp.getNext();
        }
        prev.setNext(temp.getNext());
        count--;
        return true;
    }

    public void display()
    {
        Node temp = head;

       do{
            System.out.print(temp.getData()+" => ");
            temp = temp.getNext();
       }while(temp!=head);
    }
    
}
