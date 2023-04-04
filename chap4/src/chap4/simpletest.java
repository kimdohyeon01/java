/**
 * 2023.03.28
 * 김도현
 * 조건문 연습
 */
package chap4;

import java.util.Scanner;


public class simpletest {

	public static void main(String[] args) 
	{
		Scanner stdin = new Scanner(System.in);
		System.out.print("input score");
		
		int grade = stdin.nextInt();
		
		if (grade >=90)
		{
			System.out.println("pass");
			System.out.println("thank you");
			System.out.println("congratulations");
		}
		else
		{
			System.out.println("non pass");
			
		}
		
		
	}

}
