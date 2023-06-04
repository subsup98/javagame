package pokemongame_;


import java.io.Serializable;

public class Player implements Serializable {
    private String name_player;
    int level;
    int exp_has=0,exp_max=25,exp_giving=15;
    
    
    public Player(String name) {
        this.name_player = name;
        this.level = 1;
    }

	public int getLevel() {
        return level;
    }
    
    public int getExp() {
       return exp_has;
    }

    public void levelUp() {
        level++;
        exp_has = 0;
        exp_max = calculateExpMax(); // 다음 레벨에 필요한 최대 경험치를 계산합니다
        // 선택적으로 레벨 업시 스탯을 증가시키거나 새로운 기술을 배울 수도 있습니다
    }

    private int calculateExpMax() {
        // 다음 레벨에 필요한 최대 경험치를 계산하는 공식을 정의합니다
        // 예시 공식: exp_max = (level * 25) + 25;
        return (level * 25) + 25;
    }

    
    public void playerInfo() {
        System.out.println("플레이어 이름: " + name_player);
        System.out.println("레벨: " + level);
        System.out.println("경험치: " + exp_has);
    }

    public String getName() {
        return Message.name_player;
    }
	public void setName(String name) {
        Message.name_player = name;
    }
}
	
