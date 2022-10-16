public class MyComplex {
    private double real;
    private double imag;

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return this.real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return this.imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public String toString() {
        return "(" + this.real + " + " + this.imag + ")";
    }

    public boolean isReal() {
        return (imag == 0 && real != 0); //checks to see whether there is an imaginary number, returns true of not
    }

    public boolean isImaginary() {
        return (imag != 0 && real == 0); //checks to see whether there is an imaginary number, returns true if there is
    }

    public boolean equals(double real, double imag) {
        return (this.getReal() == real && this.getImag() == imag); //sees whether the complex numbers are equal by comparing both real and imag, returns true if both are equal, compares to ints in argument
    }

    public boolean equals(MyComplex another) {
        return this.equals(another.getReal(), another.getImag()); //calls equals(double, double), inserting the other complex numbers values as the argument
    }

    public double magnitude() {
        return Math.sqrt(Math.pow(this.getReal(), 2) + Math.pow(this.getImag(), 2)); //finds the magnitude with the pythagorean theorem (explained in MyComplexTest)
    }

    public double argumentInRadians() {
        return Math.atan2(this.getImag(), this.getReal()); //finds the argument with the tangent (explained in MyComplexTest), in radians
    }

    public int argumentInDegrees() {
        return (int)(this.argumentInRadians()*180/Math.PI); //finds the argument with the tanger (explained in MyComplexTest), in degrees by converting argumentInRadians() to degrees
    }

    public MyComplex conjugate() {
        return new MyComplex(real, -imag); //finds the conjugate, which is the same complex number with the imaginary number reversed
    }

    public MyComplex add(MyComplex another) {
        return new MyComplex(this.real + another.real, this.imag + another.imag); //adds the complex numbers (explained in MyComplexTest)
    }

    public MyComplex subtract(MyComplex another) {
        return new MyComplex(this.real - another.real, this.imag - another.imag); //subtracts the complex numbers (explained in MyComplexTest)
    }

    public MyComplex multiplyWith(MyComplex another) {
        this.setReal(this.real * another.real - this.imag * another.imag); //multiplies the complex numbers (explained in MyComplexTest)
        this.setImag(this.real * another.imag + this.imag * another.real);
        return this;
    }

    public MyComplex divideBy(MyComplex another) {
        double anotherSq = Math.pow(another.getReal(), 2) + Math.pow(another.getImag(), 2); //divides the complex numbers (explained in MyComplexTest)
        this.setReal(this.multiplyWith(another).getReal() / anotherSq);
        this.setImag(this.multiplyWith(another).getImag() / anotherSq);
        return this;
    }
}