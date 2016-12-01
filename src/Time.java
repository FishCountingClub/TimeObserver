import java.util.Observable;
import java.util.Calendar;

public class Time extends Observable implements Runnable{
	
	private int hour;
	private int minute;
	
	public Time() {
		hour = 0;
		minute = 0;
	}
	
	public void setTime() {
		Calendar c = Calendar.getInstance();
		setHour(c.get(Calendar.HOUR_OF_DAY));
		setMinute(c.get(Calendar.MINUTE));
	}
	
	public void setHour(int h) {
		this.hour = h;
	}
	
	public void setMinute(int m) {
		this.minute = m;
	}
	
	public int getHour() {
		return this.hour;
	}
	
	public int getMinute() {
		return this.minute;
	}
	
	public void run() {
	}
}
