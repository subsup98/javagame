import java.io.Serializable;

public class Skill implements Serializable
{   String name_skill;    // 기술 이름
	int damage_skill;    // 기술위력 
	int pm;              // 1. Physical 2. magical
	int accuracyRate;    // 명중률
	int pp;              // 기술사용 횟수
	int pp_max;
	
	
	public Skill() {}

	public Skill(String name_skill,int damage_skill, int pm, int accuracyRate,int pp) 
	{
		this.name_skill = name_skill;
		this.damage_skill = damage_skill;
		this.pm = pm;
		this.accuracyRate = accuracyRate;
		this.pp = pp;
		this.pp_max = pp;
	}
	
	
}