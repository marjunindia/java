

/**
 * Created by arjun27 on 11/26/2017.
 */

public class Cat  implements Animal,Adoptable{

    String name;
    String age;
    String dob;
    String years;

    public Cat(String name, String age, String dob, String years) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.years = years;
    }

    @Override
    public void getrating() {

    }

    @Override
    public String getNumber() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getImageName() {
        return null;
    }

    @Override
    public String getDescription() {
        return null;
    }

  
}
