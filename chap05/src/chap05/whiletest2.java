/**
 * 2023.04.04
 * 김도현
 * 입력받은 숫자의 팩토리얼 구하기
 * #문제분석
 * 변수 : fac,facvalue
 * #알고리즘
 * 1.fac에 숫자를 입력 받는다 
 * 2.fac에서 -1을 하면서 숫자를 곱한다
 * 3.facvalue에 총 곱한 수를 넣는다 
 */
package chap05;
import java.util.Scanner;
public class whiletest2 {

	public static void main(String[] args) 
	{
		Scanner stdin = new Scanner(System.in);
		System.out.print("input number: ");
		int fac = stdin.nextInt();
		
		int facvalue = fac;
		
		while (fac>1)
		{
			System.out.print(fac+"*");
			facvalue *= --fac;
		}
		System.out.print("1 = "+facvalue);
	}

}
