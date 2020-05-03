//creating Vector class
//@author Aditi
//Vector approch
import java.util.Vector;
import java.util.Iterator;

public class VectorDemo
{
  public static void main(String[] args)
  {
    Vector <String> V1 = new Vector<String>();
    //adding element into Vector list
    V1.add("Aditi");
    V1.add("Ramdas");
    V1.add("Pawar");
    V1.add(null);
    V1.add("Two");
    System.out.println(V1);
    System.out.println("Capacity:" + V1.capacity());
    System.out.println("Size:" + V1.size());
    System.out.println("---------------------");
    System.out.println("Vector element are:");
    Iterator it = V1.iterator();
    while(it.hasNext())
	  {
		System.out.println(it.next());
	  }
	 }
}


