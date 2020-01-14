package com.cts.date;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Local Date
		LocalDate date=LocalDate.now();
		System.out.println(date);
		int day=date.getDayOfMonth();
		int month=date.getMonthValue();
		int year=date.getYear();
		System.out.printf("%02d : %02d : %04d\n",day,month,year);
		
		//Local Time
		LocalTime time=LocalTime.now();
		System.out.println(time);
		int hour=time.getHour();
		int minute=time.getMinute();
		int second=time.getSecond();
		int nanosecond=time.getNano();
		System.out.printf("%02d : %02d : %02d . %d\n",hour,minute,second,nanosecond);
		
		//Specified Date
		LocalDate date2=LocalDate.of(1997, 6, 27);
		 day=date2.getDayOfMonth();
		 month=date2.getMonthValue();
		 year=date2.getYear();
		System.out.printf("%02d : %02d : %04d\n",day,month,year);
		
		//Equals
		LocalDate date3=date2;
		System.out.println("Date Equals? : "+date3.equals(date2));
		
		//Month Day to Check Major Events
		LocalDate date4=LocalDate.now();
		LocalDate date5=LocalDate.of(2020,01,15);
		MonthDay holiday=MonthDay.of(date5.getMonthValue(), date5.getDayOfMonth());
		MonthDay today=MonthDay.from(date4);
		System.out.println("Holiday Today? : "+today.equals(holiday));
		
		//Add 2 Hours
		time=time.plusHours(5);
		System.out.println(time);
		
		//Know Next Week
		date4=date4.plus(3, ChronoUnit.MONTHS);
		System.out.println(date4);
		
		//Know Previous Month
		LocalDate date6=LocalDate.now();
		date6=date6.minus(15,ChronoUnit.DAYS);
		System.out.println(date6);
		
		//Get Timezone
		Clock clock=Clock.systemUTC();
		System.out.println(clock);
		Clock timezone=Clock.systemDefaultZone();
		System.out.println(timezone);
		
		//Check before and after dates
		LocalDate dtoday=LocalDate.now();
		LocalDate tomorrow=dtoday.plus(1,ChronoUnit.DAYS);
		System.out.println(dtoday+" : "+dtoday.isBefore(tomorrow));
		System.out.println(tomorrow+" : "+tomorrow.isBefore(dtoday));
		
		//Timezones with date and time
		ZoneId zoneID=ZoneId.of("Asia/Calcutta");
		LocalDateTime date7=LocalDateTime.now();
		ZonedDateTime zone=ZonedDateTime.of(date7, zoneID);
		System.out.println("Time zone is: "+zone);
		
		//Month and Year for Credit card expiry
		YearMonth ym=YearMonth.now();
		ym=ym.plus(12,ChronoUnit.MONTHS);
		System.out.println("Credit Card Expiry is: "+ym);
		
		//Is Leap Year
		System.out.println(date.isLeapYear());
		
		//Period Between Dates
		LocalDate myMarriage=LocalDate.of(2030, 3, 15);
		LocalDate datetoday=LocalDate.now();
		Period period=Period.between(datetoday, myMarriage);
		System.out.println(period);
		
		//Time Zone Offset
		ZoneOffset offset=ZoneOffset.of("+05:30");
		OffsetDateTime odt=OffsetDateTime.of(date7, offset);
		System.out.println("Local Date Time Zone: "+odt);
		
		//Get Current Timestamp
		Instant timestamp=Instant.now();
		System.out.println("Current Time Stamp: "+timestamp);
		
	}

}
