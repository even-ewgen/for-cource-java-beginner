package inheritance.testextends.animals;

import inheritance.testextends.utilites.Flying;
import inheritance.testextends.utilites.Talked;

public class Animal implements Talked {
    protected Flying flying;
    protected String voice;
    protected static String home;

    static {
        home = "Earth";
    }

    public Animal() {

    }

    public Animal(Flying flying, String voice) {
        this.flying = flying;
        this.voice = voice;
    }

    public Flying getFlying() {
        return flying;
    }

    public void setFlying(Flying flying) {
        this.flying = flying;
    }

    public static String getHome() {
        return home;
    }

    public static void setHome(String home) {
        Animal.home = home;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    @Override
    public void talk() {
        System.out.println("Unknow!");
    }
}