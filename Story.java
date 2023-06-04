
public class Story{
	
	   public static void town_main(String name_town, Pokemon[] pokemons,Player player){

		while(true){
		   //town.play();
	   	   View.view_town(View.name_town[View.mytown]);
		   int ch = Fuction.getChoice();
		   switch(ch){ 
		     case 1 : 
			 View.view_dungeon(1+View.mytown*10); 
			 dungeon(pokemons, player);
			 break;
		   	 case 2 : 
		   	 View.view_mypok(pokemons); break;
		   	 case 3 :
		   	 //town.close();
		   	 View.view_pokemonCenter(pokemons[0]); break;
		   	 case 4 :
		   	 //town.close();
		   	 View.view_challenge(name_town);
		   	 challenge(pokemons[0], player);
		   	 break;
		   	 case 5 : 
		   	 while(true) {
		   	 View.view_moveTown();
		   	 int temp = Fuction.getChoice(8)-1;
		   	 if(temp<=View.badge) {View.mytown=temp;break;} 
		   	 else {System.out.println("이전마을의 뱃지를 획득해주세요"); break;}
		   	 }
		   	 break;
		   	case 6:
		   	    View.view_playerInfo(player);
		   	    break;

		   	 case 7  : new Save().save(pokemons); new Save().save_badge(View.badge);  break;
		   	 case 8  : 
		   	 Pokemon[] temp = pokemons;
		   	 pokemons = new Load().load(); 
		   	 if(Load.error_load==1) {pokemons = temp; Load.error_load=0;}
		   	 new Load().load_badge();
		   	 if(Load.error_load==1) {View.badge=0; Load.error_load=0;}
		   	 break;
		   	 
		   	 default : View.error(); break;
		   }//switch
		   //town.close();
		 }//while 
	   }//selet_town
	   
	   public static void dungeon(Pokemon[] mypok, Player player) 
	   {   int ch = Fuction.getChoice(9);
	   System.out.println(Pok_arr.pok_arr[View.mytown][ch-1].name_pok+"을/를 만났다");
   	   System.out.println("할 행동을 선택해 주세요.");
   	   System.out.println("1. 싸운다");
   	   System.out.println("2. 잡는다");
   	   int ch2 = Fuction.getChoice(2);
   	   if (ch2 ==1) {
	   FightingSystem f= new FightingSystem();
   	   
	   //bgm.close();
	   f.Fight(mypok[0], Pok_arr.pok_arr[View.mytown][ch-1], player);}
   	   else {
   		FightingSystem z= new FightingSystem();
   		z.Catch(mypok, Pok_arr.pok_arr[View.mytown][ch-1]);
   	   }
   }
	   public static void challenge(Pokemon mypok, Player player)
	   {   FightingSystem f= new FightingSystem();
		   f.Fight_challenge(mypok, Pok_arr.pok_arr[View.mytown][9], player);   
	   }
	   
	}//class