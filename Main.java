

package pokemongame_;


public class Main 
{

	public static void main(String[] args) 
	{   

		Message.title();
		Pokemon[] mypok = Message.start();
		Player player = new Player("playername");
		//intro.close();
		Story.town_main(View.name_town[View.mytown], mypok, player);
		
	}

}





