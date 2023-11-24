package FoodMake;

import java.util.Scanner;

public class Kimbap extends Food
{
	@Override
	public int selectIngredients()
	{
		int Point = 2000;
		
		Scanner kimbap = new Scanner(System.in);
	    int correctIngredients = 0;
	    int incorrectIngredients = 0;
	    
	    while(true)
	    {
	    	System.out.println("김 선택");
		    System.out.println
		    ("(1)김 (2)김자반 (3)미역 (4)라이스페이퍼 (5)전 (6)또띠야 (7)삼겹살 (8)순대");
		    System.out.print("입력: ");
		    int Seaweed = kimbap.nextInt();
		    
		    if (Seaweed == 1)
		    {
		    	Point += 200; break;
		    }
		    	
		    else if (Seaweed == 2 || Seaweed == 3 || Seaweed == 4 || Seaweed == 5 || Seaweed == 6 ||
		    		Seaweed == 7 || Seaweed == 10)
		    {
		    	Point -= 100; break;
		    }
		    else 
	        	System.out.println("숫자를 다시 입력해주세요");
	            System.out.println();	    		
	    }	        
//------------------------------------------------------------------------------------------------
	    while(true)
	    {
	    	System.out.println("밥 선택");
		    System.out.println
		    ("(1)인남미 (2)소면 (3)라이스페이퍼 (4)보리밥 (5)빵 (6)콩 (7)돼지고기 (8)파 (9)쌀밥");
		    System.out.print("입력: ");
		    int Kimbap_Rice= kimbap.nextInt();
		    
		    if (Kimbap_Rice == 1 || Kimbap_Rice == 4 || Kimbap_Rice == 9 )
		    {
		    	Point += 300; break;
		    }    	
		    else if (Kimbap_Rice == 2 || Kimbap_Rice == 3 || Kimbap_Rice == 5 ||
		    		Kimbap_Rice == 6 || Kimbap_Rice == 7 || Kimbap_Rice == 8)
		    {
		    	Point -= 150; break;
		    }
		    else 
	        	System.out.println("숫자를 다시 입력해주세요");
	            System.out.println();
		    	
	    }
	    
//------------------------------------------------------------------------------------------------
	    while(true)
	    {
	    	System.out.println("메인재료 선택");
		    System.out.println
		    ("(1)불갈비 (2)홍어 (3)새우튀김 (4)참치 (5)멍게 (6)굴 (7)해삼 (8)낙지 (10)돈까스 ");
		    System.out.print("입력: ");
		    int Main_Ingredients = kimbap.nextInt();
		    
		    if (Main_Ingredients == 1 || Main_Ingredients  == 3 || Main_Ingredients == 4 ||
		    	Main_Ingredients == 10)  
		    {
		    	Point += 200; break;
		    } 
		    else if (Main_Ingredients == 2 || Main_Ingredients == 5 || Main_Ingredients == 6 ||
		    		Main_Ingredients == 7 || Main_Ingredients == 8 || Main_Ingredients == 9)
		    {
		    	Point -= 100; break;	
		    }
		    else 
	        	System.out.println("숫자를 다시 입력해주세요");
	            System.out.println();		    	
	    }
	    
//------------------------------------------------------------------------------------------------
	    while(true)
	    {
	    	System.out.println("야채 선택");
		    System.out.println
		    ("(1)우엉 (2)순대 (3)당근 (4)낙지호롱이 (5)츄러스 (6)아이스크림 (7)오이 (8)아스파라거스 (9)단무지 ");
		    System.out.print("입력: ");
		    int Kimbap_Vegetable = kimbap.nextInt();
		    if (Kimbap_Vegetable == 1 || Kimbap_Vegetable == 3 || Kimbap_Vegetable == 7 || 
		    	Kimbap_Vegetable == 9)  
		    {
		    	Point += 200; break;
		    }   	
		    else if (Kimbap_Vegetable == 2 || Kimbap_Vegetable == 4 || Kimbap_Vegetable == 5 ||
		    		Kimbap_Vegetable == 6 || Kimbap_Vegetable == 8)
		    {
		    	Point -= 100; break;
		    }
		    else 
	        	System.out.println("숫자를 다시 입력해주세요");
	            System.out.println();	    	
	    }
	   
//------------------------------------------------------------------------------------------------
	    while(true)
	    {
	    	System.out.println("추가재료 선택");
		    System.out.println
		    ("(1)참깨 (2)홍어 (3)도넛 (4)치즈 (5)홍합 (6)멍게 (7)계란지단 (8)광어 (9)해삼 (10)햄");
		    System.out.print("입력: ");
		    int Kimbap_Additional_Ingredients = kimbap.nextInt();
		    
		    if (Kimbap_Additional_Ingredients == 2 || Kimbap_Additional_Ingredients== 4 || 
		    	Kimbap_Additional_Ingredients == 7 || Kimbap_Additional_Ingredients == 10)
		    {
		    	Point += 200; break;
		    }
		    	
		    else if (Kimbap_Additional_Ingredients == 1 || Kimbap_Additional_Ingredients == 3 ||
		    		 Kimbap_Additional_Ingredients == 5 || Kimbap_Additional_Ingredients == 6 ||
		    		 Kimbap_Additional_Ingredients == 8 || Kimbap_Additional_Ingredients == 9 )
		    {
		    	Point -= 100; break;
		    }
		    else 
	        	System.out.println("숫자를 다시 입력해주세요");
	            System.out.println();
		    	
	    }
	    
	    
	    return Point;
	    
	}
}
