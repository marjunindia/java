import java.util.ArrayList;

public class ComedianBot extends JokeBot{

	public ComedianBot(String name) {
		super(null);
		setName(name);
		jokeiknow=JokeWriter.getJokeList();
		
	}
	
	public void performshow(){
		
		talk("Good evening"+getName());
		talk("why dont I tell  you some joke");
		
		for (Joke joke : jokeiknow) {
			sayjoke(joke);
		}

	}
	
	@Override
	protected void sayjoke(Joke joke) {
		//super.sayjoke(joke);
		talk(joke.getJokesetup()+"......"+joke.getJokepunchline());
	}

}