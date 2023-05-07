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