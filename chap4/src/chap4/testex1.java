/**
 * 2023.03.28
 * 김도현
 * 직급과 나이를 입력 받아서 직급이 7 또는 8이고 나이가 40대이면 "연급80%"
 * 지급이 5 또는 6이고 나이가 50대이면 "연급 100%"
 * 그 외의 경우는 "연금 대상자가 아님"
 */
package chap4;

import java.util.Scanner;

public class testex1 {

	public static void main(String[] args) 
	{
		int level,age;
		
		
		Scanner stdin = new Scanner(System.in);
		System.out.print("level");
		level = stdin.nextInt();
			
		Scanner stdin2 = new Scanner(System.in);
		System.out.print("age");
		age = stdin2.nextInt();
	
		if ((level == 7 || level == 8) && (age >= 40 && age < 50))
		{
			System.out.print("pension 80%");
		}
		else if ((level == 5 || level == 6) && (age >= 50 && age < 60))
		{
			System.out.print("pension 100%");
		}
		else
		{
			System.out.print("no pension");
		}
		
		
	
	}

}
