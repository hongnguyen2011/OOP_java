package themypolynominal;

public class MyComplex {
    private double real;
    private double imag;  // imaginary

    public MyComplex() {
        this.real = 0.0;
        this.imag = 0.0;
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append(this.real)
                .append(" + ")
                .append("i")
                .append(this.imag);
        return description.toString();
    }

    public boolean isReal() {
        if (Double.compare(this.imag, 0.0) == 0) {
            return true;
        }
        return false;
    }

    public boolean isImaginary() {
        if (Double.compare(this.real, 0.0) == 0) {
            return true;
        }
        return false;
    }

    public boolean equals(double real, double imag) {
        if ((Double.compare(this.real, real) == 0)
                && (Double.compare(this.imag, imag) == 0)) {
            return true;
        }

        return false;
    }

    public boolean equals(MyComplex another) {
        if ((Double.compare(this.real, another.real) == 0)
                && (Double.compare(this.imag, another.imag) == 0)) {
            return true;
        }

        return false;
    }

    public double magnitude() {
        return Math.sqrt(this.real * this.real + this.imag * this.imag);
    }

    public MyComplex addInto(MyComplex another) {
        this.real += another.real;
        this.imag += another.imag;
        return this;
    }

    public MyComplex addNew(MyComplex another) {
        MyComplex newComplex = new MyComplex();
        newComplex.real = this.real + another.real;
        newComplex.imag = this.imag + another.imag;
        return newComplex;
    }
}



