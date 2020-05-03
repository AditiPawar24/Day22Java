//creating Array list class
//@author Aditi
//List approch
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo
{
  public static void main(String[] args)
  {
    ArrayList <String> a1 = new ArrayList<String>();
    //adding element into list
	a1.add("Aditi");
    a1.add("Ramdas");
    a1.add("Pawar");
    System.out.println(a1);
	
	ArrayList <String> heroin = new ArrayList<String>();
    heroin.add("Aditi");
    heroin.add("pawar");
    System.out.println(heroin);
	
	ArrayList <String> film = new ArrayList<String>();
    film.add("Baghi");
    film.add("Baghi2");
	film.add("Mahabharat");
	film.addAll(heroin);
	//Traversing list Through Iterator
    System.out.println("film element are");
	Iterator it = film.iterator();
	while(it.hasNext())
	  {
		System.out.println(it.next());
	  }
	 
   //ArrayList methos are:
   System.out.println("---------------");
   System.out.println(film.contains("Baghi"));
   System.out.println(film.containsAll(heroin));
   
   film.remove("Baghi2");
   System.out.println(film.contains("Baghi2"));
   film.removeAll(heroin);
   System.out.println(film.containsAll(heroin));

   System.out.println("---------------");
   
    it = film.iterator();
	while(it.hasNext());
	    {	
			System.out.println(it.next());
	    }
	System.out.println(film);
	System.out.println("---------------");
    film.clear();
  }  
}

