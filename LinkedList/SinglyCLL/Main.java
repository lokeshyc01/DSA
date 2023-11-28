public class Main 
{
    public static void main(String arr[])
    {
        CircularLL c1 = new CircularLL();

        // insertFirst
        c1.insertFirst(30);
        c1.insertFirst(20);
        c1.insertFirst(10);

        // insertLast
        c1.insertLast(40);
        c1.insertLast(50);
        c1.insertLast(60);

        // insetAtPos
        c1.insertAtPos(25, 3);

        c1.insert(23, 0);

        c1.insert(11, 1);


        c1.insert(45, 4);

        c1.display();
    }    
}
