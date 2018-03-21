package Meal;

/**
 * Created by HP on 16.10.2017.
 */
public class Sandwich extends PortableLunch {

    public Bread b = new Bread();
    public Cheese c = new Cheese();
    public Lettuce l = new Lettuce();

    Sandwich() {
        super();
        System.out.println("sandwich");
    }
}
