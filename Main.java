

public class Main 
{

	public static void main(String[] args) 
	{   
		//Bgm intro = new Bgm("src/bgm/intro.mp3");
		//intro.play();
		Message.title();
		Pokemon[] mypok = Message.start();
		//intro.close();
		Story.town_main(View.name_town[View.mytown], mypok);
		
	}


}



