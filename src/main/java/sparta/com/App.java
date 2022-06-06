package sparta.com;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BinaryT tree =new BinaryT(20);
        tree.addElement(11);
        tree.addElement(12);
        tree.addElement(2344);
        tree.addElement(56);

        System.out.println(tree.findElement(11));
    }


}
