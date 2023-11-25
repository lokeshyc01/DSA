public class Main
{
    public static void main(String arr[])
    {
        LinkedList l1 = new LinkedList();

        l1.insertEnd(10);
        l1.insertEnd(20);
        l1.insertEnd(30);
        l1.insertEnd(40);
        l1.insertEnd(101);

        l1.insertFirst(90);
        l1.insertFirst(80);

        l1.insertAtPos(33, 3);
        l1.display();


        l1.deleteFirst();
        l1.display();

        l1.deleteLast();
        l1.display();
        
        
        l1.deleteAtPos(2);
        l1.display();
        // System.out.println("list in reverse order=>");

        // l1.displayRev(l1.getHead());
    }
}