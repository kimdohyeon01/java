/**
 * 동전교환 프로그램
 * 입력된 액수만큼 500원, 100원, 50원, 10원 짜리 동전으로 교환해주는 프로그램 작성
 * 조건1: 동전의 총개수를 최소화
 * 조건2: 고액의 동전 우선 교환
 */
package chap02;

import java.util.Scanner;
public class OpEx1 {

	public static void main(String[] args) 
	{
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter your money: ");
		int money = stdin.nextInt();
		
		
		int money500 = money%500;
		System.out.println("500원" + money500 + "개");
		
		int money100 = money500%100;
		System.out.println("100원" + money100 + "개");
		
		int money50 = money100%50;
		System.out.println("50원" + money50 + "개");
		
		int money10 = money50%10;
		System.out.println("10원" + money10 + "개");
		
	}

}
