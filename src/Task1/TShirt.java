package Task1;

public class TShirt {

    private String color;
    private int size;
    private double price;

    public TShirt(final String color, final int size) {
        this(color, size, 10.00);
    }

    public TShirt(final String color, final int size, final double price){
        this.color=color;
        this.size=size;
        this.price=price;
    }

    public String getColor() {
        return this.color;
    }
    public int getSize() {
        return this.size;
    }
    public double getPrice() {
        return this.price;
    }

    public void setColor(final String color) {
        this.color = color;
    }
    public void setSize(final int size) {
        this.size = size;
    }
    public void setPrice(final double price) {
        this.price = price;
    }

    public void increasedPrice(double value) {
        this.price+=value;
    }
    public void discountPrice(double value) {
        this.price-=value;
    }

    public void printTShirt() {
        System.out.println("The T-shirt is "+this.color+" in size "+this.size+" and it's current price is "+this.price+" KM");
    }
}
