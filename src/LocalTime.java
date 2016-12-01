import java.util.Calendar;
import java.util.Observable;

public class LocalTime extends Observable{
	
	private int hour;
	private int hour_of_day;
	private int minute;
	private int second;
	private int ampm;
	
	public LocalTime() {
		hour = 0;
		hour_of_day = 0;
		minute = 0;
		second = 0;
		ampm = 0;
	}
	
	public void refreshTime() {
		Calendar c = Calendar.getInstance();
		setHourOfDay(c.get(Calendar.HOUR_OF_DAY));
		setHour(c.get(Calendar.HOUR));
		setMinute(c.get(Calendar.MINUTE));
		setSecond(c.get(Calendar.SECOND));
		setAmpm(c.get(Calendar.AM_PM));
	}

	
	public void setHour(int h) {
		this.hour = h;
	}
	
	public void setHourOfDay(int h) {
		this.hour_of_day = h;
	}
	
	public void setMinute(int m) {
		this.minute = m;
	}
	
	public void setSecond(int s) {
		this.second = s;
	}
	
	public void setAmpm(int a) {
		this.ampm = a;
	}
	
	public int getHour() {
		return this.hour;
	}
	
	public int getHourOfDay() {
		return this.hour_of_day;
	}
	
	public int getMinute() {
		return this.minute;
	}
	
	public int getSecond() {
		return this.second;
	}
	
	public int getAmpm() {
		return this.ampm;
	}
}
