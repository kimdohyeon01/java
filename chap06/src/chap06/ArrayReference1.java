/**
 * null과 NullPointException
 * 참조변수의 == 연산 과 equals()메소드
 */
package chap06;

public class ArrayReference1 {

	public static void main(String[] args) 
	{
		String strVal1="java";
		String strVal2="java";
		
		if(strVal1==strVal2)
		{
			System.out.println("strVal1, strVal2 same refernce");
		}
		else
		{
			System.out.println("strVal1, strVal2 diferent refernce");
		}
		
		if(strVal1.equals(strVal2))
		{
			System.out.println("strVal1, strVal2 same string");
		}
		
		String strVal3=new String("mkless");
		String strVal4=new String("mkless");
		
		if(strVal3==strVal4)
		{
			System.out.println("strVal1, strVal2 same refernce");
		}
		else
		{
			System.out.println("strVal1, strVal2 diferent refernce");
		}
		if(strVal3.equals(strVal4))
		{
			System.out.println("strVal1, strVal2 saem string");
		}

	}

}
