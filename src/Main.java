public class Main {
    public static void main(String[] args) {

        Fraction f1 = new Fraction( 4 , 5);
        Fraction f2 = new Fraction(5 , 5);

        System.out.println(f1.equals(f2));

        System.out.println(f1 == f2);
        System.out.println("F1 hashCode: "+f1.hashCode());
        System.out.println("F2 hashCode: "+f2.hashCode());


    }
}