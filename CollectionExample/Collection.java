import java.io.*;
import java.util.*;
//import java.util.LinkedList;
//import java.util.ArrayList;
//import java.util.Queue;

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

        //creating object for Array Vector and Hashtasble
        int arr[] = new int[] {1, 2, 3, 4};
        Vector<Integer> v = new Vector();
        Hashtable<Integer, String> h = new Hashtable();
        v.add(1);
        v.addElement(2);
        h.put(1,"geeks");
        System.out.println(arr[0]);
        System.out.println(v.elementAt(0));
        System.out.println(h.get(1));		
	}
}
 
