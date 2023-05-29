

public class Pokemon {
    private String name;
    private int level;
    private int maxHp;
    private int currentHp;
    private int attack;
    private int defense;
    private int speed;

    public Pokemon(String name, int level, int maxHp, int attack, int defense, int speed) {
        this.name = name;
        this.level = level;
        this.maxHp = maxHp;
        this.currentHp = maxHp;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public int getCurrentHp() {
        return currentHp;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getSpeed() {
        return speed;
    }

    public void setCurrentHp(int currentHp) {
        this.currentHp = currentHp;
    }

    public void levelUp() {
        this.level++;
        this.maxHp += 10;
        this.currentHp = this.maxHp;
        this.attack += 2;
        this.defense += 2;
        this.speed += 1;
    }

    public void takeDamage(int damage) {
        int actualDamage = Math.max(damage - this.defense, 1);
        this.currentHp -= actualDamage;
    }

    public void attack(Pokemon target) {
        int damage = this.attack - target.getDefense();
        if (damage <= 0) {
            System.out.println(this.name + "의 공격이 무효합니다.");
        } else {
            System.out.println(this.name + "이(가) " + target.getName() + "에게 " + damage + "의 데미지를 입혔습니다.");
            target.takeDamage(damage);
        }
    }

    @Override
    public String toString() {
        return this.name + " (레벨 " + this.level + ") HP: " + this.currentHp + "/" + this.maxHp +
                " 공격: " + this.attack + " 방어: " + this.defense + " 속도: " + this.speed;
    }
}



//여기서 부터 제가 조금 수정한부분 체크해놔서 올렸습니다.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Pokemon {
    private String name;
    private int level;
    private int maxHp;
    private int currentHp;
    private int attack;
    private int defense;
    private String attribute; //추가
    private int speed;

    public Pokemon(String name, int level, int maxHp, int attack, int defense, int speed) {
        this.name = name;
        this.level = level;
        this.maxHp = maxHp;
        this.currentHp=maxHp;	
        this.attack = attack;
        this.defense = defense;
        this.attribute = attribute; //추가
        this.speed = speed;
        
        loadAdditionalInfo();
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getMaxHp() {
        return maxHp;
    }
    
    public int getCurrentHp() {
        return currentHp;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }
    public String getAttribute() {
    	return attribute;
    }

    public int getSpeed() {
        return speed;
    }

    public void setCurrentHp(int currentHp) {
        this.currentHp = currentHp;
    }

    public void levelUp() {
        this.level++;
        this.maxHp += 10;
        this.currentHp = this.maxHp;
        this.attack += 2;
        this.defense += 2;
        this.speed += 1;
    }
    // 파일에서 정보 불러오기 위해서 추가
    private void loadAdditionalInfo() {
        try (BufferedReader br = new BufferedReader(new FileReader("info.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
              
                String[] parts = line.split(":");
                if (parts.length == 2) {
                    String attribute = parts[0].trim();
                    String value = parts[1].trim();

                    switch (attribute) {
                        case "이름":
                            this.name = value;
                            break;
                        case "Level":
                            this.level = Integer.parseInt(value);
                            break;
                        case "Max HP":
                            this.maxHp = Integer.parseInt(value);
                            this.currentHp = this.maxHp;
                            break;
                        case "공격":
                            this.attack = Integer.parseInt(value);
                            break;
                        case "방어":
                            this.defense = Integer.parseInt(value);
                            break;
                        case "속성":
                            this.attribute = value;
                        case "속도":
                            this.speed = Integer.parseInt(value);
                            break;
                        default:
                            break;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void takeDamage(int damage) {
        int actualDamage = Math.max(damage - this.defense, 1);
        this.currentHp -= actualDamage;
    }

    public void attack(Pokemon target) {
        int damage = this.attack - target.getDefense();
        if (damage <= 0) {
            System.out.println(this.name + "의 공격이 무효합니다.");
        } else {
            System.out.println(this.name + "이(가)" + target.getName() + "에게 " + damage + "의 데미지를 입혔습니다.");
            target.takeDamage(damage);
        }
    }

    @Override
    public String toString() {
        return this.name + " (레벨 " + this.level + ") HP: " + this.currentHp + "/" + this.maxHp +
                "공격:" + this.attack + " 방어: " + this.defense + " 속도: " + this.speed +"속성:"+this.attribute;
    }
}
