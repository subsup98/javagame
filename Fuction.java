




import java.util.Scanner;

public class Fuction {

	
	public static int getChoice()
	{  Scanner sc = new Scanner(System.in);
	   while(true) 
	   {   int cnt=0;
		   String ch = sc.next();
		   for (int i = 0; i < ch.length(); i++) 
		   { if(!(ch.charAt(i)>=48&&ch.charAt(i)<=57))
		     cnt++;
		   }
		   if(cnt>0) 
		   {System.out.println("숫자를 입력해주세요");continue;}
		   return Integer.parseInt(ch);
	   }
	}
	public static int getChoice(int a)
	{  Scanner sc = new Scanner(System.in);
	   while(true) 
	   {   int cnt=0;
		   String ch = sc.next();
		   for (int i = 0; i < ch.length(); i++) 
		   { if(!(ch.charAt(i)>=49&&ch.charAt(i)<=57))
		     cnt++;
		   }
		   if(cnt>0) 
		   {System.out.println("올바른 숫자를 입력해주세요");continue;}
		   if(Math.abs(Integer.parseInt(ch))>a)
		   {System.out.println("범위내의 숫자를 입력해주세요");continue;}
		   return Integer.parseInt(ch);
	   }
	}
	public static void sleep(int ms) {
		try{
		    Thread.sleep(ms);
		}catch(InterruptedException e){
		    e.printStackTrace();
		}
	}
}