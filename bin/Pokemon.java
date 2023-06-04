import java.io.Serializable;

public class Pokemon implements Serializable 
{	String name_pok;
	int hp=20;
	int hp_max;
	int exp_has=0,exp_max=25,exp_giving=15;
	//has = ��������ġ max = ����ġ�� give = óġ�� �ִ� ����ġ
	int level; 
	int pap=15;int map=15; // Physical Attack Power ����  
	                 // Magical Attack Power  ����
	int pr=10,mr=10;       // Physical Resistance �������׷�  						
					 // Magical Resistance �������׷�
	int speed=10;
	Skill[] skill = new Skill[4];
	int[] evol = {1,1,1};
	int[] learnSkill = {1,1,1,1,1,1,1};
	public Pokemon() {}
	public Pokemon(String name_pok, int level, Skill skill) // ��� ���ϸ�
	{   this.skill[0] = skill;
		this.name_pok = name_pok;
		this.level = level;
		this.hp += level*2;
		this.hp_max = hp;
		this.exp_giving += level*10;
		this.pap += level*2;
		this.map += level*2;
		this.pr += level*2;
		this.mr += level*2;
		this.speed += level*2;
	}
	public Pokemon(int choice, int level) // �� ���ϸ�
	{
		if(choice==1) 
		{this.name_pok = "�̻��ؾ�";
		this.skill[0]=Skill_arr.skills[1];
		for(int i=1;i<=3;i++)
		this.skill[i]=Skill_arr.skills[0];}
		else if(choice==2) 
		{this.name_pok = "���̸�";
		this.skill[0]=Skill_arr.skills[2];
		for(int i=1;i<=3;i++)
		this.skill[i]=Skill_arr.skills[0];}
		else if(choice==3) 
		{this.name_pok = "���α�";
		this.skill[0]=Skill_arr.skills[3];
		for(int i=1;i<=3;i++)
		this.skill[i]=Skill_arr.skills[0];}
		this.level = level;
		this.hp += level*2;
		this.hp_max = hp;
		this.exp_giving += level*10;
		this.pap += level*2;
		this.map += level*2;
		this.pr += level*2;
		this.mr += level*2;
		this.speed += level*2;
	}
	
	
}