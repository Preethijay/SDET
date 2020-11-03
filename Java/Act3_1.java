
import java.util.ArrayList;

public class Act3_1 {

	public static void main(String[] args) {
	
  ArrayList <String> myList = new ArrayList <String> ();
  myList.add("one");
  myList.add("two");
  myList.add("three");
  myList.add(1,"four");
  myList.add(3,"five");
  
  
  System.out.println("Print all objects from the list ");
  for(String s:myList)
	  System.out.println(s);
  
  System.out.println("3rd name in the list is " + myList.get(2));
  System.out.println("Check if four is present in the list: " + myList.contains("four"));
  System.out.println("Number of names in an array " + myList.size());
  
  myList.remove("three");
  System.out.println("Number of names in an array " + myList.size());
	}

	
	
	
}
