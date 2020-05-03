//creating Queue class
//@author Aditi
//Queue approch
import java.util.PriorityQueue;
import java.util.Iterator;

public class QueueDemo
{
  public static void main(String[] args)
  {
    PriorityQueue <Integer> pq = new PriorityQueue<Integer>();
    //adding element into Queue
	 pq.add(28);
    pq.add(80);
    pq.add(28);
    pq.add(15);
    pq.add(90);
    System.out.println(pq);
    System.out.println("---------------------");
    System.out.println("TreeHashSet element are:");
    Iterator it = pq.iterator();
    while(it.hasNext())
     {
      System.out.println(it.next());
     }
    System.out.println("---------------------");
    System.out.println(pq.peek());
    //System.out.println("---------------------");
    //System.out.println(pq.Peek());
    //System.out.println(pq.Poll());
    System.out.println("---------------------");
    System.out.println(pq);
   }
}
