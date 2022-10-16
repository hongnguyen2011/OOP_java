package themypolynominal;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(int degree) {
        this.coeffs = new double[degree];
    }
    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return this.coeffs.length - 1;
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        for (int i = this.coeffs.length - 1; i >= 0; i--) {
            description.append(this.coeffs[i])
                    .append("x^")
                    .append(i)
                    .append(" + ");
        }
        description.delete(description.length() - 3, description.length());
        return description.toString();
    }

    public double evaluate(double x) {
        double polyValue = 0;
        for (int i = this.coeffs.length - 1; i >= 0; i--) {
            polyValue = polyValue * x + this.coeffs[i];
        }

        return polyValue;
    }

    public MyPolynomial add(MyPolynomial right) {
        int addPolyDegree = Math.max(this.getDegree(), right.getDegree());
        MyPolynomial newPoly = new MyPolynomial(addPolyDegree);

        // add this poly
        for (int i = 0; i <= this.getDegree(); i++) {
            newPoly.coeffs[i] += this.coeffs[i];
        }

        // add the right poly
        for (int i = 0; i <= right.getDegree(); i++) {
            newPoly.coeffs[i] += right.coeffs[i];
        }

        return newPoly;
    }

    public MyPolynomial multiply(MyPolynomial right) {
        int multiplyPolyDegree = this.getDegree() + right.getDegree();
        MyPolynomial newPoly = new MyPolynomial(multiplyPolyDegree);
        for (int i = 0; i <= this.getDegree(); i++) {
            for (int j = 0; j <= right.getDegree(); j++) {
                newPoly.coeffs[i + j] = this.coeffs[i] * right.coeffs[j];
            }
        }

        return newPoly;
    }
}
