import Coat.Coat;
import Shoes.Shoes;
import Trousers.Trousers;

public class Human implements IHuman {
    private String name;
    private Coat coat;
    private Shoes shoes;
    private Trousers trousers;

    public Human(String name, Coat coat, Shoes shoes, Trousers trousers) {
        this.name = name;
        this.coat = coat;
        this.shoes = shoes;
        this.trousers = trousers;
    }

    public Human() {
    }

    @Override
    public void action() {
        coat.takeOff();
        coat.putOn();
        shoes.takeOff();
        shoes.putOn();
        trousers.takeOff();
        trousers.putOn();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Coat getCoat() {
        return coat;
    }

    public void setCoat(Coat coat) {
        this.coat = coat;
    }

    public Shoes getShoes() {
        return shoes;
    }

    public void setShoes(Shoes shoes) {
        this.shoes = shoes;
    }

    public Trousers getTrousers() {
        return trousers;
    }

    public void setTrousers(Trousers trousers) {
        this.trousers = trousers;
    }
}