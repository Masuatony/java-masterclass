package org.java.springsecurity.Area;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }
    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }
    public void add(ComplexNumber other) {
        add(other.real, other.imaginary);
    }

    public void subtract(ComplexNumber other) {
        subtract(other.real, other.imaginary);
    }

    public static void main(String[] args) {
        ComplexNumber complex1 = new ComplexNumber(1, 2);
        ComplexNumber complex2 = new ComplexNumber(3, 4);

        complex1.add(complex2);

        System.out.println("Real part: " + complex1.getReal());
        System.out.println("Imaginary part: " + complex1.getImaginary());
    }

}
