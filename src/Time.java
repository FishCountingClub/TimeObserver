import java.util.Observable;
import java.util.Calendar;

public class Time extends Observable implements Runnable{
	
	private int hour;
	private int hour_of_day;
	private int minute;
	private int second;
	private int ampm;
	private int tempMinute;
	private int tempSecond;
	
	public Time() {
		hour = 0;
		hour_of_day = 0;
		minute = 0;
		second = 0;
		ampm = 0;
		tempMinute = 0;
		tempSecond = 0;
	}
	
	public void setTime() {
		setTempMinute(getMinute());
		setTempSecond(getSecond());
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
	
	public void setTempMinute(int m) {
		tempMinute = m;
	}
	
	public void setSecond(int s) {
		this.second = s;
	}
	
	public void setTempSecond(int s) {
		this.tempSecond = s;
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
	
	public void displayFRTime() {
		System.out.println(getHourOfDay()+"h"+getMinute());
	}
	
	public void displayENTime() {
		if(ampm == 0)
			System.out.print(getHour()+"AM"+":"+getMinute()+" ");
		else
			System.out.print(getHour()+"PM"+":"+getMinute()+" ");
		if(second < 10)
			System.out.println("0"+second+"s");
		else 
			System.out.println(second+"s");
	}

	@Override
	public void run() {
		while(true) {
			setTime();
			if(second != tempSecond) {
				this.setChanged();
				this.notifyObservers("en");
			}
			if(minute != tempMinute) {
				this.setChanged();
				this.notifyObservers("fr");
			}
		}
	}
}
