import java.io.Serializable;

public class Skill implements Serializable
{   String name_skill;    // ��� �̸�
	int damage_skill;    // ������� 
	int pm;              // 1. Physical 2. magical
	int accuracyRate;    // ���߷�
	int pp;              // ������ Ƚ��
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