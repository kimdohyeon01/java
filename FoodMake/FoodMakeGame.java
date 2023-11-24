
package FoodMake;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class FoodMakeGame {
	
public static void main(String[] args) 
{	
	int point = 3000;
	
	System.out.println("설명");
    System.out.println("안녕하세요 음식 만들기 게임에 오신 것을 환영합니다.");
    System.out.println("저희 음식만들기 게임은 5가지의 음식들이 있습니다");
    System.out.println("각 음식에 맞는 재료를 선택하여 맛있는 음식을 만드는 게임입니다.");
    System.out.println("저희 게임은 사용자에게 기본 3천 포인트를 제공합니다.");
    System.out.println("각 음식에 맞는 재료를 선택하면 4백의 포인트를 지급하고");
    System.out.println("다른 재료를 선택 시 2백 포인트를 차감합니다.");
    System.out.println("맞는 재료를 많이 선택하여 사용자들과 순위를 매겨보세요!");
    System.out.println();

    List<Player> players = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    while (true) {
        System.out.print("(1)시작 (0)종료 (2)순위: ");
        System.out.println();
        int gameStartButton = scanner.nextInt();

        if (gameStartButton == 1) {
            System.out.print("플레이어 수를 입력하세요: ");
            int numPlayers = scanner.nextInt();
            scanner.nextLine();

            for (int i = 1; i <= numPlayers; i++) {
                System.out.print("플레이어 " + i + "의 닉네임을 입력하세요: ");
                String nickname = scanner.nextLine();
                Player player = new Player(nickname);
                players.add(player);
            }

            System.out.println();

            for (Player player : players) {
                System.out.println("안녕하세요 " + player.getNickname() + "님");
                System.out.println("음식을 선택해주세요");

                Scanner foodChoice = new Scanner(System.in);
                System.out.print("음식선택 (1)햄버거 (2)치킨 (3)피자 (4)김치볶음밥 (5)김밥");
                System.out.print("입력: ");
                int foodChoiceNum = foodChoice.nextInt();
                foodChoice.nextLine();

                Food food;

                if (foodChoiceNum == 1) {
                    food = new Hamburger();
                } else if (foodChoiceNum == 2) {
                    food = new Chicken();
                } else if (foodChoiceNum == 3) {
                    food = new Pizza();
                } else if (foodChoiceNum == 4) {
                    food = new KimchiBokkeumbap();
                } else if (foodChoiceNum == 5) {
                    food = new Kimbap();
                } else {
                    System.out.println("숫자를 정확히 입력해주세요.");
                    return;
                }

                int points = food.selectIngredients();
                player.setPoints(player.getPoints() + points);
                System.out.println("획득한 포인트: " + points);
                System.out.println("현재 " + player.getNickname() + "님의 포인트는 " + (player.getPoints()+point) + "입니다.");
                System.out.println();
            }

            System.out.println("게임 종료!");

            for (int i = 0; i < players.size() - 1; i++) {
                for (int j = i + 1; j < players.size(); j++) {
                    Player player1 = players.get(i);
                    Player player2 = players.get(j);
                    if (player2.getPoints() > player1.getPoints()) {
 
                        Player temp = players.get(i);
                        players.set(i, players.get(j));
                        players.set(j, temp);
                    }
                }
            }

         
            for (int i = 0; i < players.size(); i++) {
                Player player = players.get(i);
                System.out.println("플레이어 " + player.getNickname() + ": 점수 - " + (player.getPoints()+point) + ", 순위 - " + (i + 1));              
            }
            System.out.println();

        } else if (gameStartButton == 2) 
        {
            System.out.println("순위");
            for (int i = 0; i < players.size(); i++) {
                Player player = players.get(i);
                System.out.println("플레이어 " + player.getNickname() + ": 점수 - " + (player.getPoints()+point) + ", 순위 - " + (i + 1));         
            }
            System.out.println();

        } else if (gameStartButton == 0) {
            System.out.println("게임이 종료 되었습니다.");
            break;
        } else {
            System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
        }
    }
}
}



