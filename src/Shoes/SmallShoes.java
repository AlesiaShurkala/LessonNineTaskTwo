package Shoes;

public class SmallShoes implements Shoes {
    @Override
    public void putOn() {
        System.out.println("Надеваю маленькие ботинки!");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимаю маленькие ботинки!");
    }
}
