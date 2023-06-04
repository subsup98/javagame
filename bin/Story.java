public class Story{
	
   public static void town_main(String name_town,Pokemon mypok){
	   //Bgm town = new Bgm("src/bgm/town.mp3");
	while(true){
	   //town.play();
   	   View.view_town(View.name_town[View.mytown]);
	   int ch = Fuction.getChoice();
	   switch(ch){ 
	     case 1 : 
		 View.view_dungeon(1+View.mytown*10); 
		 dungeon(mypok);
		 break;
	   	 case 2 : 
	   	 View.view_mypok(mypok); break;
	   	 case 3 :
	   	 //town.close();
	   	 View.view_pokemonCenter(mypok); break;
	   	 case 4 :
	   	 //town.close();
	   	 View.view_challenge(name_town);
	   	 challenge(mypok);
	   	 break;
	   	 case 5 : 
	   	 while(true) {
	   	 View.view_moveTown();
	   	 int temp = Fuction.getChoice(8)-1;
	   	 if(temp<=View.badge) {View.mytown=temp;break;} 
	   	 else {System.out.println("ÀÌÀü¸¶À»ÀÇ ¹îÁö¸¦ È¹µæÇØÁÖ¼¼¿ä"); break;}
	   	 }
	   	 break;
	   	 case 6  : new Save().save(mypok); new Save().save_badge(View.badge);  break;
	   	 case 7  : 
	   	 Pokemon temp = mypok;
	   	 mypok = new Load().load(); 
	   	 if(Load.error_load==1) {mypok = temp; Load.error_load=0;}
	   	 new Load().load_badge();
	   	 if(Load.error_load==1) {View.badge=0; Load.error_load=0;}
	   	 break;
	   	 
	   	 default : View.error(); break;
	   }//switch
	   //town.close();
	 }//while 
   }//selet_town
   
   public static void dungeon(Pokemon mypok) 
   {   int ch = Fuction.getChoice(9);
	   FightingSystem f= new FightingSystem();
	   //bgm.close();
	   f.Fight(mypok, Pok_arr.pok_arr[View.mytown][ch-1]);
   }
   
   public static void challenge(Pokemon mypok)
   {   FightingSystem f= new FightingSystem();
	   f.Fight_challenge(mypok, Pok_arr.pok_arr[View.mytown][9]);   
   }
   
   
}//class
