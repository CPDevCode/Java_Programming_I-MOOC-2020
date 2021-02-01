
public class Main {

    public static void main(String[] args) {


        // use this main method to try out your classes!
        Gift gift1 = new Gift("Cats", 4);
        Gift gift2 = new Gift("Dogs", 5);
        Package test = new Package();
        test.addGift(gift1);
        test.addGift(gift2);
        System.out.println(test.totalWeight());

    }
}
