/**
 * 윤년 계산 프로그램
 * 조건1 : 4로 나누어 떨어지고, 100으로 나누어 떨어지지 않으면 윤년이다.
 * 조건2 : 400으로 나누어 떨어지는 해도 윤년에 포함 된다.
 * 실행결과
 * 년도 입력:2020
 * 2020년은 윤년입니다.
 */
package chap02;

import java.util.Scanner;
public class OpEx2 {

	public static void main(String[] args) 
	{
		
		
		Scanner stdin = new Scanner(System.in);
		System.out.print("년도입력: ");
		int num = stdin.nextInt();
		
		boolean flag;
		flag = (num/4==0 && num/100 != 0 && num/400 == 0)? true : false;
		System.out.print(num + "년은 윤년입니다.");
		
		
		/*
		flag=(num/4==0 && num/100 != 0 && num/400 == 0);
		System.out.print(num + "년은 윤년입니다.");
		System.out.print("윤년이 아닙니다.");
		*/

	}

}
