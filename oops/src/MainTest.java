import java.util.ArrayList;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Joke> jokes=JokeWriter.getJokeList();
		JokeBot jokeBot=new JokeBot(jokes);
		jokeBot.telljoke();
		//jokeBot.jokeiknow=JokeWriter.getJokeList();
		
		ComedianBot comedianBot=new ComedianBot("asa");
		comedianBot.performshow();
		
		
	}

}