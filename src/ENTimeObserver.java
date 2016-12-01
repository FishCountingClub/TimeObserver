import java.util.Observable;
import java.util.Observer;

public class ENTimeObserver implements Observer{
	@Override
	public void update(Observable o, Object arg) {
		ENTime time = (ENTime) o;
		time.display();
	}
}
