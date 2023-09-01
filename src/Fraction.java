public class Fraction {
    private int num;
    private int den;


    public Fraction(int num , int den){
        this.den = den;
        this.num = num;
    }

    @Override
    public boolean equals(Object obj) {
        Fraction other = (Fraction) obj;
        boolean frn = this.num == other.num && this.den == other.den;

        return frn;
    }

    @Override
    public int hashCode() {
        return num*1000+den;
    }
}