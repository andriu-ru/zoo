package animals;

import foods.Food;
import foods.Meat;

public class Hyena {
    String name;
    int age;

    public Hyena(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void whines() {
        System.out.println( "Рррр!" );
    }

    public void run() {
        System.out.println( this.name + " медлено чапает на водопй!" );
    }


    public void eatForHyena(Food food) { System.out.println( "Ммм какое вкусное " + food.productNameTwo ); }
}
