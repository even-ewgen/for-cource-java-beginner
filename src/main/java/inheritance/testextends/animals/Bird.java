package inheritance.testextends.animals;

import inheritance.testextends.utilites.Flying;

public class Bird extends Animal {

    {
        new Animal();
        flying = Flying.FLYING;
        voice = "chirick-chirick";
    }

    @Override
    public void talk() {
        System.out.println(voice);
    }

    public void fly() {
        System.out.println("Flying...");
    }
}
