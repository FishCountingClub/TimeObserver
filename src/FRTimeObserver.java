import java.util.Observable;
import java.util.Observer;

public class FRTimeObserver implements Observer{
	@Override
	public void update(Observable o, Object arg) {
		FRTime time = (FRTime) o;
		time.display();
	}
}
