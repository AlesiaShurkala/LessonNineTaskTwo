package Coat;

public class LongCoat implements Coat {

    public LongCoat() {
    }

    @Override
    public void putOn() {
        System.out.println("Надеваю длинное пальто!");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимаю длинное пальто!");
    }
}
