
public class TestTimeObserver {

	public static void main(String[] args) {
		
		ENTime enTime = new ENTime();
		FRTime frTime = new FRTime();
		
		ENTimeObserver enObserver = new ENTimeObserver();
		FRTimeObserver frObserver = new FRTimeObserver();
		
		enTime.addObserver(enObserver);
		frTime.addObserver(frObserver);
		
		new Thread(enTime).start();
		new Thread(frTime).start();
	}
}
