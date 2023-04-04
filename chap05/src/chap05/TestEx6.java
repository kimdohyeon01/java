/**
 * 2023.04.04
 * 김도현
 * 두 수 사이의 홀수 값만 더하는 프로그램
 */
package chap05;
import java.util.Scanner;
public class TestEx6{

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
			if(first % 2 == 1)
			{
				total+=first;
			}	
			first++;
		}
		System.out.print("sum of odd number "+total);
	}
}
