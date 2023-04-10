package Task3;

public class ComplexMain {
    public static void main (String[] args) {
        final Complex z = new Complex(7, 1);

        System.out.println(z.Re());
        System.out.println(z.Im());

        final Complex z1 = new Complex(5, -2);

        final Complex z2 = z.complexAddition(z1);
        z2.printComplex();

        final Complex z3 = z.complexSubtraction(z1);
        z3.printComplex();
    }

}
