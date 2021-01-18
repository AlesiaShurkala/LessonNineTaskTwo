package Trousers;

public class ShortTrousers  implements Trousers {
    @Override
    public void putOn() {
        System.out.println("Надеваю короткие штаны!");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимаю короткие штаны!");
    }
}
