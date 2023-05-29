import java.util.Scanner;

public class mainmenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("포켓몬 머드게임에 오신 것을 환영합니다!");
        System.out.println("1. 게임 시작");
        System.out.println("2. 게임 종료");
        System.out.print("선택> ");

        int choice = scanner.nextInt();
        while (choice != 3) {
            if (choice == 1) {
                startGame();
            } 
            if (choice ==2) {
            	lordGame();
            }
            else {
                System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            }
            System.out.println();
            System.out.println("1. 게임 시작");
            System.out.println("2. 불러오기");
            System.out.println("3. 게임 종료");
            System.out.print("선택> ");
            choice = scanner.nextInt();
        }
        System.out.println("게임을 종료합니다.");
    }

    private static void startGame() {
        // 게임 시작 코드 작성
    	System.out.println("포켓몬 게임을 시작합니다!");
    	
    }
    private static void lordGame() {
    	// 데이터 로드
    }
}

----------------------------------------------------------------------------------------서경원 
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class mainmenu {
	private static String trainerName;
	private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("포켓몬 머드게임에 오신 것을 환영합니다!");
        System.out.println();
        System.out.println("1. 게임 시작");
        System.out.println("2. 불러오기");
        System.out.println("3. 게임 종료");
        System.out.print("선택> ");
        
        int choice = scanner.nextInt();
        scanner.nextLine();
   
        while (choice != 3) {
            if (choice == 1) {
                startGame();
            } 
            else if (choice ==2) {
            	lordGame();
            }
            else {
                System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            }
            choice = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println("게임을 종료합니다.");
    }

    private static void startGame() {
       
    	System.out.println("포켓몬 게임을 시작합니다!");
    	
        System.out.print("트레이너 이름을 입력하시오: ");
        trainerName = scanner.nextLine();
    
    	int choice;
        do {
            System.out.println();
            System.out.println("메인 메뉴");
            System.out.println("1. 배틀");
            System.out.println("2. 탐험");
            System.out.println("3. 포켓몬 정보");
            System.out.println("4. 도구");
            System.out.println("5. 트레이너 정보");
            System.out.println("6. 뒤로가기");
            System.out.print("번호를 선택하시오: ");
            
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
     
                    System.out.println("배틀을 시작합니다.");
                    break;
                case 2:
               
                    System.out.println("탐험을 시작합니다.");
                    break;
                case 3:
                	System.out.println("포켓몬을 확인합니다");
                case 4:
                 
                    System.out.println("도구를 확인합니다.");
                    Item();
                    break;
                case 5:
                  
                    System.out.println("트레이너 정보를 확인합니다.");
                    Trainerinfo();
                    break;
                case 6:
                
                    System.out.println("시작화면으로 돌아갑니다.");
                    return;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력하세요");
                    break;
            }
        } while (choice != 6); 	
    }

 public static void Pokemon() { //갖고 있을 수 있는 포켓몬은 6마리 두었습니다.
	 
	 Pokemon pokemon1;
     Pokemon pokemon2;
     Pokemon pokemon3;
     Pokemon pokemon4;
     Pokemon pokemon5;
     Pokemon pokemon6;

     pokemon1 = new Pokemon("", 0, 0, 0, 0, "", 0);
     pokemon2 = new Pokemon("", 0, 0, 0, 0, "", 0);
     pokemon3 = new Pokemon("", 0, 0, 0, 0, "", 0);
     pokemon4 = new Pokemon("", 0, 0, 0, 0, "", 0);
     pokemon5 = new Pokemon("", 0, 0, 0, 0, "", 0);
     pokemon6 = new Pokemon("", 0, 0, 0, 0, "", 0);
	 
	 System.out.println("포켓몬");
     Scanner scanner = new Scanner(System.in);

     System.out.print("능력치를 확인할 포켓몬 번호를 입력하세요: ");
     int pokemonNumber = scanner.nextInt();
     scanner.nextLine();

     Pokemon selectedPokemon = null;

   
     switch (pokemonNumber) {
         case 1:
             selectedPokemon = pokemon1;
             break;
         case 2:
             selectedPokemon = pokemon2;
             break;
         case 3:
             selectedPokemon = pokemon3;
             break;
         case 4:
             selectedPokemon = pokemon4;
             break;
         case 5:
             selectedPokemon = pokemon5;
             break;
         case 6:
             selectedPokemon = pokemon6;
             break;
         default:
             System.out.println("유효하지 않은 포켓몬 번호입니다.");
             return;
     }

     // 선택된 포켓몬의 능력치 출력
     System.out.println("선택된 포켓몬: " + selectedPokemon.getName());
     System.out.println("레벨: " + selectedPokemon.getLevel());
     System.out.println("최대 HP: " + selectedPokemon.getMaxHp());
     System.out.println("현재 HP: " + selectedPokemon.getCurrentHp());
     System.out.println("공격력: " + selectedPokemon.getAttack());
     System.out.println("방어력: " + selectedPokemon.getDefense());
     System.out.println("속성: " + selectedPokemon.getAttribute());
     System.out.println("스피드: " + selectedPokemon.getSpeed());
     
 }
    
    
	public static void Item(){
        System.out.println("도구");

       
        Item.HealingPotion healingPotion = new Item.HealingPotion("회복약", 50);
        healingPotion.printInfo();
        	
        Item.MonsterBall monsterBall = new Item.MonsterBall("몬스터볼", 10, 50);
        monsterBall.printInfo();
        
        Item.Candy candy = new Item.Candy("사탕", 100);
        candy.printInfo();
    }
    
    public static void Trainerinfo() {
    	


    Trainer trainer = new Trainer(trainerName, 1, 0, 0);

    trainer.Trainer_Info(trainerName);
}
    private static void lordGame() {
    	
    }

}

