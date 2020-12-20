package animals;

import foods.Vegetation;

public class Gnu {
    String name;
    int age;

    public Gnu(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void voice() {
        System.out.println( name + " молчит и жуёт траву" );
    }

    public void run() {
        System.out.println( "Стоит как вкопанная" );
    }

    public void eatLeaves (Vegetation food) {
        System.out.println( "Ммм какая вкусная " + food.productNameTwo );
    }
}
