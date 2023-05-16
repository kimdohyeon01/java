package chap09.exam03;

import chap09.A;

public class C 
{
	A a1 = new A(true); //(O)
	A a2 = new A(1);    //default 다른 패키지 전근불가
	A a3 = new A("문자열") //private 다른 패키지 전근불가
}
