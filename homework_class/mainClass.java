package homework_class;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 09-Feb-17.
 */
public class mainClass {
    public static void main(String[] args) {


        // moodustame objektid
        City tallinn = new City("Tallinn", 159.2f, 443623);
        City moscow = new City("Moscow", 2511f, 11920000);
        City newyork = new City("New York", 1214f, 8550405);

        // näitan kuidas töötab toString()
        System.out.println(tallinn);

        // arvuan population density tallinna kohta
        System.out.println("Population denstity is " + tallinn.populationDenstity() + " per km2\n\n");

        // moodustame listi
        List<City> list = new ArrayList<City>();

        // lisame meie linnad listisse
        list.add(tallinn);
        list.add(moscow);
        list.add(newyork);

        // printime välja info linna kohta
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // suurem linn
        System.out.println("\nThe biggest city is " + City.biggestCity(list).name);
    }
}
