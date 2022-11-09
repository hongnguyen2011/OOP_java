package polynomials;

import java.util.Arrays;

public class ArrayPoly extends AbstractPoly {

    private final double[] coefficients;

    public ArrayPoly(double[] coefficients) {
        this.coefficients = coefficients;
    }


    @Override
    public int degree() {
        int a = 0;
        for (int deg = 0; deg < coefficients.length; deg++) {
            if (coefficients[deg] != 0) {
                a = deg;
            }
        }
        return a;
    }

    @Override
    public Poly derivative() {
        double[] poly = new double[degree() + 1];
        for (int i = 1; i < coefficients.length; i++) {
            poly[i - 1] = i * coefficients[i];
        }
        return new ArrayPoly(poly);
    }

    @Override
    public double coefficient(int degree) {
        if (degree() >= degree) {
            return coefficients[degree];
        }
        return -100000;
    }

    @Override
    public double[] coefficients() {
        return coefficients;
    }

    @Override
    public String toString() {
        if (degree() == -1) {
            return "0";
        } else if (degree() == 0) {
            return "" + coefficients[0];
        } else if (degree() == 1) {
            return coefficients[1] + "x + " + coefficients[0];
        }
        String s = coefficients[degree()] + "x^" + degree();
        for (int i = degree() - 1; i >= 0; i--) {
            if (coefficients[i] == 0) {
                continue;
            } else if (coefficients[i] > 0) {
                s = s + " + " + (coefficients[i]);
            } else if (coefficients[i] < 0) {
                s = s + " - " + (-coefficients[i]);
            }
            if (i == 1) {
                s = s + "x";
            } else if (i > 1) {
                s = s + "x^" + i;
            }
        }
        return s;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (o == null) return false;
        Poly that = (Poly) o;
        if (this.degree() != that.degree()) return false;
        for (int i = this.degree(); i >= 0; i--) {
            if (this.coefficients[i] != that.coefficient(i)) {
                return false;
            }
        }
        return true;
    }
}
