//@author Aditi
//Set approch
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo
{
  public static void main(String[] args)
  {
    HashSet <Integer> H1 = new HashSet<Integer>();
    //adding element into Vector list
    H1.add(22);
    H1.add(23);
    H1.add(24);
    H1.add(null);
    H1.add(25);
    System.out.println(H1);
    System.out.println("---------------------");
    System.out.println("HashSet element are:");
    Iterator it = H1.iterator();
    while(it.hasNext())
     {
      System.out.println(it.next());
     }
    }
}

