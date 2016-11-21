import java.util.Observable;
import java.util.Observer;

public class FRTimeObserver implements Observer{

	private String FR = "fr";
	
	@Override
	public void update(Observable o, Object arg) {
		Time time = (Time) o;
		if(arg.equals(FR))
			time.displayFRTime();
	}

}
