package chap05;
import java.util.Scanner;
public class fortest2 {

	public static void main(String[] args) 
	{
		/*
		int total=0;
		
		Scanner stdin = new Scanner(System.in);
		System.out.print("number");
		
		int beasu = stdin.nextInt();
		
		for(int i=1; i<=1000; i++)
		{
			if (i%beasu==0)
			{
				total =+ i;
			}
		}
		System.out.print(beasu + "beasu hap" + total);
		*/
//------------------------------------------------------------
		
		Scanner stdin = new Scanner(System.in);
		System.out.print("input first number");
		int num1 = stdin.nextInt();
		
		Scanner stdin2 = new Scanner(System.in);
		System.out.print("input second number");
		int num2 = stdin2.nextInt();
		

		int hap=0;
		
		while(num1<=num2) {
			if (num1%2==1)
				{
				hap=hap+num1;
				}
			num1=num1+1;
		}
		System.out.print(hap);
		

	}
// 1~10 1 3 5 7 9 = 25
}
