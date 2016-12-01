import java.util.Observable;
import java.util.Observer;

public class ENTimeObserver implements Observer{

	private String EN = "en";
	
	@Override
	public void update(Observable o, Object arg) {
		Time time = (Time) o;
		if(arg.equals(EN))
			time.displayENTime();
	}

}
