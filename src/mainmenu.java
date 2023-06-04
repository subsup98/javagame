import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class mainmenu {
    private static String trainerName;
    private static Scanner scanner = new Scanner(System.in);
    private static List<Pokemon> pokemonList = new ArrayList<>();
    private static int trainerLevel;

    public static void main(String[] args) {
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
                startMenu();
            } else if (choice == 2) {
                lordGame();
            } else {
                System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            }
            choice = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println("게임을 종료합니다.");
    }

    static void startMenu() {
    	  int choice = 0;

          do {
              System.out.println();
              System.out.println("메인 메뉴");
              System.out.println("1. 배틀");
              System.out.println("2. 탐험");
              System.out.println("3. 포켓몬 정보");
              System.out.println("4. 도구");
              System.out.println("5. 트레이너 정보");
              System.out.println("6. 뒤로가기");

              if (scanner.hasNextInt()) {
                  choice = scanner.nextInt();
                  scanner.nextLine(); 
              } else {
                  System.out.println("숫자를 입력해주세요.");
                  scanner.nextLine(); 
                  continue; 
              }

              switch (choice) {
                  case 1:
                      // 배틀 메뉴 실행
                      break;
                  case 2:
                      // 탐험 메뉴 실행
                      Exploration.main(new String[0]);
                      break;
                  case 3:
                      // 포켓몬 정보 메뉴 실행
                      break;
                  case 4:
                      Item.main(new String[0]);
                      break;
                  case 5:
                      // 트레이너 정보 메뉴 실행
                      break;
                  case 6:
                      System.out.println("뒤로가기");
                      break;
                  default:
                      System.out.println("다시 입력하세요");
                      break;
              }
          } while (choice != 6);
      }

	

	public static void Pokemoninfo() {
        System.out.println("포켓몬 정보");

        if (pokemonList.isEmpty()) {
            System.out.println("포켓몬을 가지고 있지 않습니다.");
        } else {
            System.out.println("가지고 있는 포켓몬 목록:");
            for (int i = 0; i < Math.min(pokemonList.size(), 6); i++) {
                Pokemon pokemon = pokemonList.get(i);
                System.out.println((i + 1) + ". " + pokemon.getName());
            }

            if (pokemonList.size() > 6) {
                System.out.println("더 많은 포켓몬을 가지고 있습니다. 나머지는 표시되지 않았습니다.");
            }

            Scanner scanner = new Scanner(System.in);
            System.out.print("능력치를 확인할 포켓몬 번호를 입력하세요: ");
            int pokemonNumber = scanner.nextInt();
            scanner.nextLine();

            if (pokemonNumber >= 1 && pokemonNumber <= Math.min(pokemonList.size(), 6)) {
                Pokemon selectedPokemon = pokemonList.get(pokemonNumber - 1);

            
                System.out.println("선택된 포켓몬: " + selectedPokemon.getName());
                System.out.println("레벨: " + selectedPokemon.getLevel());
                System.out.println("최대 HP: " + selectedPokemon.getMaxHp());
                System.out.println("현재 HP: " + selectedPokemon.getCurrentHp());
                System.out.println("공격력: " + selectedPokemon.getAttack());
                System.out.println("방어력: " + selectedPokemon.getDefense());
                System.out.println("속성: " + selectedPokemon.getAttribute());
                System.out.println("스피드: " + selectedPokemon.getSpeed());
            } else {
                System.out.println("유효하지 않은 포켓몬 번호입니다.");
            }
        }
    }

    public static void Trainerinfo() {
    	


    Trainer trainer = new Trainer(trainerName, 1, 0, 0);

    trainer.Trainer_Info(trainerName);
}
    private static void lordGame() {
    	
    }
    
}

