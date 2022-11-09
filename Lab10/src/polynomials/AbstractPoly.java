package polynomials;

import java.util.Objects;

public abstract class AbstractPoly implements Poly{
    public AbstractPoly() {
    }

    double[] derive() {
        Poly derivativePoly = derivative();
        return derivativePoly.coefficients();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(coefficients());
    }

    @Override
    public String toString() {
        return "";
    }
}

