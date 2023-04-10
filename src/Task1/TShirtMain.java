package Task1;

public class TShirtMain {
    public static void main(String[] args) {
        final TShirt tShirt = new TShirt("purple", 4, 24.55);
        final TShirt tShirt1 = new TShirt("green", 2);

        tShirt.printTShirt();
        tShirt1.printTShirt();

        tShirt.discountPrice(5.05);
        tShirt.discountPrice(5);
        tShirt.printTShirt();

        tShirt1.increasedPrice(25.34);
        tShirt1.printTShirt();

        tShirt1.setSize(6);
        tShirt1.setColor("yellow");
        tShirt1.setPrice(12.35);
        tShirt1.printTShirt();
    }
}
