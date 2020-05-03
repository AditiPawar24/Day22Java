//@author Aditi
//Set approch
//package Set;
import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetDemo
{
  public static void main(String[] args)
  {
    TreeSet <Integer> t1 = new TreeSet<Integer>();
    //adding element into Treeset
    t1.add(22);
    t1.add(23);
    t1.add(24);
    t1.add(26);
    t1.add(25);
    System.out.println(t1);
    System.out.println("---------------------");
    System.out.println("TreeHashSet element are:");
    Iterator it = t1.iterator();
    while(it.hasNext())
     {
      System.out.println(it.next());
     }
    System.out.println("---------------------");
    // Travers element in descending order
    System.out.println("TreeHashSet element are:");
    Iterator it1 = t1.descendingIterator();
    while(it1.hasNext())
     {
      System.out.println(it1.next());
     }

    }
}

