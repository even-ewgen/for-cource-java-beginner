package inheritance.testextends;

import inheritance.testextends.animals.Animal;
import inheritance.testextends.animals.Bee;
import inheritance.testextends.animals.Bird;
import inheritance.testextends.animals.Cat;

public class Main {

    public static void main(String[] arg) {
        Animal[] animals = {new Cat(), new Bee(), new Bird()};
        for (Animal animal : animals) {
            animal.talk();
            System.out.println(animal.getFlying());
        }
    }
}
