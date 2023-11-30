public class Main 
{
    public static void main(String arr[])
    {
        Tree t1 = new Tree();

        t1.insert(50);
        t1.insert(40);
        t1.insert(60);
        t1.insert(20);
        t1.insert(80);
        t1.insert(100);
        t1.insert(120);
        t1.insert(95);

        t1.preOrder(t1.getRootNode());
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println(t1.delete(80));
        System.out.println("---------------------------------");
        System.out.println(t1.search(t1.getRootNode(), 20));
        System.out.println("---------------------------------");
        t1.preOrder(t1.getRootNode());
    }    
}
