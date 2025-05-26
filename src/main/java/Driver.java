import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("Count:" + counter.getCount());
		
		counter.increment(10);
		
		System.out.println("Count:" + counter.getCount());
		
		counter.decrement(5);
		
		System.out.println("Count:" + counter.getCount());
		
	}

}
