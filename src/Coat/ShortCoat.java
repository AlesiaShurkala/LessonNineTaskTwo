package Coat;

public class ShortCoat implements Coat {

    @Override
    public void putOn() {
        System.out.println("Надеваю короткое пальто!");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимаю короткое пальто!");
    }
}
