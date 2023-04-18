/**
 * 2023.04.18
 * Arrays 클래스 - System.array
 */
package chap06;
import java.util.Arrays;
public class CopyArrayTest2 {

	public static void main(String[] args)
	{
		int num1[] = {10,20,30};
		int num2[] = {40,50,60};
		String str3[] = {"java","array","copy"};
		String str4[] = new String[5]; //str4는 null로 초기화
		
		//배열 요소 값들 각각 복사
		for ( int i=0; i<num1.length; i++)
			num2[i] = num1[i];
		System.out.print("num2 value: ");
		for (int i:num2) //num2 출력 (10,20,30)
			System.out.print(i+" ");
		
		//System.arraycopy()로 복사
		System.arraycopy(str3, 0, str4, 0, 3);
		
		System.out.print("\nstr4 value: ");
		
		for (String value:str4) //str4 출력
			System.out.print(value+" "); //복사되지 않은 항목은 초기값 출력
		
		//Array.copyof()로 복사
		String str5[] = Arrays.copyOf(str3,2);
		
		System.out.print("\nstr5 value: ");
		
		for(String value:str5 )
			System.out.print(value+" ");

	}

}
