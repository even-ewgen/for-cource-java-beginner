package inheritance.talking;

public class Main {

    public static void main(String[] arg) {
        Animal[] animals = {new Bee(), new Cat(), new Dog(), new Sheep(), new Cat()};
        for (Animal animal : animals) {
            animal.talk();
        }
    }
}
