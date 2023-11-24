package FoodMake;
import java.util.Scanner;
public class Hamburger extends Food
{
	@Override
	public int selectIngredients()
	{		
		Scanner hamburger = new Scanner(System.in);
        int totalPoints = 0;
	        
	    while (true) {
	        System.out.println("빵 선택");
	        System.out.println("(1)식빵 (2)참깨빵 (3)바게트 (4)베이글 (5)크로와상 (6)들깨빵 (7)카스테라 (8)초코파이 (9)팥빵 (10)붕어빵");
	        System.out.print("입력: ");
	        int Bun = hamburger.nextInt();

	        if (Bun == 2 || Bun == 6) {
	        	totalPoints += 200; break; 
	        } else if (Bun == 1 || Bun == 3 || Bun == 4 || Bun == 5 || Bun == 7 || Bun == 8 || Bun == 9 || Bun == 10) {
	        	totalPoints -= 100; break;
	        } 
	        else 
	        	System.out.println("숫자를 다시 입력해주세요");
	            System.out.println();       
	    }

//------------------------------------------------------------------------------------------------	  
	    while(true)
	    {
	    	System.out.println("패티 선택");
		    System.out.println
		    ("(1)라면패티 (2)치킨패티 (3)바나나 (4)콩 (5)새우패티 (6)김 (7)명량젓 (8)떡 (9)소고기패티 (10)토끼패티");
		    System.out.print("입력: ");
		    int Paeti = hamburger.nextInt();
		    
		    if (Paeti == 2 || Paeti == 5 || Paeti == 9) 
		    {
		    	totalPoints += 200;break;
		    }	
		    else if (Paeti == 1 || Paeti == 3 || Paeti == 4 ||Paeti == 6 ||Paeti == 7 ||Paeti == 8 ||Paeti == 10)
		    {
		    	totalPoints -= 100; break;
		    }    	
		    else
		    	System.out.println("숫자를 다시 입력해주세요");
		    	System.out.println();
	    }
	    	
	      
//------------------------------------------------------------------------------------------------	
	    while(true)
	    {
	    	System.out.println("소스 선택");
		    System.out.println
		    ("(1)어니언 소스 (2)와사비 (3)케찹 (4)발사믹 (5)머스타드 (6)굴소스 (7)탕수육소스 (8)간장 (9)참기름 (10)마요네즈");
		    System.out.print("입력: ");	    
		    int soseu = hamburger.nextInt();	
		    
		    if (soseu == 1 || soseu  == 3 || soseu  == 5 || soseu  == 10)  
		    {
		    	totalPoints += 200; break;
		    }
		    else if (soseu == 2 || soseu == 4 || soseu == 6 || soseu == 7 || soseu == 8 || soseu == 9)
		    {
		    	totalPoints -= 100; break;
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
		    ("(1)양사추 (2)양파 (3)깻잎 (4)치커리 (5)피클 (6)김치 (7)토마토 (8)콩나물 (9)브로콜리");
		    System.out.print("입력: ");
		    int vegetable = hamburger.nextInt();
		    
		    if (vegetable == 1 || vegetable == 2 || vegetable == 5 || vegetable == 7)
		    {
		    	totalPoints += 200; break;
		    	
		    }	    	
		    else if (vegetable == 3 || vegetable == 4 || vegetable == 6 || vegetable == 8 || vegetable == 9)
		    {
		    	totalPoints -= 100; break;
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
		    ("(1)치즈 (2)참치 (3)고추 (4)홍합 (5)베이컨 (6)연어 (7)떡볶이 (8)순대 (9)새우 (10)족발");
		    System.out.print("입력: ");
		    int Additional_Ingredients = hamburger.nextInt();
		    
		    if (Additional_Ingredients == 1 || Additional_Ingredients == 5 || Additional_Ingredients == 9)
		    {
		    	totalPoints += 200; break;
		    }	    	
		    else if (Additional_Ingredients == 1 || Additional_Ingredients == 2 || 
		    		Additional_Ingredients == 3 || Additional_Ingredients == 4 ||
		    		Additional_Ingredients == 6 || Additional_Ingredients == 7 ||
		    		Additional_Ingredients == 8)
		    {
		    	totalPoints -= 100; break;
		    }
		    else
		    	System.out.println("숫자를 다시 입력해주세요");
		    	System.out.println(); 
	    }	
	    return totalPoints;
	}   
}
        

