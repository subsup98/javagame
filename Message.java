package pokemongame_;

import java.io.IOException;
import java.util.Scanner;

public class Message 
{   static String name_player;
	static int choice;
	public static void obacsa()
	{   Scanner sc = new Scanner(System.in);
		System.out.print("???: 반갑다!  (엔터를 누르시면 진행됩니다.)");
		pause();
		System.out.print("포켓몬스터의 세계에 잘왔단다.");
		pause();pause();
		System.out.println("나의 이름은 오박사");
		System.out.print("모두에게 포켓몬 박사라고 존경받고 있단다.");
		pause();pause();
		System.out.print("포켓몬스터..............포켓몬");
		pause();pause();
		System.out.println("이세계에는 포켓몬스터라고 불려지는");
		System.out.print("생명체들이 도처에 살고있다!");
		pause();pause();
		System.out.print("사람은 포켓몬들과 정답게 지내거나");
		pause();pause();
		System.out.print("함께 싸우거나........");
		pause();pause();
		System.out.print("서로 도와가며 살아가고 있단다.");
		pause();pause();
		System.out.print("하지만 우리들은 포켓몬 전부를 알고 있지는 못하다.");
		pause();pause();
		System.out.print("포켓몬의 비밀은 아직도 잔뜩있다!");
		pause();pause();
		System.out.print("나는 그것을 밝혀내기 위하여");
		pause();pause();
		System.out.print("매일 포켓몬 연구를 계속하고 있다는 말이다!");
		pause();pause();
		System.out.print("그럼.........");
		pause();pause();
		System.out.print("슬슬 너의 이름을 가르쳐다오");
		pause();pause();
		System.out.println("=========================================");
		System.out.println("나의 이름은?(커서를 이곳 아래로 이동하여 입력해주세요)");
		name_player = sc.next();
		System.out.println(name_player+"!!!!");
		System.out.print("준비는 되었는가?");
		pause();
		System.out.print("드디어 이제부터 너의 이야기가 시작되어진다");
		pause();pause();
		System.out.println("즐거운 것도 괴로운 것도");
		System.out.print("잔뜩 너를 기다리고 있을것이다!!!");
		pause();pause();
		System.out.println("꿈과 모험과!");
		System.out.print("포켓몬스터의 세계에!!!");
		pause();pause();
		System.out.println("렛츠 고!!!!!!");
		pause();pause();
		for(int i=0;i<15;i++)
		{System.out.println("=============================================");}
	
	}
	public static void tutorial()
    {   Scanner sc = new Scanner(System.in);
    	System.out.println("태초마을에 오신것을 환영합니다.");
    	
    	
    	while(true) 
    	{
    	System.out.println("튜토리얼을 진행하시겠습니까?");
    	System.out.println("1.네       2.아니오");
    	int ch = Fuction.getChoice();
    	if(ch ==1) {
    	System.out.println("포켓몬스터 세상에서는 다양한 모험의 나래를 펼칠수있습니다.");
    	System.out.println("당신의 포켓몬과 상대포켓몬이 결투를 벌이고");
    	System.out.print("이에 승리하면 당신의 포켓몬은 경험치를얻고 성장합니다!");
    	pause();pause();
    	System.out.println("경험치가 올라가면 레벨업을 하게되며");
    	System.out.print("당신의 포켓몬은 강해지고,다양한 기술을 습득할 수 있습니다.");
    	pause();pause();
    	System.out.println("당신의 포켓몬이 일정레벨에 도달하면 '진화'라는것을 하게되는데");
    	System.out.print("당신의 포켓몬이 더욱 더 강해집니다.");
    	pause();pause();
    	System.out.println("결투를 벌이다가 상대포켓몬에게 패배할 경우 ");
    	System.out.print("당신의 포켓몬은 경험치를 잃게됩니다.");
    	pause();pause();
    	System.out.println("패배하지 않기 위해 포켓몬센터에가서");
    	System.out.print("포켓몬의 체력을 회복시킬 수 있습니다.");
    	pause();pause();
    	System.out.println("행운을 빕니다!!!!! ");
    	pause();pause();break;}
    	if(ch == 2) break;
    	else System.out.println("올바른 숫자를 입력해주세요");
    	}
    }
	public static void startingpok()
	{Scanner sc = new Scanner(System.in);
	System.out.println("★☆★☆★☆★☆따르르르르릉따르르르르릉★☆★☆★☆★☆");
	System.out.print("오박사님에게 전화가 왔다!!");
	pause();pause();
	System.out.println("오박사: "+name_player+"!!!");
	System.out.print("지금 내 연구실로 와줄 수 있겠나?");
	pause();pause();
		while(true) 
		{
		System.out.println("1.네       2.아니오");
	    int ch = Fuction.getChoice(); 
		if(ch ==1)	 
		{  System.out.print("어서오게 "+name_player+"!!");
		   pause();pause();
		   System.out.println("모험을 시작하려면 함께 할 포켓몬이 있어야하지 않겠나?");
		   System.out.print("내가 여기 3마리의 포켓몬을 준비했으니 골라보게!!");
		   pause();pause();
		   while(true)
		   {
		   System.out.println("1.이상해씨   2.파이리   3.꼬부기");
		   System.out.println("포켓몬을 선택해주세요");
		   choice = Fuction.getChoice();
		   if(choice==1)
			 {System.out.println("이상해씨로 하시겠습니까?");
		   	  System.out.println("1.네       2.아니오");
		   	  int choice = Fuction.getChoice(); 
			  if(choice ==1) 
			  {System.out.println("이상해씨가 선택되었습니다.");	
			  System.out.println("이상!!이상!!!이상해!!");
			  pause();pause();
			  break;}
			  else if(choice!=1&&choice!=2) 
			  {System.out.println("올바른 숫자를 입력해주세요");}  
			 }
		      
		   else if(choice==2)
			 {System.out.println("파이리로 하시겠습니까?");
		   	  System.out.println("1.네       2.아니오");
		   	  int choice = Fuction.getChoice(); 
			  if(choice ==1) 
			   {System.out.println("파이리가 선택되었습니다.");
			   System.out.println("파이리ㅣ리릴리ㅣ파파파이ㅣ리리ㅣ");
			   pause();pause();
			   break;}
			  else if(choice!=1&&choice!=2) 
			   {System.out.println("올바른 숫자를 입력해주세요");}
			  }
		   else if(choice==3)
			 {System.out.println("꼬부기로 하시겠습니까?");
		      System.out.println("1.네       2.아니오");
		      int choice = Fuction.getChoice(); 
			  if(choice ==1) 
			   {System.out.println("꼬부기가 선택되었습니다.");
			   System.out.println("꼬고ㅓ고곡댁꼬고고고고고");
			   pause();pause();
			   break;}
			  else if(choice!=1&&choice!=2) 
			   {System.out.println("올바른 숫자를 입력해주세요");}
			  }
		   else System.out.println("올바른 숫자를 입력해주세요");
		   }
		   System.out.println("오박사: 그럼 즐거운 여행 되게나!!!");
		   pause();pause();
		   break;
		}
		if(ch == 2) 
		{System.out.println("거절 할 수없다!!!!!");}
		else System.out.println("올바른 숫자를 입력해주세요");	  
		}
	    
	}
	public static void title() 
	{   
		  System.out.println("\r\n" + 
		  		"______  _____  _   __ _____ ___  ___ _____  _   _ \r\n" + 
		  		"| ___ \\|  _  || | / /|  ___||  \\/  ||  _  || \\ | |\r\n" + 
		  		"| |_/ /| | | || |/ / | |__  | .  . || | | ||  \\| |\r\n" + 
		  		"|  __/ | | | ||    \\ |  __| | |\\/| || | | || . ` |\r\n" + 
		  		"| |    \\ \\_/ /| |\\  \\| |___ | |  | |\\ \\_/ /| |\\  |\r\n" + 
		  		"\\_|     \\___/ \\_| \\_/\\____/ \\_|  |_/ \\___/ \\_| \\_/\r\n" + 
		  		"                                                  \r\n" + 
		  		"                                                  \r\n" + 
		  		"");
	}
	public static Pokemon[] start()
	{
		Pokemon temp = null;
		Pokemon temp2 = null;
		Pokemon[] pokemons2 =null;
		Pokemon[] pokemons = new Pokemon[3];
		System.out.println("1. 새 게임        2.  불러오기");
		int ch = Fuction.getChoice(2);
		while(true) {
			if(ch==1) 
			{   Message.obacsa();
				Message.startingpok();
				temp = new Pokemon(Message.choice,5);
				pokemons[0]=temp;
				temp2 = new Pokemon(Message.choice,1);
				pokemons[1]=temp2;
				break;
			}
			else if (ch==2) pokemons2 = new Load().load();  break;
		}
		if(Load.error_load==1) 
		{
			Message.obacsa();
			Message.startingpok();
			temp = new Pokemon(Message.choice,5);
	
			Load.error_load = 0;
		}
		
		new Load().load_badge();
		if(Load.error_load==1) {
			View.badge = 0;
			Load.error_load = 0;
		}
		
		return pokemons;
			
	}
	
	public static void pause() 
	{try { System.in.read();} catch(IOException e) {}}
}
