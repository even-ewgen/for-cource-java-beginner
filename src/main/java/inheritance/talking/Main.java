package inheritance.talking;

public class Main {

    public static void main(String[] arg) {
        Animal[] animals = {new Bee(), new Cat(), new Dog(), new Sheep(), new Cat()};
        int counter = 0;
        for (Animal animal : animals) {
            if (animal instanceof Dog || animal instanceof Cat) {
                counter++;
            }
            animal.talk();
        }
        System.out.printf("Кошек и собак: %d\n", counter);
    }
}
