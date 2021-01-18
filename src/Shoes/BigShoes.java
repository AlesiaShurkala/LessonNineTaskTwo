package Shoes;

public class BigShoes implements Shoes {
    @Override
    public void putOn() {
        System.out.println("Надеваю большие ботинки!");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимаю большие ботинки!");
    }
}
