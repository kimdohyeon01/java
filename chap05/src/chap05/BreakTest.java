/**
 * 2023.04.04
 * 김도현
 * 숫자를 반복적으로 입력 받아서 정수의 합이 1000이상이 되면 1000을 넘은 수와 평균을 출력
 */
package chap05;
import java.util.Scanner;
public class BreakTest {

	public static void main(String[] args) 
	{
		int num,hap=0, i=1;
		
		while(true)
		{
			Scanner stdin = new Scanner(System.in);
			System.out.print(i+" input number: ");
			num = stdin.nextInt();
			
			hap += num;
			i++;
			if (hap >= 1000)break;
			
		}
			System.out.println("total number: "+hap);
			System.out.println("total number average : "+ hap/i);
			
			
		
	}

}
