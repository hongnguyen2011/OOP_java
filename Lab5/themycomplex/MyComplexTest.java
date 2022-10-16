public class MyComplexTest {

    public static void main(String args[]) {
        MyComplex complex = new MyComplex(2, 2);
        MyComplex another = new MyComplex(3, 3);

        /* Testing getters */
        System.out.println("Testing getters");
        System.out.println();

        System.out.println("Testing getReal: " + complex.getReal()); //calls getReal | return is 2
        System.out.println("Testing getImag: " + complex.getImag()); //calls getImag | return is 2
        System.out.println("Testing toString: " + complex); //implicitly calls toString | return is (2, 2)

        System.out.println();
        System.out.println();


        /* Testing setters */
        System.out.println("Testing setters");
        System.out.println();

        System.out.println("Testing setReal");
        System.out.println("Current real: " + complex.getReal()); //finds number with getReal | return is 2
        complex.setReal(5); //changes the real with setReal
        System.out.println("Changed radius: " + complex.getReal());  //finds number with getReal | return is 5
        System.out.println();

        System.out.println("Testing setImag");
        System.out.println("Current real: " + complex.getImag()); //finds number with getImag | return is 2
        complex.setImag(5); //changes the imaginary with setImag
        System.out.println("Changed radius: " + complex.getImag()); //finds number with getImag | return is 5
        System.out.println();

        System.out.println("Testing setValue");
        System.out.println("Current values: " + complex); //finds number by implicitly calling toString | return is (5, 5)
        complex.setValue(6, 6); //changes the values with setValue
        System.out.println("Changed radius: " + complex); //finds number by implicitly calling toString | return is (6, 6)
        System.out.println();

        System.out.println("Testing add");
        System.out.println("Current values: " + complex); //finds number by implicitly calling toString | return is (6, 6)
        MyComplex added = complex.add(another); //adds the complex number by `another` with multiplyWith
        System.out.println("Changed values: " + added); //finds number by implicitly calling toString | return is (9, 9)
        System.out.println();

        System.out.println("Testing subtract");
        System.out.println("Current real: " + complex); //finds number by implicitly calling toString | return is (6, 6)
        MyComplex subtracted = complex.subtract(another); //subtracts the complex number by `another` with divideBy
        System.out.println("Changed values: " + subtracted); //finds number by implicitly calling toString | return is (3, 3)
        System.out.println();

        System.out.println("Testing multiplyWith");
        System.out.println("Current values: " + complex); //finds number by implicitly calling toString | return is (6, 6)
        complex.multiplyWith(another); //multiplies the complex number by `another` with multiplyWith
        System.out.println("Changed values: " + complex); //finds number by implicitly calling toString | return is (0, 18)
        System.out.println();

        System.out.println("Testing divideBy");
        System.out.println("Current real: " + complex); //finds number by implicitly calling toString | return is (0, 18)
        complex.divideBy(another); //divides the complex number by `another` with divideBy
        System.out.println("Changed values: " + complex); //finds number by implicitly calling toString | return is (315, 34.5)

        System.out.println();
        System.out.println();


        /* Testing returns */
        System.out.println("Testing returns");
        System.out.println();

        System.out.println("Testing isReal: " + complex.isReal()); //calls isReal | return is false
        System.out.println("Testing isImaginary: " + complex.isImaginary()); //calls isImaginary | return is true
        System.out.println("Testing equals: " + complex.equals(another)); //calls equals | return is false
        System.out.println("Testing magnitude: " + complex.magnitude()); //calls magnitude | return is 316.88365372798893
        System.out.println("Testing argumentInRadians: " + complex.argumentInRadians()); //calls argumentInRadians | return is 0.10908900499998157
        System.out.println("Testing arguemntInDegrees: " + complex.argumentInDegrees()); //calls argumentInDegrees | return is 6
    }
}