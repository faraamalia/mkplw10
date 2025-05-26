import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("Count:" + counter.getCount(4));
		
		counter.increment(3);
		
		System.out.println("Count:" + counter.getCount(5));
		
		counter.decrement(2);
		
		System.out.println("Count:" + counter.getCount(6));
		
	}

}
