package org.example.immutable;

public class Ratio {

    protected int numerator;
    protected int denominator;
    public static final Ratio ZERO = new Ratio();
    private Ratio() {
        this(0, 1);
    }

    public Ratio(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this){
            return true;
        }else if(!(obj instanceof Ratio)){
            return false;
        }
        Ratio that = (Ratio) obj;
        return(this.numerator*that.denominator == that.numerator*this.denominator);
    }

    @Override
    public String toString() {
        return "Ratio{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }

    public double value(){
        return (double) numerator/denominator;
    }
}
