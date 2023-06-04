
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
        exp_max = calculateExpMax(); // ���� ������ �ʿ��� �ִ� ����ġ�� ����մϴ�
        // ���������� ���� ���� ������ ������Ű�ų� ���ο� ����� ��� ���� �ֽ��ϴ�
    }

    private int calculateExpMax() {
        // ���� ������ �ʿ��� �ִ� ����ġ�� ����ϴ� ������ �����մϴ�
        // ���� ����: exp_max = (level * 25) + 25;
        return (level * 25) + 25;
    }

    
    public void playerInfo() {
        System.out.println("�÷��̾� �̸�: " + name_player);
        System.out.println("����: " + level);
        System.out.println("����ġ: " + exp_has);
    }

    public String getName() {
        return Message.name_player;
    }
	public void setName(String name) {
        Message.name_player = name;
    }
}
	