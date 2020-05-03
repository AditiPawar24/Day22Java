//@author Aditi
//Set approch
import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSetDemo
{
  public static void main(String[] args)
  {
    LinkedHashSet <Integer> H1 = new LinkedHashSet<Integer>();
    //adding element into list
    H1.add(22);
    H1.add(23);
    H1.add(24);
    H1.add(26);
    H1.add(25);
    System.out.println(H1);
    System.out.println("---------------------");
    // traversing list using Iterator
    System.out.println("HashSet element are:");
    Iterator it = H1.iterator();
    while(it.hasNext())
     {
      System.out.println(it.next());
     }
    }
}

