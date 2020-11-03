import java.util.*;


public class Activity3_3B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Deque <String> dq = new LinkedList<String>();
		
		dq.add("Panda");
		dq.add("Bull");
		dq.add("Ox");
		
		dq.offer("Cow");
		dq.offerFirst("Tiger");
		dq.offerLast("Lion");
		
		System.out.println("Display the list " +dq);
		
		Iterator<String> iterator = dq.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
			
		System.out.println("Head element :" +dq.peekFirst());
		System.out.println("Last element :" + dq.peekLast());
			
		System.out.println("Check if WOLF is present " +dq.contains("Wolf") );
		
		System.out.println("Remove the first elment :" +dq.removeFirst());
		System.out.println("Remove the last element :" +dq.removeLast());
		
		System.out.println("Size of queue : " +dq.size());
		}
		
	}


