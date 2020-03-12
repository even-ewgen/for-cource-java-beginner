package inheritance.testextends.animals;

import inheritance.testextends.utilites.Flying;

public class Cat extends Animal {

    {
        new Animal();
        flying = Flying.NOTFLYING;
        voice = "meow";
    }

    @Override
    public void talk() {
        System.out.println(voice);
    }
}