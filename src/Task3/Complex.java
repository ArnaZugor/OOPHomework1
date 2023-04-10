package Task3;

public class Complex {
    private int realPart;
    private int imaginaryPart;

    public Complex() {
        this(0,0);

    }

    public Complex(final int realPart, final int imaginaryPart) {
        this.realPart=realPart;
        this.imaginaryPart=imaginaryPart;
    }

    public int getRealPart() {
        return this.realPart;
    }
    public int getImaginaryPart() {
        return this.imaginaryPart;
    }
    public void setRealPart(int realPart) {
        this.realPart = realPart;
    }
    public void setImaginaryPart(int imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    public int Re() {
        return this.realPart;
    }
    public int Im() {
        return this.imaginaryPart;
    }

    public Complex complexAddition(Complex z1) {
        return new Complex(this.realPart + z1.realPart, this.imaginaryPart + z1.imaginaryPart);
    }

    public Complex complexSubtraction(Complex z1) {
        return new Complex(this.realPart - z1.realPart, this.imaginaryPart - z1.imaginaryPart);
    }
    public void printComplex() {
        if(this.realPart !=0 && this.imaginaryPart ==0) {
            System.out.println((this.realPart));
        } else if (this.realPart ==0 && this.imaginaryPart !=0) {
            System.out.println(this.imaginaryPart+ "i");
        } else if (this.realPart ==0 && this.imaginaryPart ==0) {
            System.out.println("0");
        } else if (this.realPart !=0 && this.imaginaryPart !=0) {
            System.out.println(this.realPart+" + "+this.imaginaryPart+"i");
        }
    }
}
