

import java.util.Scanner;

public class FightingSystem 
{  
	public void Catch(Pokemon[] pokemons, Pokemon pok) {
		for (int i=0; i<3; i++) {
			Pokemon mypok = pokemons[i];
			if(mypok ==null) {
				for (int j=0; j<1; j++) {
				 System.out.println(pok.name_pok+"을/를 잡았다!");
				 pokemons[i]=pok;
				}
			}
		}
		
	}
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
			  System.out.println(mypok.name_pok+"의"+mypok.skill[ch-1].name_skill+"공격!!");
			  else {System.out.println("해당스킬은 사용할수 없습니다.");continue;}
			  if(getGainDamage(pok, getDamage(mypok, mypok.skill[ch-1], mypok.skill[ch-1].pm), mypok.skill[ch-1].pm)>0)
			  {
			  //hit.play();
		  	  hit(pok,getGainDamage(pok, getDamage(mypok, mypok.skill[ch-1], mypok.skill[ch-1].pm), mypok.skill[ch-1].pm));
			  System.out.println(pok.name_pok+"이(가)"+getGainDamage(pok, getDamage(mypok, mypok.skill[ch-1], mypok.skill[ch-1].pm), mypok.skill[ch-1].pm)+"의 데미지를 입었다!!");
			  }
			  else 
			  {//hit.play();
			   System.out.println(pok.name_pok+"이(가)"+"1의 데미지를 입었다!!");
			   hit(pok, 1);												 }
			  View.pause();
			  
			  if(pok.hp<=0) 
			  {
			  //fight.close();
			  //win.play();
			  System.out.println("전투에서 승리하셨습니다!!!");
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
			   System.out.println("전투에서 패배하셨습니다. ㅠㅠㅠㅠㅠ"); View.view_pokemonCenter2(mypok); break;}
			  
			  int ch2 = 1;
			  if(!pok.skill[ch2-1].name_skill.equals(""))
			  System.out.println(pok.name_pok+"의"+pok.skill[ch2-1].name_skill+"공격!!");
			  if(getGainDamage(mypok, getDamage(pok, pok.skill[ch2-1], pok.skill[ch2-1].pm), pok.skill[ch2-1].pm)>0)
			  {//hit.play();
			  hit(mypok,getGainDamage(mypok, getDamage(pok, pok.skill[ch2-1], pok.skill[ch2-1].pm), pok.skill[ch2-1].pm));
			  System.out.println(mypok.name_pok+"이(가)"+getGainDamage(mypok, getDamage(pok, pok.skill[ch2-1], pok.skill[ch2-1].pm), pok.skill[ch2-1].pm)+"의 데미지를 입었다!!");
			  }
			  else
			  	{// hit.play();
				  System.out.println(mypok.name_pok+"이(가)"+"1의 데미지를 입었다!!");
			  	 hit(mypok, 1);											}
			  View.pause(); View.pause();
		  }
		  else
		  {
			  int ch2 = 1;
			  if(!pok.skill[ch2-1].name_skill.equals(""))
				  System.out.println(pok.name_pok+"의"+pok.skill[ch2-1].name_skill+"공격!!");
			  if(getGainDamage(mypok, getDamage(pok, pok.skill[ch2-1], pok.skill[ch2-1].pm), pok.skill[ch2-1].pm)>0)
			  {//hit.play();
			  hit(mypok,getGainDamage(mypok, getDamage(pok, pok.skill[ch2-1], pok.skill[ch2-1].pm), pok.skill[ch2-1].pm));
			  System.out.println(mypok.name_pok+"이(가)"+getGainDamage(mypok, getDamage(pok, pok.skill[ch2-1], pok.skill[ch2-1].pm), pok.skill[ch2-1].pm)+"의 데미지를 입었다!!");
			  }
			  else
			  {//hit.play();
			  System.out.println(mypok.name_pok+"이(가)"+"1의 데미지를 입었다!!");
			  hit(mypok, 1);											
			  }
			  for(int i=0;i<4;i++)
		  	  {System.out.print(i+1+"."+mypok.skill[i].name_skill+"  ");}
			  if(pok.hp<=0) 
			  {  
			  //fight.close();
			  //win.play();
			  System.out.println("전투에서 승리하셨습니다!!!");
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
			  System.out.println("\n전투에서 패배하셨습니다. ㅠㅠㅠㅠㅠ"); View.view_pokemonCenter2(mypok); break;}
			  int ch= Fuction.getChoice(4);
			  if(!mypok.skill[ch-1].name_skill.equals(""))
			  System.out.println(mypok.name_pok+"의"+mypok.skill[ch-1].name_skill+"공격!!");
			  else {System.out.println("해당스킬은 사용할수 없습니다.");continue;}
			  if(getGainDamage(pok, getDamage(mypok, mypok.skill[ch-1], mypok.skill[ch-1].pm), mypok.skill[ch-1].pm)>0)
			  {
			  hit(pok,getGainDamage(pok, getDamage(mypok, mypok.skill[ch-1], mypok.skill[ch-1].pm), mypok.skill[ch-1].pm));
			  System.out.println(pok.name_pok+"이(가)"+getGainDamage(pok, getDamage(mypok, mypok.skill[ch-1], mypok.skill[ch-1].pm), mypok.skill[ch-1].pm)+"의 데미지를 입었다!!");
			  }
			  else 
			  {System.out.println(pok.name_pok+"이(가)"+"1의 데미지를 입었다!!");
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
			System.out.println(mypok.name_pok+"의"+mypok.skill[ch-1].name_skill+"공격!!");
		else {System.out.println("해당스킬은 사용할수 없습니다.");continue;}
		if(getGainDamage(pok, getDamage(mypok, mypok.skill[ch-1], mypok.skill[ch-1].pm), mypok.skill[ch-1].pm)>0)
		{	//hit.play();
			hit(pok,getGainDamage(pok, getDamage(mypok, mypok.skill[ch-1], mypok.skill[ch-1].pm), mypok.skill[ch-1].pm));
			System.out.println(pok.name_pok+"이(가)"+getGainDamage(pok, getDamage(mypok, mypok.skill[ch-1], mypok.skill[ch-1].pm), mypok.skill[ch-1].pm)+"의 데미지를 입었다!!");
		}
		else 
		{//hit.play();
			System.out.println(pok.name_pok+"이(가)"+"1의 데미지를 입었다!!");
		hit(pok, 1);												 }
		View.pause();
		
		if(pok.hp<=0) 
		{  
		//chal.close();
		//win.play();
		System.out.println("전투에서 승리하셨습니다!!!");
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
		System.out.println("전투에서 패배하셨습니다. ㅠㅠㅠㅠㅠ"); View.view_pokemonCenter2(mypok); break;}
		
		int ch2 = 1;
		if(!pok.skill[ch2-1].name_skill.equals(""))
			System.out.println(pok.name_pok+"의"+pok.skill[ch2-1].name_skill+"공격!!");
		if(getGainDamage(mypok, getDamage(pok, pok.skill[ch2-1], pok.skill[ch2-1].pm), pok.skill[ch2-1].pm)>0)
		{//hit.play();
			hit(mypok,getGainDamage(mypok, getDamage(pok, pok.skill[ch2-1], pok.skill[ch2-1].pm), pok.skill[ch2-1].pm));
			System.out.println(mypok.name_pok+"이(가)"+getGainDamage(mypok, getDamage(pok, pok.skill[ch2-1], pok.skill[ch2-1].pm), pok.skill[ch2-1].pm)+"의 데미지를 입었다!!");
		}
		else
		{//hit.play();
			System.out.println(mypok.name_pok+"이(가)"+"1의 데미지를 입었다!!");
		hit(mypok, 1);											}
		View.pause(); View.pause();
		}
		else
		{
			int ch2 = 1;
			if(!pok.skill[ch2-1].name_skill.equals(""))
				System.out.println(pok.name_pok+"의"+pok.skill[ch2-1].name_skill+"공격!!");
			if(getGainDamage(mypok, getDamage(pok, pok.skill[ch2-1], pok.skill[ch2-1].pm), pok.skill[ch2-1].pm)>0)
			{	//hit.play();
				hit(mypok,getGainDamage(mypok, getDamage(pok, pok.skill[ch2-1], pok.skill[ch2-1].pm), pok.skill[ch2-1].pm));
				System.out.println(mypok.name_pok+"이(가)"+getGainDamage(mypok, getDamage(pok, pok.skill[ch2-1], pok.skill[ch2-1].pm), pok.skill[ch2-1].pm)+"의 데미지를 입었다!!");
			}
			else
			{	//hit.play();
				System.out.println(mypok.name_pok+"이(가)"+"1의 데미지를 입었다!!");
				hit(mypok, 1);											
			}
			for(int i=0;i<4;i++)
			{System.out.print(i+1+"."+mypok.skill[i].name_skill+"  ");}
			if(pok.hp<=0) 
			{  
			//chal.close();
			//win.play();
			System.out.println("전투에서 승리하셨습니다!!!");
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
			System.out.println("\n전투에서 패배하셨습니다. ㅠㅠㅠㅠㅠ"); View.view_pokemonCenter2(mypok); break;}
			int ch= Fuction.getChoice(4);
			if(!mypok.skill[ch-1].name_skill.equals(""))
				System.out.println(mypok.name_pok+"의"+mypok.skill[ch-1].name_skill+"공격!!");
			else {System.out.println("해당스킬은 사용할수 없습니다.");continue;}
			if(getGainDamage(pok, getDamage(mypok, mypok.skill[ch-1], mypok.skill[ch-1].pm), mypok.skill[ch-1].pm)>0)
			{	//hit.play();
				hit(pok,getGainDamage(pok, getDamage(mypok, mypok.skill[ch-1], mypok.skill[ch-1].pm), mypok.skill[ch-1].pm));
				System.out.println(pok.name_pok+"이(가)"+getGainDamage(pok, getDamage(mypok, mypok.skill[ch-1], mypok.skill[ch-1].pm), mypok.skill[ch-1].pm)+"의 데미지를 입었다!!");
			}
			else 
			{//hit.play();
				System.out.println(pok.name_pok+"이(가)"+"1의 데미지를 입었다!!");
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
	
	public int getGainDamage(Pokemon pok,int damage,int skillType)//받는데미지
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
		System.out.println("레벨이"+pok.level+"로 올랐습니다!");
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
	{   System.out.println(pok.exp_giving+"의 경험치 획득!!"); 
		mypok.exp_has += pok.exp_giving;       }
	
	public void evolve(Pokemon mypok) 
	{	//Bgm evol = new Bgm("src/pokemongame_/bgm/evol.mp3");
		
		String temp = mypok.name_pok;
		if(mypok.level>=25 &&mypok.evol[0]==1) {
			//bgm.close();
			//evol.play();
			System.out.println("오잉??!? "+mypok.name_pok+"의 상태가?!?!");
			Fuction.sleep(3000);
			System.out.println(".....");
			Fuction.sleep(3000);
			System.out.println(".....");
			Fuction.sleep(3000);
			//evol.close();
			//bgm.play();
			if(mypok.name_pok.equals("이상해씨"))
			{
				mypok.name_pok = "이상해풀";
				System.out.println(temp+"이(가) "+mypok.name_pok+"으로 진화했다!!!");
				mypok.evol[0]=0;
				
			}
			else if(mypok.name_pok.equals("파이리"))
			{
				mypok.name_pok = "리자드";
				System.out.println(temp+"이(가) "+mypok.name_pok+"으로 진화했다!!!");
				mypok.evol[0]=0;
			}	
			else if(mypok.name_pok.equals("꼬부기"))
			{
				
				mypok.name_pok = "어니부기";
				System.out.println(temp+"이(가) "+mypok.name_pok+"으로 진화했다!!!");
				mypok.evol[0]=0;
			}
		} else if(mypok.level>=50 &&mypok.evol[1]==1) {
			//bgm.close();
			//evol.play();
			System.out.println("오잉??!? "+mypok.name_pok+"의 상태가?!?!");
			Fuction.sleep(3000);
			System.out.println(".....");
			Fuction.sleep(3000);
			System.out.println(".....");
			Fuction.sleep(3000);
			if(mypok.name_pok.equals("이상해풀"))
			{
				mypok.name_pok = "이상해꽃";
				System.out.println(temp+"이(가) "+mypok.name_pok+"으로 진화했다!!!");
				mypok.evol[1]=0;
			}
			else if(mypok.name_pok.equals("리자드"))
			{
				mypok.name_pok = "리자몽";
				System.out.println(temp+"이(가) "+mypok.name_pok+"으로 진화했다!!!");
				mypok.evol[1]=0;
			}	
			else if(mypok.name_pok.equals("어니부기"))
			{
				mypok.name_pok = "거북왕";
				System.out.println(temp+"이(가) "+mypok.name_pok+"으로 진화했다!!!");
				mypok.evol[1]=0;
			}
		} else if(mypok.level>=75 &&mypok.evol[2]==1) {
			if(mypok.name_pok.equals("이상해꽃"))
			{
				mypok.name_pok = "메가이상해꽃";
				System.out.println(temp+"이(가) "+mypok.name_pok+"으로 진화했다!!!");
				mypok.evol[2]=0;
			}
			else if(mypok.name_pok.equals("리자몽"))
			{
				mypok.name_pok = "메가리자몽Y";
				System.out.println(temp+"이(가) "+mypok.name_pok+"으로 진화했다!!!");
				mypok.evol[2]=0;
			}	
			else if(mypok.name_pok.equals("거북왕"))
			{
				mypok.name_pok = "메가거북왕";
				System.out.println(temp+"이(가) "+mypok.name_pok+"으로 진화했다!!!");
				mypok.evol[2]=0;
			}
		}
		
		View.pause();View.pause();
		//evol.close();
		
	}
	
	public void learnSkill(Pokemon mypok) {
		if(mypok.level>=10 &&mypok.learnSkill[0]==1) {
			if(mypok.name_pok.equals("이상해씨")) {
				mypok.skill[1] = Skill_arr.skills[31];
			} else if(mypok.name_pok.equals("파이리")) {
				mypok.skill[1] = Skill_arr.skills[4];
			} else if(mypok.name_pok.equals("꼬부기")) {
				mypok.skill[1] = Skill_arr.skills[39];
			}
			System.out.println(mypok.name_pok+"이(가) 새로운 기술");
			System.out.println(mypok.skill[1].name_skill+"을(를) 배웠다!!");	
			mypok.learnSkill[0]=0;
		}else if(mypok.level>=22 &&mypok.learnSkill[1]==1) {
			if(mypok.name_pok.equals("이상해씨")) {
				mypok.skill[2] = Skill_arr.skills[23];
			} else if(mypok.name_pok.equals("파이리")) {
				mypok.skill[2] = Skill_arr.skills[6];
			} else if(mypok.name_pok.equals("꼬부기")) {
				mypok.skill[2] = Skill_arr.skills[12];
			}
			System.out.println(mypok.name_pok+"이(가) 새로운 기술");
			System.out.println(mypok.skill[2].name_skill+"을(를) 배웠다!!");	
			mypok.learnSkill[1]=0;
		}else if(mypok.level>=33 &&mypok.learnSkill[2]==1) {
			if(mypok.name_pok.equals("이상해풀")) {
				mypok.skill[3] = Skill_arr.skills[33];
			} else if(mypok.name_pok.equals("리자드")) {
				mypok.skill[3] = Skill_arr.skills[7];
			} else if(mypok.name_pok.equals("어니부기")) {
				mypok.skill[3] = Skill_arr.skills[40];
			}
			System.out.println(mypok.name_pok+"이(가) 새로운 기술");
			System.out.println(mypok.skill[3].name_skill+"을(를) 배웠다!!");	
			mypok.learnSkill[2]=0;
		}else if(mypok.level>=45 &&mypok.learnSkill[3]==1) {
			if(mypok.name_pok.equals("이상해풀")) {
				mypok.skill[0] = Skill_arr.skills[34];
			} else if(mypok.name_pok.equals("리자드")) {
				mypok.skill[0] = Skill_arr.skills[38];
			} else if(mypok.name_pok.equals("어니부기")) {
				mypok.skill[0] = Skill_arr.skills[41];
			}
			System.out.println(mypok.name_pok+"이(가) 새로운 기술");
			System.out.print(mypok.skill[0].name_skill+"을(를) 배웠다!!");	
			mypok.learnSkill[3]=0;
		}else if(mypok.level>=56 &&mypok.learnSkill[4]==1) {
			if(mypok.name_pok.equals("이상해꽃")) {
				mypok.skill[1] = Skill_arr.skills[35];
			} else if(mypok.name_pok.equals("리자몽")) {
				mypok.skill[1] = Skill_arr.skills[22];
			} else if(mypok.name_pok.equals("거북왕")) {
				mypok.skill[1] = Skill_arr.skills[19];
			}
			System.out.println(mypok.name_pok+"이(가) 새로운 기술");
			System.out.println(mypok.skill[1].name_skill+"을(를) 배웠다!!");	
			mypok.learnSkill[4]=0;
		}else if(mypok.level>=68 &&mypok.learnSkill[5]==1) {
			if(mypok.name_pok.equals("이상해꽃")) {
				mypok.skill[2] = Skill_arr.skills[36];
			} else if(mypok.name_pok.equals("리자몽")) {
				mypok.skill[2] = Skill_arr.skills[38];
			} else if(mypok.name_pok.equals("거북왕")) {
				mypok.skill[2] = Skill_arr.skills[26];
			}
			System.out.println(mypok.name_pok+"이(가) 새로운 기술");
			System.out.println(mypok.skill[2].name_skill+"을(를) 배웠다!!");	
			mypok.learnSkill[5]=0;
		}else if(mypok.level>=81 &&mypok.learnSkill[6]==1) {
			if(mypok.name_pok.equals("메가이상해꽃")) {
				mypok.skill[3] = Skill_arr.skills[37];
			} else if(mypok.name_pok.equals("메가리자몽Y")) {
				mypok.skill[3] = Skill_arr.skills[30];
			} else if(mypok.name_pok.equals("메가거북왕")) {
				mypok.skill[3] = Skill_arr.skills[42];
			}
			System.out.println(mypok.name_pok+"이(가) 새로운 기술");
			System.out.println(mypok.skill[3].name_skill+"을(를) 배웠다!!");	
			mypok.learnSkill[6]=0;
		}
		
		
		
	}

}
