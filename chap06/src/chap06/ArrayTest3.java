/**
 * 2023.04.11
 * 1차원 배열에서 입력받은 값 검색하기(선형 검색)
 */
package chap06;
import java.util.Scanner;
public class ArrayTest3 {

	public static void main(String[] args) 
	{
		int inum[] = {8,7,3,6,9,6,8,7,0,4,1,2};
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter the number you want to find: ");
		int key = stdin.nextInt();
		int count = 0;
		for (int i = 0; i < inum.length; i ++)
		{
			if (inum[i] == key)
			{				
				count++;
				System.out.println((i+1)+" same number ");
			}
			
			if (count == 0)
			{
				System.out.println(key +" have not number ");
			}
			else
				System.out.println(key+"total number "+count);
		}
	}

}
