package polynomials;

import java.util.ArrayList;
import java.util.List;

public class ListPoly extends AbstractPoly {
    List<Double> coefficients;

    public ListPoly(double[] coeffs) {
        coefficients = new ArrayList<>();
        for (double i : coeffs) {
            coefficients.add(i);
        }
    }

    @Override
    public int degree() {
        int a = 0;
        for (int deg = 0; deg < coefficients.size(); deg++) {
            if (coefficients.get(deg) != 0) {
                a = deg;
            }
        }
        return a;
    }

    @Override
    public Poly derivative() {
        double[] poly = new double[degree() + 1];
        for (int i = 1; i < coefficients.size(); i++) {
            poly[i - 1] = i * coefficients.get(i);
        }
        return new ArrayPoly(poly);
    }


    @Override
    public double coefficient(int degree) {
        if (degree() >= degree) {
            return coefficients.get(degree);
        }
        return -100000;
    }

    @Override
    public double[] coefficients() {
        double[] arr = new double[coefficients.size()];
        for (int i = 0; i < coefficients.size(); i++) {
            arr[i] = coefficients.get(i);
        }
        return arr;
    }

    @Override
    public String toString() {
        if (degree() == -1) {
            return "0";
        } else if (degree() == 0) {
            return "" + coefficients.get(0);
        } else if (degree() == 1) {
            return coefficients.get(1) + "x + " + coefficients.get(0);
        }
        String s = coefficients.get(degree()) + "x^" + degree();
        for (int i = degree() - 1; i >= 0; i--) {
            if (coefficients.get(i) == 0) {
                continue;
            } else if (coefficients.get(i) > 0) {
                s = s + " + " + (coefficients.get(i));
            } else if (coefficients.get(i) < 0) {
                s = s + " - " + (-coefficients.get(i));
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
            if (this.coefficients.get(i) != that.coefficient(i)) {
                return false;
            }
        }
        return true;
    }
}
