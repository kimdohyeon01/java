/**
 * 2023.04.04
 * 김도현
 * 두 숫자를 입력 받아서 두 수 사이의 합계 출력 하기
 * 변수: first,second,total
 * #알고리즘 
 * 1.정수 입력(first,second)
 * 2.선택문(if (first<second))
 * 3.반복문(for (first; second; first++))
 * 					total =+ first
 */
package chap05;

import java.util.Scanner;
public class TestEx5 {

	public static void main(String[] args) 
	{
		
		Scanner stdin = new Scanner(System.in);
		System.out.print("input first number");
		int first = stdin.nextInt();
		
		Scanner stdin2 = new Scanner(System.in);
		System.out.print("input second number");
		int second = stdin2.nextInt();
		
		int temp, total=0;
		
		if (first>second)
		{
			temp=first;
			first=second;
			second=temp;
		}
		
		while (first<=second)
		{
			total+=first;
			first++;
		}
		System.out.print("total number: "+total);	
		
	}

}
