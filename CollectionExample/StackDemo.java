//creating Stack class
//@author Aditi
//Stack approch
import java.util.Stack;
import java.util.Iterator;

public class StackDemo
{
  public static void main(String[] args)
  {
    Stack <String> S1 = new Stack<String>();
    //adding element into Stack
    S1.push("Aditi");
    S1.push("Ramdas");
    S1.push("Pawar");
    S1.push(null);
    S1.push("Two");
    System.out.println(S1);
    System.out.println(S1.pop());
    System.out.println(S1.pop());
    //System.out.println("Capacity:" + S1.capacity());
    //System.out.println("Size:" + S1.size());
    System.out.println("---------------------");
    System.out.println("Stack element are:");
    Iterator it = S1.iterator();
    while(it.hasNext())
     {
      System.out.println(it.next());
     }
    }
}

