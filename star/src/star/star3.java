package star;
import java.util.Scanner;
public class star3 {

	public static void main(String[] args) 
	{
		Scanner stdin = new Scanner(System.in);
		System.out.print("input number: ");
		int num = stdin.nextInt();
		
		for (int i=1; i<=num; i++) //줄 반복
		{		
			for (int j=num; j>0 ; j--) //별을 찍는 반복
			{
				if(i<j)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
