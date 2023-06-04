import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Item {
    private String name;
    private int number;
    private static List<Item> itemList = new ArrayList<>();

    public Item(String name, int number) {
        this.name = name;
        this.number = number;
    }
    

    public void printInfo() {
        System.out.println("이름: " + getName());
        System.out.println("개수: " + getNumber());
    }

    public void useItem() {
        if (number > 0) {
            System.out.println(name + "을(를) 사용했습니다.");
            number--;
        } else {
            System.out.println(name + "이(가) 없습니다.");
        }
    }


    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void get(int count) {
        setNumber(getNumber() + count);
        System.out.println(getName() + "을(를) " + count + "개 획득했습니다. 현재 개수: " + getNumber());
        itemList.add(this); // itemList에 아이템 추가
    }

    
    public static class HealingPotion extends Item {
        private int effect;

        public HealingPotion(String name, int effect) {
            super(name, 0);
            this.effect = effect;
        }

        public int getEffect() {
            return effect;
        }
    }

    public static class Candy extends Item {
        private int exp;

        public Candy(String name, int exp) {
            super(name, 0);
            this.exp = exp;
        }

        public int getExp() {
            return exp;
        }
    }

    public static class MonsterBall extends Item {
        private double catchRate;
        private int trainerLevel;

        public MonsterBall(String name, int trainerLevel, double catchRate) {
            super(name, 0);
            this.catchRate = 0.4 + (trainerLevel * 0.01);
            this.trainerLevel = trainerLevel;
        }

        public double getCatchRate() {
            return catchRate;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        HealingPotion healingPotion = new HealingPotion("회복 물약", 50);
        Candy candy = new Candy("사탕", 10);
        MonsterBall monsterBall = new MonsterBall("몬스터볼", 5, 0.4);

        while (running) {
            System.out.println("==== 도구 확인 ====");
            System.out.println("도구를 확인합니다.");
            healingPotion.printInfo();
            candy.printInfo();
            monsterBall.printInfo();
            System.out.println("================");
            System.out.println("1. 회복 물약 사용");
            System.out.println("2. 사탕 사용");
            System.out.println("3. 돌아가기");
            System.out.print("선택: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    healingPotion.useItem();
                    healingPotion.printInfo();
                    break;
                case 2:
                    candy.useItem();
                    candy.printInfo();
                    break;
                case 3:
                    System.out.println("도구 확인을 종료합니다.");
                    running = false;
                    break;
                default:
                    System.out.println("유효하지 않은 선택입니다.");
            }
        }

        scanner.close();
    }


}
