
public class StartingThread {
	
	public static void main(String[] args){
		// Create a thread using the CounterRunnable class
		Thread t1 = new Thread(new CounterRunnable());
		
		// Start the thread t1
		t1.start();
		
		//System.out.println("Test");
	}

}
