package homework_class;

import java.util.List;

/**
 * Created by User on 09-Feb-17.
 */
public class City {

    String name;
    float area;
    int population;

    public City(String name, float area, int population) {
        if (area <= 0 || population <= 0) {
            throw new RuntimeException("Incorrect values");
        }
        this.name = name;
        this.area = area;
        this.population = population;
    }

    public float populationDenstity() {
        return population / area;
    }

    public static City biggestCity(List<City> list) {

        City biggest = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).area > biggest.area) {
                biggest = list.get(i);
            }
        }

        return biggest;
    }

    @Override
    public String toString() {
        return name + " occupies an area of " + area + " km2 , and has a population of " + population;
    }

}
