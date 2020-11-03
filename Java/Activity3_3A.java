
import java.util.Queue;
import java.util.LinkedList;

public class Activity3_3A {

	public static void main(String[] args) {
		
   Queue<Integer> q = new LinkedList<> ();
   for(int i=0;i<5;i++) {
	   q.add(i);
   }
   System.out.println("Print the list" +q);
  
   int r = q.remove();
	System.out.println("Remove from the list " +r);
	
	System.out.println("Display from the list " +q.peek());
   
	System.out.println("Size of the list " +q.size());
	
	System.out.println("Print the updated list" +q);
   }
   
	
	
	}


