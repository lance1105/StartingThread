
// make a class which is a thread implemented through runnable
public class CounterRunnable implements Runnable {

	@Override
	public void run() {
		for (int i=0;i<10;i++){
			System.out.println(i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block made a change (and made this)
				e.printStackTrace();
			}
		}
		
	}

}
