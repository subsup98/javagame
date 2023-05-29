

public class Item {
    private String name;
    private int number;  //필드

    public Item(String name, int number) { //아이템 생성자(아이템이름과 갯수초기화
        this.name = name;
        this.number = number;
    }
   
    public void use_Item(String Item_Name, int number) {
    	    if (number > 0) {
    	        System.out.println(Item_Name + "을(를) 사용했습니다.");
    	        number--;
    	    } else {
    	        System.out.println(Item_Name + "이(가) 없습니다.");
    	    }
    }

    public void set_Item(String Item_Name, int number) {
        this.name = Item_Name;
        this.number = number;
    }
    

    
    public String get_Item(String Item_Name, int number) {
        Item item = new Item(Item_Name, number);
        return item.getName() + " " + number + "개를 획득했습니다.";
        
    }
    
    public String getName() {
        return name;
    }
    public int getNumber() {
        return number;
    }

    public static class HealingPotion extends Item {
        private int effect;

        public HealingPotion(String name, int effect) {
            super(name, 1); //아이템 생성갯수 1	
            this.effect = effect; //효과 설정
        }

        public int getEffect() {
            return effect;
        }
        public void printInfo() {
            System.out.println("이름: " + getName());
            System.out.println("개수: " + getNumber());
        }
    }
	/* 만약 포션종류를 늘리고자 하면 이런식으로 늘리면 될것 같아요
	 * public static class BetterHealingPotion extends HealingPotion { public
	 * HealingPotion2(String name, int effect) { super(name, effect); } }
	 */


    public static class MonsterBall extends Item {
        private int catchRate;
        private int trainerLevel;

        public MonsterBall(String name, int trainerLevel, int catchRate) {
            super(name, 1);
            this.catchRate = catchRate; //포획비율을 몇으로 설정해두면 좋을까요 예)this.catchRate= 50;
            this.trainerLevel = trainerLevel;
        }

        public int getCatchRate() {
            return catchRate + (trainerLevel * 1); //기존 포획비율+트레이너레벨별확률?
        }

        public int getTrainerLevel() {
            return trainerLevel;
        }
        public void printInfo() {
            System.out.println("이름: " + getName());
            System.out.println("개수: " + getNumber());
        }
    }


    public static class Candy extends Item {
        private int exp;

        public Candy(String name, int exp) {
            super(name, 1);
            this.exp = exp; // 혹은 exp를 하나의 수치값으로 고정해두는건 어떨까요
        }

        public int getExp() {
            return exp;
        }
        public void printInfo() {
            System.out.println("이름: " + getName());
            System.out.println("개수: " + getNumber());
        }
        
    }
}


