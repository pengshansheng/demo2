package demo1;

import java.util.Date;
import java.util.Calendar;


public class demo2 {
	
	/*
	 * 
	 * 
	 * 
	 * */
	public static void main(String[] args) {
		Date date=new Date();
		//完整的时间与日期%tc
		System.out.println(String.format("%tc", date));
		//只有时间%tr
		System.out.println(String.format("%tr", date));
		//周、月、日  %tA %tB %td
		System.out.println(String.format("%tA, %tB , %td", date,date,date));
		//同上，但不用重复给参数
		System.out.println(String.format("%tA, %<tB , %<td", date));
		Calendar c=Calendar.getInstance();
		c.set(2018, 12,1,15,12);
		System.out.println(c);

		
		
	}
}
