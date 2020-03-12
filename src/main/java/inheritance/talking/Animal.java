package inheritance.talking;

public class Animal {

    public void talk() {
        System.out.println("Unknov!");
    };
}

class Bee extends Animal{

    @Override
    public void talk() {
        System.out.println("bzzzz");
    }
}

class Cat extends Animal{

    @Override
    public void talk() {
        System.out.println("meow");
    }
}

class Dog extends Animal{

    @Override
    public void talk() {
        System.out.println("woof-woof");
    }
}

class Sheep extends Animal{

    @Override
    public void talk() {
        System.out.println("baaah");
    }
}
