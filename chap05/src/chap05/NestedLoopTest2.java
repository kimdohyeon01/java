/**
 * 2023.04.04
 * 김도현
 * 입력받은 숫자만큼 홀수를 반복하면서 직각삼각형을 출력
 * #문제분석
 * 변수: i,j,num
 * #알고리즘
 * 1.줄수 입력(num)
 * 2.중첩반복
 * 		while(i<=num)// 줄 반복
 * 		{
 * 			while(j<=i)// 별 찍기 반복
 * 				별 찍기
 * 		}
 */
package chap05;
import java.util.Scanner;
public class NestedLoopTest2 {

	public static void main(String[] args) 
	{
		Scanner stdin = new Scanner(System.in);
		System.out.print("input number: ");
		int num = stdin.nextInt();
	
		int i=1;
		
		while(i <= num)
		{
			int j=1;
			while(j<=i)
			{
				System.out.print("*");
				j++;
			}
			System.out.println(" "); //줄바꿈
			i++;
		}

	}

}
