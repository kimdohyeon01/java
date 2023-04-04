/**
 * 실수타입_묵시적으로 double형으로 처리
 * Float 위에 반드시 Ff를 붙혀줘야된다
 */
package chap3;

public class TypeFloat {

	public static void main(String[] args) 
	{
	float var2 = 3.14f;
	double var3 = 3.14;
	
	//정밀도 확인
	float var4=0.1234567890123456789f;
	double var5=0.1234567890123456789;
	
	//e사용
	double var6 = 3e6; //3*10^6
	double var7 = 2e-3; //2*(1/10)^3
			
	System.out.println(var2);
	System.out.println(var3);
	System.out.println(var4);
	System.out.println(var5);
	System.out.println(var6);
	System.out.println(var7);

	}

}
