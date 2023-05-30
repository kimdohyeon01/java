/*타입변환(자동타입 변환):
 * 1. 클래스의 타입 변화는 상속관계에서 발생
 * 2. 자식은 부모 타입으로 자동타입 변환 가능
 * 3. 바로 위 부모가 아니더라도 상속 계층에서 상위 타입이면 변환 할 때만 사용 가능
 * 타입변환(강제타입 변환)
 * 1. 부모타입을 자식타입으로 변환
 * 2. 자식 타입이 부모 타입으로 형 변환 후 다시 자식 타입으로 변활 할 떄만 사용 가능
 */

package chap11;

class A{};

class B extends A{}
class C extends A{}

class D extends B{}
class E extends C{}

public class PromotionExample
{	
	public static void main(String[] args)
	{
		B b=new B();
		C c=new C();
		D d=new D();
		E e=new E();
		
		A a1=b;
		A a2=c;
		A a3=d;
		A a4=e;
		
		B b1=d;
		C c1=e;
		
		//상속관계 아니므로 컴파일 에리
		// B b3=e;
		// C c2=d;
	}
	

}
