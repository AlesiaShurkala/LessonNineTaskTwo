package Trousers;

public class LongTrousers implements Trousers {
    @Override
    public void putOn() {
        System.out.println("Надеваю длинные штаны!");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимаю длинные штаны!");
    }
}
