import java.util.ArrayList;

public class JokeWriter {
	
	public static ArrayList<Joke> getJokeList(){
		
		ArrayList<Joke> jokelist=new ArrayList<Joke>();
		jokelist.add(new Joke("joke1", "vadivel"));
		jokelist.add(new Joke("joke2", "gowndamany"));
		return jokelist;
	}

}
