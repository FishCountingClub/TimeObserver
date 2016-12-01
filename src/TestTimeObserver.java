
public class TestTimeObserver {

	public static void main(String[] args) {
		
		Time time = new Time();
		LocalTime localTime = new LocalTime();
		
		FRTimeObserver frTimeObserver = new FRTimeObserver();
		ENTimeObserver enTimeObserver = new ENTimeObserver();
		
		time.addObserver(frTimeObserver);
		time.addObserver(enTimeObserver);
		
		while(true) {
			time.setTempTime(localTime.getMinute(), localTime.getSecond());
			localTime.refreshTime();
			time.setTime(localTime.getHourOfDay(), localTime.getHour(), localTime.getMinute(), 
					localTime.getSecond(), localTime.getAmpm());
			time.ENTimeObserver();
			time.FRTimeObserver();
		}
	}
}