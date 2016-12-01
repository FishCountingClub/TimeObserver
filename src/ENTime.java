import java.util.Calendar;

public class ENTime extends Time{
	
	private int second;
	private int ampm;
	private int tempSecond;
	
	public ENTime() {
		super();
		second = 0;
		ampm = 0;	
		tempSecond = 0;
	}
	
	public void run() {
		while(true) {
			setTime();
			if(second != tempSecond) {
				this.setChanged();
				this.notifyObservers();
			}
		}
	}
	
	public void setTime() {
		setTempSecond(second);
		Calendar c = Calendar.getInstance();
		setHour(c.get(Calendar.HOUR));
		setMinute(c.get(Calendar.MINUTE));
		setSecond(c.get(Calendar.SECOND));
		setAmpm(c.get(Calendar.AM_PM));
	}
	
	public void setSecond(int s) {
		this.second = s;
	}
	
	public void setAmpm(int a) {
		this.ampm = a;
	}
	
	public void setTempSecond(int s) {
		this.tempSecond = s;
	}
	
	public void display() {
		if(ampm == 0)
			System.out.print(getHour()+"AM"+":"+getMinute()+" ");
		else
			System.out.print(getHour()+"PM"+":"+getMinute()+" ");
		if(second < 10)
			System.out.println("0"+second+"s");
		else 
			System.out.println(second+"s");
	}
}
