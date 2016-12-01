import java.util.Calendar;

public class FRTime extends Time{
	
	private int tempMinute;
	
	public FRTime() {
		super();
		tempMinute = 0;
	}
	
	public void run() {
		while(true) {
			setTime();
			if(getMinute() != tempMinute) {
				this.setChanged();
				this.notifyObservers();
			}
		}
	}
	
	public void setTime() {
		setTempMinute(getMinute());
		Calendar c = Calendar.getInstance();
		setHour(c.get(Calendar.HOUR_OF_DAY));
		setMinute(c.get(Calendar.MINUTE));
	}
	
	public void setTempMinute(int m) {
		tempMinute = m;
	}
	
	public void display() {
		System.out.println(getHour()+"h"+getMinute());
	}
}
