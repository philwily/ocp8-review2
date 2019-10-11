package chapter4;

import java.time.LocalTime;
import java.time.Period;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class PeriodDurationTest
{
	public static void main(String[] args)
	{
	
		LocalTime time1 = LocalTime.of(1,30);
		LocalTime time2 = LocalTime.of(1,31,30);
		String m1 = Duration.of(1, ChronoUnit.MINUTES).toString();
		String m2 = Duration.ofMinutes(1).toString();
		String s = Duration.of(90, ChronoUnit.SECONDS).toString();
		String s1 = Duration.ofSeconds(90).toString();
		String s3 = Duration.between(time1, time2).toString();
		String s4 = "" + ChronoUnit.SECONDS.between(time1, time2);

		String d = Duration.ofDays(1).toString();
		String p = Period.ofDays(1).toString();
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(d);
		System.out.println(p);
	}
}

