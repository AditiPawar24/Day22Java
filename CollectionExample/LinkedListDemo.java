//creating Linked list class
//@author Aditi
//List approch
import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListDemo
{
  public static void main(String[] args)
  {
    LinkedList <String> List = new LinkedList<String>();
    //adding element into list
	 List.add("Aditi");
    List.add("Ramdas");
    List.add("Pawar");
    System.out.println(List);

    LinkedList <String> heroin = new LinkedList<String>();
    heroin.add("Aditi");
    heroin.add("pawar");
    System.out.println(heroin);

	 LinkedList <String> L1 = new LinkedList<String>();

    L1.add("Hi");
	 L1.add("I");
    L1.add("am");
	 L1.add("Aditi");
	//Traversing list Through Iterator
    System.out.println("Element are");
	 Iterator it = L1.iterator();
	 while(it.hasNext())
	  {
		System.out.println(it.next());
	  }
   //LinkedList methos are:
   System.out.println("---------------");
   System.out.println(L1.contains("Aditi"));
   System.out.println(L1.containsAll(heroin));

   L1.remove("Aditi");
   System.out.println(L1.contains("Aditi"));

   System.out.println("---------------");
   System.out.println(L1.poll());
   System.out.println(L1.poll());
   it = L1.iterator();
	while(it.hasNext());
	    {
			System.out.println(it.next());
	    }
	System.out.println(L1);
	System.out.println("---------------");
  }
}
