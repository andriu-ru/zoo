import animals.*;
import foods.Fish;
import foods.Meat;
import foods.Vegetation;

public class Main {
    public static void main(String[] args) {
        System.out.println("*Тестируем кота Ваську*");
        Cat catVaska = new Cat("Васька", 5);
        catVaska.eat(new Fish());

        System.out.println("");
        System.out.println("\n*Тестируем собаку Mухтара*");
        Dog muhtar = new Dog( "Мухтар", 3 );
        muhtar.run();
        muhtar.bark();
        muhtar.eat( new Meat());

        System.out.println("");
        System.out.println("\n*Тестируем жирафа Жору*");
        Giraffe giraffe = new Giraffe("Жора", 10);
        giraffe.run();
        giraffe.voice();
        giraffe.eatLeaves(new Vegetation());

        System.out.println("");
        Gnu gnu = new Gnu("Антилопа Гну", 13);
        gnu.voice();
        gnu.run();
        gnu.eatLeaves(new Vegetation());

        System.out.println("");
        Hyena hyena = new Hyena("Гиена", 8);
        hyena.run();
        hyena.whines();
        hyena.eatForHyena(new Meat());

        System.out.println("");
        System.out.println("\n*Тестируем льва Чандра*");
        Lion lion = new Lion("Чандр", 15);
        lion.run();
        lion.roar();
        lion.eatMeat(new Meat());

    }
}
