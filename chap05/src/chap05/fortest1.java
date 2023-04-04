/**
 *2023.04.04
 *김도현
 *입력 받은 숫자의 약수를 모두 출력하시오
 *#문제분석
 *변수:num
 *for 반복 i<=num (i++)
 *if num%i==0 약수 (num이 i로 나누었을대 1과 자기자신만 남으면 약수)
 */
package chap05;
import java.util.Scanner;
public class fortest1 {

	public static void main(String[] args) 
	{
		Scanner stdin = new Scanner(System.in);
		System.out.print("input number: ");
		int num = stdin.nextInt();
		
		System.out.print(num+"yaksu: ");
		for (int i = 1; i <=num; i++)
		{
			if(num%i==0)
			{
				System.out.print(i+" ");
			}
		}

	}

}
