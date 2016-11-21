
public class TestTimeObserver {

	public static void main(String[] args) {
		
		Time time = new Time();
		
		FRTimeObserver frTimeObserver = new FRTimeObserver();
		ENTimeObserver enTimeObserver = new ENTimeObserver();
		
		time.addObserver(frTimeObserver);
		time.addObserver(enTimeObserver);
		
		new Thread(time).start();
	}
}