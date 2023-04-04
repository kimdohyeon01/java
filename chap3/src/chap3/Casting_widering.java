package chap3;

import java.util.Scanner;
public class Casting_widering {

	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		System.out.print("first integger: ");
		int first = stdin.nextInt(); //첫번쨰 정수 저장
		
		System.out.print("second integger: ");
		int second = stdin.nextInt(); //두번쨰 정수 저장
		
		double avg1=(first+second)/2; //정수 정수 연산
		double avg2=(first+second)/2.0; //정수 실수 연산(확대형 변환)
		double avg3=(first+second)/(float)2; // 정수 실수(형번환)연산
		
		System.out.println("result1:"+avg1);
		System.out.println("result2:"+avg2);
		System.out.println("result3:"+avg3);
	}

}
