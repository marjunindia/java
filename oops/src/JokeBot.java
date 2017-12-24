import java.util.ArrayList;

public class JokeBot extends Bot {
	
	public static ArrayList<Joke> jokeiknow;


	public JokeBot(ArrayList<Joke> jokeiknow) {
		this.jokeiknow = jokeiknow;
	}

	
	
	public  void  telljoke(){
		Double randam=new Double(Math.random()*jokeiknow.size());
		int randomnum=randam.intValue();
		Joke myjoke=jokeiknow.get(randomnum);
		sayjoke(myjoke);
	}
	
	
	protected void sayjoke(Joke joke){
		talk(joke.getJokesetup());
		talk(joke.getJokepunchline());
	}
	
	
	
}
