import java.io.IOException;
import java.util.Scanner;

public class Message 
{   static String name_player;
	static int choice;
	public static void obacsa()
	{   Scanner sc = new Scanner(System.in);
		System.out.print("???: �ݰ���!  (���͸� �����ø� ����˴ϴ�.)");
		pause();
		System.out.print("���ϸ����� ���迡 �߿Դܴ�.");
		pause();pause();
		System.out.println("���� �̸��� ���ڻ�");
		System.out.print("��ο��� ���ϸ� �ڻ��� ����ް� �ִܴ�.");
		pause();pause();
		System.out.print("���ϸ���..............���ϸ�");
		pause();pause();
		System.out.println("�̼��迡�� ���ϸ��Ͷ�� �ҷ�����");
		System.out.print("����ü���� ��ó�� ����ִ�!");
		pause();pause();
		System.out.print("����� ���ϸ��� ����� �����ų�");
		pause();pause();
		System.out.print("�Բ� �ο�ų�........");
		pause();pause();
		System.out.print("���� ���Ͱ��� ��ư��� �ִܴ�.");
		pause();pause();
		System.out.print("������ �츮���� ���ϸ� ���θ� �˰� ������ ���ϴ�.");
		pause();pause();
		System.out.print("���ϸ��� ����� ������ �ܶ��ִ�!");
		pause();pause();
		System.out.print("���� �װ��� �������� ���Ͽ�");
		pause();pause();
		System.out.print("���� ���ϸ� ������ ����ϰ� �ִٴ� ���̴�!");
		pause();pause();
		System.out.print("�׷�.........");
		pause();pause();
		System.out.print("���� ���� �̸��� �����Ĵٿ�");
		pause();pause();
		System.out.println("=========================================");
		System.out.println("���� �̸���?(Ŀ���� �̰� �Ʒ��� �̵��Ͽ� �Է����ּ���)");
		name_player = sc.next();
		System.out.println(name_player+"!!!!");
		System.out.print("�غ�� �Ǿ��°�?");
		pause();
		System.out.print("���� �������� ���� �̾߱Ⱑ ���۵Ǿ�����");
		pause();pause();
		System.out.println("��ſ� �͵� ���ο� �͵�");
		System.out.print("�ܶ� �ʸ� ��ٸ��� �������̴�!!!");
		pause();pause();
		System.out.println("�ް� �����!");
		System.out.print("���ϸ����� ���迡!!!");
		pause();pause();
		System.out.println("���� ��!!!!!!");
		pause();pause();
		for(int i=0;i<15;i++)
		{System.out.println("=============================================");}
	
	}
	public static void tutorial()
    {   Scanner sc = new Scanner(System.in);
    	System.out.println("���ʸ����� ���Ű��� ȯ���մϴ�.");
    	
    	
    	while(true) 
    	{
    	System.out.println("Ʃ�丮���� �����Ͻðڽ��ϱ�?");
    	System.out.println("1.��       2.�ƴϿ�");
    	int ch = Fuction.getChoice();
    	if(ch ==1) {
    	System.out.println("���ϸ��� ���󿡼��� �پ��� ������ ������ ��ĥ���ֽ��ϴ�.");
    	System.out.println("����� ���ϸ�� ������ϸ��� ������ ���̰�");
    	System.out.print("�̿� �¸��ϸ� ����� ���ϸ��� ����ġ����� �����մϴ�!");
    	pause();pause();
    	System.out.println("����ġ�� �ö󰡸� �������� �ϰԵǸ�");
    	System.out.print("����� ���ϸ��� ��������,�پ��� ����� ������ �� �ֽ��ϴ�.");
    	pause();pause();
    	System.out.println("����� ���ϸ��� ���������� �����ϸ� '��ȭ'��°��� �ϰԵǴµ�");
    	System.out.print("����� ���ϸ��� ���� �� �������ϴ�.");
    	pause();pause();
    	System.out.println("������ ���̴ٰ� ������ϸ󿡰� �й��� ��� ");
    	System.out.print("����� ���ϸ��� ����ġ�� �ҰԵ˴ϴ�.");
    	pause();pause();
    	System.out.println("�й����� �ʱ� ���� ���ϸ��Ϳ�����");
    	System.out.print("���ϸ��� ü���� ȸ����ų �� �ֽ��ϴ�.");
    	pause();pause();
    	System.out.println("����� ���ϴ�!!!!! ");
    	pause();pause();break;}
    	if(ch == 2) break;
    	else System.out.println("�ùٸ� ���ڸ� �Է����ּ���");
    	}
    }
	public static void startingpok()
	{Scanner sc = new Scanner(System.in);
	System.out.println("�ڡ١ڡ١ڡ١ڡٵ������������������������ڡ١ڡ١ڡ١ڡ�");
	System.out.print("���ڻ�Կ��� ��ȭ�� �Դ�!!");
	pause();pause();
	System.out.println("���ڻ�: "+name_player+"!!!");
	System.out.print("���� �� �����Ƿ� ���� �� �ְڳ�?");
	pause();pause();
		while(true) 
		{
		System.out.println("1.��       2.�ƴϿ�");
	    int ch = Fuction.getChoice(); 
		if(ch ==1)	 
		{  System.out.print("����� "+name_player+"!!");
		   pause();pause();
		   System.out.println("������ �����Ϸ��� �Բ� �� ���ϸ��� �־������ �ʰڳ�?");
		   System.out.print("���� ���� 3������ ���ϸ��� �غ������� ��󺸰�!!");
		   pause();pause();
		   while(true)
		   {
		   System.out.println("1.�̻��ؾ�   2.���̸�   3.���α�");
		   System.out.println("���ϸ��� �������ּ���");
		   choice = Fuction.getChoice();
		   if(choice==1)
			 {System.out.println("�̻��ؾ��� �Ͻðڽ��ϱ�?");
		   	  System.out.println("1.��       2.�ƴϿ�");
		   	  int choice = Fuction.getChoice(); 
			  if(choice ==1) 
			  {System.out.println("�̻��ؾ��� ���õǾ����ϴ�.");	
			  System.out.println("�̻�!!�̻�!!!�̻���!!");
			  pause();pause();
			  break;}
			  else if(choice!=1&&choice!=2) 
			  {System.out.println("�ùٸ� ���ڸ� �Է����ּ���");}  
			 }
		      
		   else if(choice==2)
			 {System.out.println("���̸��� �Ͻðڽ��ϱ�?");
		   	  System.out.println("1.��       2.�ƴϿ�");
		   	  int choice = Fuction.getChoice(); 
			  if(choice ==1) 
			   {System.out.println("���̸��� ���õǾ����ϴ�.");
			   System.out.println("���̸��Ӹ��������������̤Ӹ�����");
			   pause();pause();
			   break;}
			  else if(choice!=1&&choice!=2) 
			   {System.out.println("�ùٸ� ���ڸ� �Է����ּ���");}
			  }
		   else if(choice==3)
			 {System.out.println("���α�� �Ͻðڽ��ϱ�?");
		      System.out.println("1.��       2.�ƴϿ�");
		      int choice = Fuction.getChoice(); 
			  if(choice ==1) 
			   {System.out.println("���αⰡ ���õǾ����ϴ�.");
			   System.out.println("����ð��첿������");
			   pause();pause();
			   break;}
			  else if(choice!=1&&choice!=2) 
			   {System.out.println("�ùٸ� ���ڸ� �Է����ּ���");}
			  }
		   else System.out.println("�ùٸ� ���ڸ� �Է����ּ���");
		   }
		   System.out.println("���ڻ�: �׷� ��ſ� ���� �ǰԳ�!!!");
		   pause();pause();
		   break;
		}
		if(ch == 2) 
		{System.out.println("���� �� ������!!!!!");}
		else System.out.println("�ùٸ� ���ڸ� �Է����ּ���");	  
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
		System.out.println("1. �� ����        2.  �ҷ�����");
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