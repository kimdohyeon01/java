package star;
import java.util.Scanner;
public class star4 {

	public static void main(String[] args) 
	{
		Scanner stdin = new Scanner(System.in);
		System.out.print("input number: ");
		int num = stdin.nextInt();
		
		for (int i=1; i<=num; i++)
		{
			for (int j=1; j<=num ; j++) //별을 찍는 반복
			{
				if(num-i >= j)
					System.out.print(" ");
				
				else //if (num-i <= j)
					System.out.print("*");
				
			}
			System.out.println();
		}

	}

}
