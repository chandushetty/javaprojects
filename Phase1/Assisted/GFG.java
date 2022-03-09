package assistedpractise;
import java.util.*;
public class GFG {
	 public static void main(String args[])
	    {
	        Queue<String> pq = new PriorityQueue<>();
	 
	        pq.add("vizag");
	        pq.add("vijyawada");
	        pq.add("mtm");
	 
	        System.out.println("Initial Queue " + pq);
	 
	        pq.remove("Geeks");
	 
	        System.out.println("After Remove " + pq);
	 
	        System.out.println("Poll Method " + pq.poll());
	 
	        System.out.println("Final Queue " + pq);
	    }
}
