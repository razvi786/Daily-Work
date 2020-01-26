//Java Program to Calculate Difference Between Two Time Periods

package com.cts.practise;

class TimePeriod{
	int hour;
	int min;
	int sec;
	public TimePeriod(int hour, int min, int sec) {
		super();
		this.hour = hour;
		this.min = min;
		this.sec = sec;
	}
}

public class TimePeriods {
	
	static TimePeriod calculate(TimePeriod t1,TimePeriod t2) {
		
		int hour,min,sec;
		hour=Math.abs(t1.hour-t2.hour);
		min=Math.abs(t1.min-t2.min);
		sec=Math.abs(t1.sec-t2.sec);
		if(t1.sec<t2.sec)
			min--;
		if(t1.min<t2.min)
			hour--;
		
		
		
		TimePeriod tp=new TimePeriod(hour, min, sec);
		return tp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TimePeriod t1=new TimePeriod(14, 25, 30);
		TimePeriod t2=new TimePeriod(12, 25, 45);
		
		TimePeriod t3=calculate(t1,t2);
		
		System.out.println(t3.hour+" : "+t3.min+" : "+t3.sec);

	}

}
