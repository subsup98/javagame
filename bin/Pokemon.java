import java.io.Serializable;

public class Pokemon implements Serializable 
{	String name_pok;
	int hp=20;
	int hp_max;
	int exp_has=0,exp_max=25,exp_giving=15;
	//has = 보유경험치 max = 경험치통 give = 처치시 주는 경험치
	int level; 
	int pap=15;int map=15; // Physical Attack Power 물공  
	                 // Magical Attack Power  마공
	int pr=10,mr=10;       // Physical Resistance 물리저항력  						
					 // Magical Resistance 마법저항력
	int speed=10;
	Skill[] skill = new Skill[4];
	int[] evol = {1,1,1};
	int[] learnSkill = {1,1,1,1,1,1,1};
	public Pokemon() {}
	public Pokemon(String name_pok, int level, Skill skill) // 상대 포켓몬
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
	public Pokemon(int choice, int level) // 내 포켓몬
	{
		if(choice==1) 
		{this.name_pok = "이상해씨";
		this.skill[0]=Skill_arr.skills[1];
		for(int i=1;i<=3;i++)
		this.skill[i]=Skill_arr.skills[0];}
		else if(choice==2) 
		{this.name_pok = "파이리";
		this.skill[0]=Skill_arr.skills[2];
		for(int i=1;i<=3;i++)
		this.skill[i]=Skill_arr.skills[0];}
		else if(choice==3) 
		{this.name_pok = "꼬부기";
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