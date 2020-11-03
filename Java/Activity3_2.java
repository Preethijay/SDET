

import java.util.HashSet;

public class Activity3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hs = new HashSet <String>();
		hs.add("M");
		hs.add("C");
		hs.add("A");
		hs.add("s");
		hs.add("B");
		hs.add("f");
		
		
		System.out.println("Print all objects from the list ");
		  for(String s:hs)
			  System.out.println(s);
		  
		
		System.out.println("Print the size of the HashSet " +hs.size());
		System.out.println("Remove letter s " + hs.remove("s"));
		
		System.out.println("Check if the set contains (S) " + hs.contains("S"));
		
		
		System.out.println("Print all objects from the list ");
		  for(String s:hs)
			  System.out.println(s);
		  
		  if(hs.remove("Z" )) {
			  System.out.println("Z is present in the set");
		  }
		  else {
			  System.out.println("Z is not present in the set");
		  }

	}

}
