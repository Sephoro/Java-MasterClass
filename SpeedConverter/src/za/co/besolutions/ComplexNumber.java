package za.co.besolutions;

public class ComplexNumber {

    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(ComplexNumber A){
        this.imaginary += A.getImaginary();
        this.real += A.getReal();

    }

    public void add(double real, double imaginary){
        this.add(new ComplexNumber(real,imaginary));
    }

    public void subtract(ComplexNumber A){
        this.imaginary -= A.getImaginary();
        this.real -= A.getReal();

    }

    public void subtract(double real, double imaginary){
        this.subtract(new ComplexNumber(real,imaginary));
    }
}
