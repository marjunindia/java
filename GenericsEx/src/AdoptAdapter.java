

/**
 * Created by arjun27 on 11/26/2017.
 */

public class AdoptAdapter<T extends  Animal & Adoptable> {

    private String description;

   //private Cat t;

   // private Animal n;

    private  T t;

    public AdoptAdapter(String description) {
        this.description = description;
    }


    public void set(T t){
        this.t=t;
        updateView();
    }

    private void updateView() {

        description="dasdasds";

    }


}
