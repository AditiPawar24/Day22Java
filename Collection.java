import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Queue;

public class Collection {
	public static void main(String[] args) {

		  LinkedList <String> L1 = new LinkedList<String>();
		  L1.add("Object 1");
		  L1.add("Object 2");
		  L1.add("Object 3");
		  
		  System.out.println(L1.poll());
		  System.out.println(L1.poll());
        System.out.println("print linked list:" +L1);


        System.out.println("Print Array list");

        ArrayList <String> a = new ArrayList<String>();
        a.add("Aditi");
        a.add("Pawar");

        System.out.println(a);

			
	}
}
 
