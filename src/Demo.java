import Coat.LongCoat;
import Coat.ShortCoat;
import Shoes.BigShoes;
import Shoes.SmallShoes;
import Trousers.LongTrousers;
import Trousers.ShortTrousers;

public class Demo {
    public static void main(String[] args) {
        LongCoat longCoat=new LongCoat();
        ShortCoat shortCoat=new ShortCoat();
        BigShoes bigShoes=new BigShoes();
        SmallShoes smallShoes=new SmallShoes();
        LongTrousers longTrousers=new LongTrousers();
        ShortTrousers shortTrousers=new ShortTrousers();

        Human humanOne=new Human("Вася",longCoat,smallShoes, longTrousers);
        Human humanTwo=new Human("Женя",shortCoat,bigShoes, shortTrousers);

        humanOne.action();
        System.out.println("-----------------------------------");
        humanTwo.action();
    }
}
