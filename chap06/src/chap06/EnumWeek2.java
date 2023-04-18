/**
 * 열거타입 Week이용하려면 날짜 정보 필요
 * 컴퓨터의 날짜, 요일, 시간을 얻기 위해 Calender 클래스 필요
 * Calender.getInstance() Calender 객체얻기
 * 
 * today는 스택 영역에 생성, Week 객체는 힙 영역에 생성, 
 * Week.SUNDAY는 메소드 영역에 생성
 * 
 * today에 저장되는 값은 Week.SUNDAY 열겨 상수가 참조하는 객체 번지
 * Week.SUNDAY와 today 변수는 서로 같은 Week 객체 참조
 */
package chap06;
import java.util.Calendar;

import chap06.EnumWeek.Week;
public class EnumWeek2 {

	public static void main(String[] args) 
	{
		Week today=null;
				
		Calendar cal = Calendar.getInstance();
		int week=cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week)
		{
			case 1;
				today=Week.SUNDAY;
				break;
			case 2;
				today=Week.MONDAY;
				break;
			case 3;
				today=Week.TUESDAY;
				break;
			case 4;
				today=Week.WEDNSDAY;
				break;
			case 5;
				today=Week.THURSDAY;
				break;
			case 6;
				today=Week.FRIDAY;
				break;
			case 7;
				today=Week.SATURDAY;
				break;
 		}
		System.out.println("today is" + today);
		
		if(today == Week.SUNDAY)
		{
			System.out.println("rest on sunday");
		}
		else
		{
			System.out.println("study java");
		}
		

	}

}
