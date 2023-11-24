package FoodMake;

import java.util.Scanner;

public class KimchiBokkeumbap extends Food
{
	@Override
	public int selectIngredients()
	{
		int Point = 2000;
		
		Scanner kimchiBokkeumbap = new Scanner(System.in);
	    int correctIngredients = 0;
	    int incorrectIngredients = 0;
	    
	    while(true)
	    {
	    	System.out.println("밥 선택");
		    System.out.println
		    ("(1)인남미 (2)소면 (3)라이스페이퍼 (4)보리밥 (5)빵 (6)콩 (7)돼지고기 (8)파 (9)쌀밥");
		    System.out.print("입력: ");
		    int Rice= kimchiBokkeumbap.nextInt();
		    
		    if (Rice == 1 || Rice == 4 || Rice == 9)
		    {
		    	Point += 300; break;
		    }
		    	
		    else if (Rice == 2 || Rice == 3 || Rice == 5 || Rice == 6 || Rice == 7 || Rice == 8)
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
	    	System.out.println("김치 선택");
		    System.out.println
		    ("(1)배추김치 (2)고들빼기김치 (3)깻잎김치 (4)석박지 (5)우엉김치 (6)톳김치 (7)콩잎김치 "
		    		+ "(8)무말랭 김치 (9)동지김치 (10)갓물김치");
		    System.out.print("입력: ");
		    int Kimchi = kimchiBokkeumbap.nextInt();
		    
		    if (Kimchi  == 1)  
		    {
		    	Point += 300; break;
		    }
		    	
		    else if(Kimchi  == 2 || Kimchi  == 3 || Kimchi  == 4 || Kimchi  == 5 || Kimchi  == 6 || Kimchi  == 7 ||
		    		Kimchi  == 8 || Kimchi  == 9 || Kimchi  == 10)
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
	    	System.out.println("야채 재료");
		    System.out.println
		    ("(1)양파 (2)귤 (3)파 (4)감자칩 (5)당근 (6)고구마 (7)홍어 (8)낙지 (9)고추 (10)꽃게");
		    System.out.print("입력: ");
		    int Kimchi_Vegetable = kimchiBokkeumbap.nextInt();
		    
		    if (Kimchi_Vegetable == 1 || Kimchi_Vegetable  == 3 || Kimchi_Vegetable == 5 ||  Kimchi_Vegetable == 9)
		    {
		    	Point += 300; break;
		    }		    	
		    else if (Kimchi_Vegetable == 2 || Kimchi_Vegetable  == 4 || Kimchi_Vegetable == 6 ||  
		    		Kimchi_Vegetable == 7 || Kimchi_Vegetable == 8 || Kimchi_Vegetable  == 10)
		    {
		    	Point -= 150; break;
		    }
		    else 
	        	System.out.println("숫자를 다시 입력해주세요");
	            System.out.println();
		    	
	    }	 
//------------------------------------------------------------------------------------------------\
	    while(true)
	    {
	    	System.out.println("추가재료 선택");
		    System.out.println
		    ("(1)계란 (2)짜장소스 (3)카레가루 (4)햄 (5)산초가루 "
		    		+ "(6)모짜렐라치즈 (7)두리안 (8)바나나 (9)호두 (10)참치 ");
		    System.out.print("입력: ");
		    int Kimchi_Additional_Ingredients = kimchiBokkeumbap.nextInt();
		    
		    if (Kimchi_Additional_Ingredients == 1 || Kimchi_Additional_Ingredients == 4 ||
		    	Kimchi_Additional_Ingredients == 6) 
		    {
		    	Point += 300; break;
		    }	    	
		    else if (Kimchi_Additional_Ingredients == 2 || Kimchi_Additional_Ingredients == 3 ||
		    		Kimchi_Additional_Ingredients == 5 || Kimchi_Additional_Ingredients == 7 ||
		    		Kimchi_Additional_Ingredients == 8 || Kimchi_Additional_Ingredients == 9 ||
		    		Kimchi_Additional_Ingredients == 10)
		    {
		    	Point -= 150; break;
		    }
		    else 
	        	System.out.println("숫자를 다시 입력해주세요");
	            System.out.println();		    	
	    }
	        
	    return Point;
	}
}
