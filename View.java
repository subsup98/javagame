package pokemongame_;


import java.io.IOException;

public class View 
{  
	public static String[] name_town = {"상록시티","회색시티","블루시티","갈색시티","무지개시티",
			"연분홍시티","노랑시티","홍련섬"};
	public static int mytown =0;
	public static int badge = 0;
	
	public static void view_town(String name_town) 
	{
		System.out.println("===========================================================================");
		System.out.println("                       \t\t"+name_town+"에 오신것을 환영합니다!!");
		System.out.println("    1.사냥터 2.내 포켓몬 3.포켓몬센터 4.체육관도전 5.마을 이동 6.트레이너 정보 7.저장하기 8.불러오기 ");
		System.out.println("===========================================================================");
	}
	public static void view_dungeon(int level)
	{   int index=1;
		for (int i = level; i < level+9; i++) 
		{
		   System.out.println(index++ +". "+i+"레벨 몬스터 사냥");	
		}
	}
	public static void view_mypok(Pokemon mypok)
	{
		System.out.println("이름 : "+mypok.name_pok);
		System.out.println("레벨  : "+mypok.level);
		System.out.println("체력 : "+mypok.hp+" / "+mypok.hp_max);
		System.out.println("보유경험치 : "+mypok.exp_has);
		System.out.println("현재레벨 최대 경험치 : "+mypok.exp_max);
		System.out.println("보유기술  ");
		for(int i=0;i<4;i++)
		{   
			System.out.print(i+1+"."+mypok.skill[i].name_skill+"  ");
		}
		pause();
	}
	public static void view_pokemonCenter(Pokemon mypok) 
	{  
		System.out.println("==================================");
		System.out.println("    포켓몬센터에 오신것을 환영합니다!!     ");
		System.out.println("==================================");
		pause();
		System.out.println("포켓몬을 회복시킵니다.....");
		//pokcen.close();
	    //new Bgm("src/pokemongame_/bgm/heal.mp3").play();
		Fuction.sleep(3000);
		System.out.println("회복완료!!");
		Fuction.sleep(1000);
		mypok.hp = mypok.hp_max;
	}
	public static void view_pokemonCenter2(Pokemon mypok) 
	{	//Bgm pokcen = new Bgm("src/bgm/pokemoncenter.mp3");
		//pokcen.play();
		System.out.println("포켓몬이 쓰러져서 포켓몬센터로 이동합니다.");
		pause();
		System.out.println("==================================");
		System.out.println("    포켓몬센터에 오신것을 환영합니다!!     ");
		System.out.println("==================================");
		System.out.println("포켓몬을 회복시킵니다.....");
	    Fuction.sleep(3000);
		System.out.println("회복완료!!");
		Fuction.sleep(1000);
		mypok.hp = mypok.hp_max;
	}
	
	public static void view_challenge(String name_town)
	{
		System.out.println(name_town+" 체육관에 도전합니다....");
		pause();
	}
	
	public static void view_moveTown()
	{
		for (int i = 0; i <8; i++) 
		{
		   System.out.println(i+1 +". "+name_town[i]+"로 이동");	
		}
	}
	
	public static void view_playerInfo(Player player) {
		System.out.println("플레이어 정보를 확인합니다.");
        System.out.println("플레이어 이름: " + player.getName());
        System.out.println("레벨: " + player.getLevel());
        System.out.println("경험치: " + player.getExp());
    }
	
	public static void error()
	{System.out.println("잘못입력하셨습니다.");}
	
	public static void pause() 
	{try { System.in.read();} catch(IOException e) {}}

}
