
public class MainTest {


    static AdoptAdapter catAdapter;

    static AdoptAdapter dogAdapter;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		catAdapter= new AdoptAdapter<Cat>("cat adapter");
	     catAdapter.set(Adoptdata.cats.get(0));


	     dogAdapter= new AdoptAdapter<Dog>("Dog adapter");
	     dogAdapter.set(Adoptdata.dogs.get(0));
	}

}
