

import java.util.Scanner;

public class FightingSystem 
{  
	public void Fight(Pokemon mypok,Pokemon pok)
	{	//Bgm fight = new Bgm("src/pokemongame_/bgm/battle.mp3");
		//Bgm win = new Bgm("src/pokemongame_/bgm/win.mp3");
		//Bgm hit = new Bgm("src/pokemongame_/bgm/hit.mp3");
		//fight.play();
		while(true)
	    { View_fight.fightmain(mypok, pok);
		  if(mypok.speed>=pok.speed)
		  {   for(int i=0;i<4;i++)
		  	  {System.out.print(i+1+"."+mypok.skill[i].name_skill+"  ");}
			  int ch= Fuction.getChoice(4);
			  if(!mypok.skill[ch-1].name_skill.equals(""))
			  System.out.println(mypok.name_pok+"��"+mypok.skill[ch-1].name_skill+"����!!");
			  else {System.out.println("�ش罺ų�� ����Ҽ� �����ϴ�.");continue;}
			  if(getGainDamage(pok, getDamage(mypok, mypok.skill[ch-1], mypok.skill[ch-1].pm), mypok.skill[ch-1].pm)>0)
			  {
			  //hit.play();
		  	  hit(pok,getGainDamage(pok, getDamage(mypok, mypok.skill[ch-1], mypok.skill[ch-1].pm), mypok.skill[ch-1].pm));
			  System.out.println(pok.name_pok+"��(��)"+getGainDamage(pok, getDamage(mypok, mypok.skill[ch-1], mypok.skill[ch-1].pm), mypok.skill[ch-1].pm)+"�� �������� �Ծ���!!");
			  }
			  else 
			  {//hit.play();
			   System.out.println(pok.name_pok+"��(��)"+"1�� �������� �Ծ���!!");
			   hit(pok, 1);												 }
			  View.pause();
			  
			  if(pok.hp<=0) 
			  {
			  //fight.close();
			  //win.play();
			  System.out.println("�������� �¸��ϼ̽��ϴ�!!!");
			  Fuction.sleep(1000);
			  getExp(mypok,pok);
			  Fuction.sleep(1000);
			  levelup(mypok);
			  Fuction.sleep(1000);
			  evolve(mypok);
			  learnSkill(mypok);
			  Fuction.sleep(1000);
			 // win.close();
			  break;
			  } 
			  else if(mypok.hp<=0)
			  {//fight.close();
			   System.out.println("�������� �й��ϼ̽��ϴ�. �ФФФФ�"); View.view_pokemonCenter2(mypok); break;}
			  
			  int ch2 = 1;
			  if(!pok.skill[ch2-1].name_skill.equals(""))
			  System.out.println(pok.name_pok+"��"+pok.skill[ch2-1].name_skill+"����!!");
			  if(getGainDamage(mypok, getDamage(pok, pok.skill[ch2-1], pok.skill[ch2-1].pm), pok.skill[ch2-1].pm)>0)
			  {//hit.play();
			  hit(mypok,getGainDamage(mypok, getDamage(pok, pok.skill[ch2-1], pok.skill[ch2-1].pm), pok.skill[ch2-1].pm));
			  System.out.println(mypok.name_pok+"��(��)"+getGainDamage(mypok, getDamage(pok, pok.skill[ch2-1], pok.skill[ch2-1].pm), pok.skill[ch2-1].pm)+"�� �������� �Ծ���!!");
			  }
			  else
			  	{// hit.play();
				  System.out.println(mypok.name_pok+"��(��)"+"1�� �������� �Ծ���!!");
			  	 hit(mypok, 1);											}
			  View.pause(); View.pause();
		  }
		  else
		  {
			  int ch2 = 1;
			  if(!pok.skill[ch2-1].name_skill.equals(""))
				  System.out.println(pok.name_pok+"��"+pok.skill[ch2-1].name_skill+"����!!");
			  if(getGainDamage(mypok, getDamage(pok, pok.skill[ch2-1], pok.skill[ch2-1].pm), pok.skill[ch2-1].pm)>0)
			  {//hit.play();
			  hit(mypok,getGainDamage(mypok, getDamage(pok, pok.skill[ch2-1], pok.skill[ch2-1].pm), pok.skill[ch2-1].pm));
			  System.out.println(mypok.name_pok+"��(��)"+getGainDamage(mypok, getDamage(pok, pok.skill[ch2-1], pok.skill[ch2-1].pm), pok.skill[ch2-1].pm)+"�� �������� �Ծ���!!");
			  }
			  else
			  {//hit.play();
			  System.out.println(mypok.name_pok+"��(��)"+"1�� �������� �Ծ���!!");
			  hit(mypok, 1);											
			  }
			  for(int i=0;i<4;i++)
		  	  {System.out.print(i+1+"."+mypok.skill[i].name_skill+"  ");}
			  if(pok.hp<=0) 
			  {  
			  //fight.close();
			  //win.play();
			  System.out.println("�������� �¸��ϼ̽��ϴ�!!!");
			  Fuction.sleep(1000);
			  getExp(mypok,pok);
			  Fuction.sleep(1000);
			  levelup(mypok);
			  Fuction.sleep(1000);
			  evolve(mypok);
			  learnSkill(mypok);
			  Fuction.sleep(1000);
			  //win.close();
			  break;
			  } 
			  else if(mypok.hp<=0)
			  {//fight.close();
			  System.out.println("\n�������� �й��ϼ̽��ϴ�. �ФФФФ�"); View.view_pokemonCenter2(mypok); break;}
			  int ch= Fuction.getChoice(4);
			  if(!mypok.skill[ch-1].name_skill.equals(""))
			  System.out.println(mypok.name_pok+"��"+mypok.skill[ch-1].name_skill+"����!!");
			  else {System.out.println("�ش罺ų�� ����Ҽ� �����ϴ�.");continue;}
			  if(getGainDamage(pok, getDamage(mypok, mypok.skill[ch-1], mypok.skill[ch-1].pm), mypok.skill[ch-1].pm)>0)
			  {
			  hit(pok,getGainDamage(pok, getDamage(mypok, mypok.skill[ch-1], mypok.skill[ch-1].pm), mypok.skill[ch-1].pm));
			  System.out.println(pok.name_pok+"��(��)"+getGainDamage(pok, getDamage(mypok, mypok.skill[ch-1], mypok.skill[ch-1].pm), mypok.skill[ch-1].pm)+"�� �������� �Ծ���!!");
			  }
			  else 
			  {System.out.println(pok.name_pok+"��(��)"+"1�� �������� �Ծ���!!");
			  hit(pok, 1);												 }
			  View.pause();
		  }
		
		
	    }
		pok.hp = pok.hp_max;
	}
	
	public void Fight_challenge(Pokemon mypok,Pokemon pok)
	{	//Bgm chal = new Bgm("src/pokemongame_/bgm/challenge.mp3");
		//Bgm win = new Bgm("src/pokemongame_/bgm/win.mp3");
		//Bgm hit = new Bgm("src/pokemongame_/bgm/hit.mp3");
		//chal.play();
		while(true)
		{ View_fight.fightmain(mypok, pok);
		if(mypok.speed>=pok.speed)
		{   for(int i=0;i<4;i++)
		{System.out.print(i+1+"."+mypok.skill[i].name_skill+"  ");}
		int ch= Fuction.getChoice(4);
		if(!mypok.skill[ch-1].name_skill.equals(""))
			System.out.println(mypok.name_pok+"��"+mypok.skill[ch-1].name_skill+"����!!");
		else {System.out.println("�ش罺ų�� ����Ҽ� �����ϴ�.");continue;}
		if(getGainDamage(pok, getDamage(mypok, mypok.skill[ch-1], mypok.skill[ch-1].pm), mypok.skill[ch-1].pm)>0)
		{	//hit.play();
			hit(pok,getGainDamage(pok, getDamage(mypok, mypok.skill[ch-1], mypok.skill[ch-1].pm), mypok.skill[ch-1].pm));
			System.out.println(pok.name_pok+"��(��)"+getGainDamage(pok, getDamage(mypok, mypok.skill[ch-1], mypok.skill[ch-1].pm), mypok.skill[ch-1].pm)+"�� �������� �Ծ���!!");
		}
		else 
		{//hit.play();
			System.out.println(pok.name_pok+"��(��)"+"1�� �������� �Ծ���!!");
		hit(pok, 1);												 }
		View.pause();
		
		if(pok.hp<=0) 
		{  
		//chal.close();
		//win.play();
		System.out.println("�������� �¸��ϼ̽��ϴ�!!!");
		Fuction.sleep(1000);
		getExp(mypok,pok);
		Fuction.sleep(1000);
		levelup(mypok);
		Fuction.sleep(1000);
		evolve(mypok);
		learnSkill(mypok);
		Fuction.sleep(1000);
		//win.close();
		if(View.badge<=View.mytown)
		View.badge++;
		break;
		} 
		else if(mypok.hp<=0)
		{//chal.close();
		System.out.println("�������� �й��ϼ̽��ϴ�. �ФФФФ�"); View.view_pokemonCenter2(mypok); break;}
		
		int ch2 = 1;
		if(!pok.skill[ch2-1].name_skill.equals(""))
			System.out.println(pok.name_pok+"��"+pok.skill[ch2-1].name_skill+"����!!");
		if(getGainDamage(mypok, getDamage(pok, pok.skill[ch2-1], pok.skill[ch2-1].pm), pok.skill[ch2-1].pm)>0)
		{//hit.play();
			hit(mypok,getGainDamage(mypok, getDamage(pok, pok.skill[ch2-1], pok.skill[ch2-1].pm), pok.skill[ch2-1].pm));
			System.out.println(mypok.name_pok+"��(��)"+getGainDamage(mypok, getDamage(pok, pok.skill[ch2-1], pok.skill[ch2-1].pm), pok.skill[ch2-1].pm)+"�� �������� �Ծ���!!");
		}
		else
		{//hit.play();
			System.out.println(mypok.name_pok+"��(��)"+"1�� �������� �Ծ���!!");
		hit(mypok, 1);											}
		View.pause(); View.pause();
		}
		else
		{
			int ch2 = 1;
			if(!pok.skill[ch2-1].name_skill.equals(""))
				System.out.println(pok.name_pok+"��"+pok.skill[ch2-1].name_skill+"����!!");
			if(getGainDamage(mypok, getDamage(pok, pok.skill[ch2-1], pok.skill[ch2-1].pm), pok.skill[ch2-1].pm)>0)
			{	//hit.play();
				hit(mypok,getGainDamage(mypok, getDamage(pok, pok.skill[ch2-1], pok.skill[ch2-1].pm), pok.skill[ch2-1].pm));
				System.out.println(mypok.name_pok+"��(��)"+getGainDamage(mypok, getDamage(pok, pok.skill[ch2-1], pok.skill[ch2-1].pm), pok.skill[ch2-1].pm)+"�� �������� �Ծ���!!");
			}
			else
			{	//hit.play();
				System.out.println(mypok.name_pok+"��(��)"+"1�� �������� �Ծ���!!");
				hit(mypok, 1);											
			}
			for(int i=0;i<4;i++)
			{System.out.print(i+1+"."+mypok.skill[i].name_skill+"  ");}
			if(pok.hp<=0) 
			{  
			//chal.close();
			//win.play();
			System.out.println("�������� �¸��ϼ̽��ϴ�!!!");
			Fuction.sleep(1000);
			getExp(mypok,pok);
			Fuction.sleep(1000);
			levelup(mypok);
			Fuction.sleep(1000);
			evolve(mypok);
			learnSkill(mypok);
			Fuction.sleep(1000);
			//win.close();
			if(View.badge<=View.mytown)
			View.badge++;
			break;
			} 
			else if(mypok.hp<=0)
			{//chal.close();
			System.out.println("\n�������� �й��ϼ̽��ϴ�. �ФФФФ�"); View.view_pokemonCenter2(mypok); break;}
			int ch= Fuction.getChoice(4);
			if(!mypok.skill[ch-1].name_skill.equals(""))
				System.out.println(mypok.name_pok+"��"+mypok.skill[ch-1].name_skill+"����!!");
			else {System.out.println("�ش罺ų�� ����Ҽ� �����ϴ�.");continue;}
			if(getGainDamage(pok, getDamage(mypok, mypok.skill[ch-1], mypok.skill[ch-1].pm), mypok.skill[ch-1].pm)>0)
			{	//hit.play();
				hit(pok,getGainDamage(pok, getDamage(mypok, mypok.skill[ch-1], mypok.skill[ch-1].pm), mypok.skill[ch-1].pm));
				System.out.println(pok.name_pok+"��(��)"+getGainDamage(pok, getDamage(mypok, mypok.skill[ch-1], mypok.skill[ch-1].pm), mypok.skill[ch-1].pm)+"�� �������� �Ծ���!!");
			}
			else 
			{//hit.play();
				System.out.println(pok.name_pok+"��(��)"+"1�� �������� �Ծ���!!");
			hit(pok, 1);												 }
			View.pause();
		}
		
		
		}
		pok.hp = pok.hp_max;
	}
	
	public int getDamage(Pokemon pok,Skill skill,int skillType)
	{	if(skillType ==1)
		return pok.pap*skill.damage_skill/100;
		return pok.map*skill.damage_skill/100;
	}
	
	public int getGainDamage(Pokemon pok,int damage,int skillType)//�޴µ�����
	{   if(skillType ==1)
		return damage-pok.pr/5;
		return damage-pok.mr/5;
	}
	public void hit(Pokemon pok,int damage)
	{		pok.hp -= damage;  	}
	public void levelup(Pokemon pok)
	{	while(true){
		if(pok.exp_has>=pok.exp_max){
		pok.level++;
		System.out.println("������"+pok.level+"�� �ö����ϴ�!");
		pok.exp_has = pok.exp_has-pok.exp_max;
		pok.exp_max += 5;
		pok.hp +=5; 
		pok.hp_max +=5; 
		pok.pap += pok.level*3;
		pok.map += pok.level*3;
		pok.pr += pok.level*3;
		pok.mr += pok.level*3;
		pok.speed += pok.level*3;}
		else break;
	    }
	}
	public void getExp(Pokemon mypok,Pokemon pok)
	{   System.out.println(pok.exp_giving+"�� ����ġ ȹ��!!"); 
		mypok.exp_has += pok.exp_giving;       }
	
	public void evolve(Pokemon mypok) 
	{	//Bgm evol = new Bgm("src/pokemongame_/bgm/evol.mp3");
		
		String temp = mypok.name_pok;
		if(mypok.level>=25 &&mypok.evol[0]==1) {
			//bgm.close();
			//evol.play();
			System.out.println("����??!? "+mypok.name_pok+"�� ���°�?!?!");
			Fuction.sleep(3000);
			System.out.println(".....");
			Fuction.sleep(3000);
			System.out.println(".....");
			Fuction.sleep(3000);
			//evol.close();
			//bgm.play();
			if(mypok.name_pok.equals("�̻��ؾ�"))
			{
				mypok.name_pok = "�̻���Ǯ";
				System.out.println(temp+"��(��) "+mypok.name_pok+"���� ��ȭ�ߴ�!!!");
				mypok.evol[0]=0;
				
			}
			else if(mypok.name_pok.equals("���̸�"))
			{
				mypok.name_pok = "���ڵ�";
				System.out.println(temp+"��(��) "+mypok.name_pok+"���� ��ȭ�ߴ�!!!");
				mypok.evol[0]=0;
			}	
			else if(mypok.name_pok.equals("���α�"))
			{
				
				mypok.name_pok = "��Ϻα�";
				System.out.println(temp+"��(��) "+mypok.name_pok+"���� ��ȭ�ߴ�!!!");
				mypok.evol[0]=0;
			}
		} else if(mypok.level>=50 &&mypok.evol[1]==1) {
			//bgm.close();
			//evol.play();
			System.out.println("����??!? "+mypok.name_pok+"�� ���°�?!?!");
			Fuction.sleep(3000);
			System.out.println(".....");
			Fuction.sleep(3000);
			System.out.println(".....");
			Fuction.sleep(3000);
			if(mypok.name_pok.equals("�̻���Ǯ"))
			{
				mypok.name_pok = "�̻��ز�";
				System.out.println(temp+"��(��) "+mypok.name_pok+"���� ��ȭ�ߴ�!!!");
				mypok.evol[1]=0;
			}
			else if(mypok.name_pok.equals("���ڵ�"))
			{
				mypok.name_pok = "���ڸ�";
				System.out.println(temp+"��(��) "+mypok.name_pok+"���� ��ȭ�ߴ�!!!");
				mypok.evol[1]=0;
			}	
			else if(mypok.name_pok.equals("��Ϻα�"))
			{
				mypok.name_pok = "�źϿ�";
				System.out.println(temp+"��(��) "+mypok.name_pok+"���� ��ȭ�ߴ�!!!");
				mypok.evol[1]=0;
			}
		} else if(mypok.level>=75 &&mypok.evol[2]==1) {
			if(mypok.name_pok.equals("�̻��ز�"))
			{
				mypok.name_pok = "�ް��̻��ز�";
				System.out.println(temp+"��(��) "+mypok.name_pok+"���� ��ȭ�ߴ�!!!");
				mypok.evol[2]=0;
			}
			else if(mypok.name_pok.equals("���ڸ�"))
			{
				mypok.name_pok = "�ް����ڸ�Y";
				System.out.println(temp+"��(��) "+mypok.name_pok+"���� ��ȭ�ߴ�!!!");
				mypok.evol[2]=0;
			}	
			else if(mypok.name_pok.equals("�źϿ�"))
			{
				mypok.name_pok = "�ް��źϿ�";
				System.out.println(temp+"��(��) "+mypok.name_pok+"���� ��ȭ�ߴ�!!!");
				mypok.evol[2]=0;
			}
		}
		
		View.pause();View.pause();
		//evol.close();
		
	}
	
	public void learnSkill(Pokemon mypok) {
		if(mypok.level>=10 &&mypok.learnSkill[0]==1) {
			if(mypok.name_pok.equals("�̻��ؾ�")) {
				mypok.skill[1] = Skill_arr.skills[31];
			} else if(mypok.name_pok.equals("���̸�")) {
				mypok.skill[1] = Skill_arr.skills[4];
			} else if(mypok.name_pok.equals("���α�")) {
				mypok.skill[1] = Skill_arr.skills[39];
			}
			System.out.println(mypok.name_pok+"��(��) ���ο� ���");
			System.out.println(mypok.skill[1].name_skill+"��(��) �����!!");	
			mypok.learnSkill[0]=0;
		}else if(mypok.level>=22 &&mypok.learnSkill[1]==1) {
			if(mypok.name_pok.equals("�̻��ؾ�")) {
				mypok.skill[2] = Skill_arr.skills[23];
			} else if(mypok.name_pok.equals("���̸�")) {
				mypok.skill[2] = Skill_arr.skills[6];
			} else if(mypok.name_pok.equals("���α�")) {
				mypok.skill[2] = Skill_arr.skills[12];
			}
			System.out.println(mypok.name_pok+"��(��) ���ο� ���");
			System.out.println(mypok.skill[2].name_skill+"��(��) �����!!");	
			mypok.learnSkill[1]=0;
		}else if(mypok.level>=33 &&mypok.learnSkill[2]==1) {
			if(mypok.name_pok.equals("�̻���Ǯ")) {
				mypok.skill[3] = Skill_arr.skills[33];
			} else if(mypok.name_pok.equals("���ڵ�")) {
				mypok.skill[3] = Skill_arr.skills[7];
			} else if(mypok.name_pok.equals("��Ϻα�")) {
				mypok.skill[3] = Skill_arr.skills[40];
			}
			System.out.println(mypok.name_pok+"��(��) ���ο� ���");
			System.out.println(mypok.skill[3].name_skill+"��(��) �����!!");	
			mypok.learnSkill[2]=0;
		}else if(mypok.level>=45 &&mypok.learnSkill[3]==1) {
			if(mypok.name_pok.equals("�̻���Ǯ")) {
				mypok.skill[0] = Skill_arr.skills[34];
			} else if(mypok.name_pok.equals("���ڵ�")) {
				mypok.skill[0] = Skill_arr.skills[38];
			} else if(mypok.name_pok.equals("��Ϻα�")) {
				mypok.skill[0] = Skill_arr.skills[41];
			}
			System.out.println(mypok.name_pok+"��(��) ���ο� ���");
			System.out.print(mypok.skill[0].name_skill+"��(��) �����!!");	
			mypok.learnSkill[3]=0;
		}else if(mypok.level>=56 &&mypok.learnSkill[4]==1) {
			if(mypok.name_pok.equals("�̻��ز�")) {
				mypok.skill[1] = Skill_arr.skills[35];
			} else if(mypok.name_pok.equals("���ڸ�")) {
				mypok.skill[1] = Skill_arr.skills[22];
			} else if(mypok.name_pok.equals("�źϿ�")) {
				mypok.skill[1] = Skill_arr.skills[19];
			}
			System.out.println(mypok.name_pok+"��(��) ���ο� ���");
			System.out.println(mypok.skill[1].name_skill+"��(��) �����!!");	
			mypok.learnSkill[4]=0;
		}else if(mypok.level>=68 &&mypok.learnSkill[5]==1) {
			if(mypok.name_pok.equals("�̻��ز�")) {
				mypok.skill[2] = Skill_arr.skills[36];
			} else if(mypok.name_pok.equals("���ڸ�")) {
				mypok.skill[2] = Skill_arr.skills[38];
			} else if(mypok.name_pok.equals("�źϿ�")) {
				mypok.skill[2] = Skill_arr.skills[26];
			}
			System.out.println(mypok.name_pok+"��(��) ���ο� ���");
			System.out.println(mypok.skill[2].name_skill+"��(��) �����!!");	
			mypok.learnSkill[5]=0;
		}else if(mypok.level>=81 &&mypok.learnSkill[6]==1) {
			if(mypok.name_pok.equals("�ް��̻��ز�")) {
				mypok.skill[3] = Skill_arr.skills[37];
			} else if(mypok.name_pok.equals("�ް����ڸ�Y")) {
				mypok.skill[3] = Skill_arr.skills[30];
			} else if(mypok.name_pok.equals("�ް��źϿ�")) {
				mypok.skill[3] = Skill_arr.skills[42];
			}
			System.out.println(mypok.name_pok+"��(��) ���ο� ���");
			System.out.println(mypok.skill[3].name_skill+"��(��) �����!!");	
			mypok.learnSkill[6]=0;
		}
		
		
		
	}

}
