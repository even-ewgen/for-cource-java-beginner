package inheritance.testextends.animals;

public class Bee extends Bird {

    {
        voice = "bzzzz";
    }

    @Override
    public void talk() {
        System.out.println(voice);
    }
}
