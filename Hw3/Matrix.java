public class Matrix {
    public static void createRandomMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = (int) (Math.random() * 9) + 1;
            }
        }
    }

    public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = (int) (Math.random() * 9) + 1;
            }
        }
        return matrix;
    }

    public static boolean haveSameDimension(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length != matrix2.length) {
            return false;
        }

        if (matrix1[0].length != matrix2[0].length) {
            return false;
        }

        return true;
    }

    public static boolean haveSameDimension(double[][] matrix1, double[][] matrix2) {
        if (matrix1.length != matrix2.length) {
            return false;
        }

        if (matrix1[0].length != matrix2[0].length) {
            return false;
        }

        return true;
    }

    public static int[][] add(int[][] matrix1, int[][] matrix2) {
        if (!haveSameDimension(matrix1, matrix2)) {
            return null;
        }

        int[][] matrix = new int[matrix1.length][matrix1[0].length];
        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix1[0].length; col++) {
                matrix[row][col] = matrix1[row][col] + matrix2[row][col];
            }
        }
        return matrix;
    }

    public static double[][] add(double[][] matrix1, double[][] matrix2) {
        if (!haveSameDimension(matrix1, matrix2)) {
            return null;
        }

        double[][] matrix = new double[matrix1.length][matrix1[0].length];
        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix1[0].length; col++) {
                matrix[row][col] = matrix1[row][col] + matrix2[row][col];
            }
        }
        return matrix;
    }

    public static int[][] subtract(int[][] matrix1, int[][] matrix2) {
        if (!haveSameDimension(matrix1, matrix2)) {
            return null;
        }

        int rowMatrix = matrix1.length;
        int colMatrix = matrix1[0].length;
        int[][] matrix = new int[rowMatrix][colMatrix];
        for (int row = 0; row < rowMatrix; row++) {
            for (int col = 0; col < colMatrix; col++) {
                matrix[row][col] = matrix1[row][col] - matrix2[row][col];
            }
        }
        return matrix;
    }

    public static double[][] subtract(double[][] matrix1, double[][] matrix2) {
        if (!haveSameDimension(matrix1, matrix2)) {
            return null;
        }

        int rowMatrix = matrix1.length;
        int colMatrix = matrix1[0].length;
        double[][] matrix = new double[rowMatrix][colMatrix];
        for (int row = 0; row < rowMatrix; row++) {
            for (int col = 0; col < colMatrix; col++) {
                matrix[row][col] = matrix1[row][col] - matrix2[row][col];
            }
        }
        return matrix;
    }

    public static boolean isMultiply(int[][] matrix1, int[][] matrix2) {
        if(matrix1[0].length == matrix2.length) {
            return true;
        } else {
            return false;
        }
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        if (!isMultiply(matrix1, matrix2)) {
            return null;
        }

        int rowMatrix = matrix1.length;
        int colMatrix = matrix2[0].length;
        int idxMatrix = matrix2.length;

        int[][] matrix = new int[rowMatrix][colMatrix];
        for (int row = 0; row < rowMatrix; row++) {
            for (int col = 0; col < colMatrix; col++) {
                int sum = 0;
                for (int idx = 0; idx < idxMatrix; idx++) {
                    sum += matrix1[row][idx] * matrix2[idx][col];
                }
                matrix[row][col] = sum;

            }
        }
        return matrix;
    }

    public static boolean isMultiply(double[][] matrix1, double[][] matrix2) {
        if(matrix1[0].length == matrix2.length) {
            return true;
        } else {
            return false;
        }
    }

    public static double[][] multiply(double[][] matrix1, double[][] matrix2) {
        if (!isMultiply(matrix1, matrix2)) {
            return null;
        }

        int rowMatrix = matrix1.length;
        int colMatrix = matrix2[0].length;
        int idxMatrix = matrix2.length;

        double[][] matrix = new double[rowMatrix][colMatrix];
        for (int row = 0; row < rowMatrix; row++) {
            for (int col = 0; col < colMatrix; col++) {
                int sum = 0;
                for (int idx = 0; idx < idxMatrix; idx++) {
                    sum += matrix1[row][idx] * matrix2[idx][col];
                }
                matrix[row][col] = sum;

            }
        }
        return matrix;
    }

    public static void print(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.printf("%d ", matrix[row][col]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrixInt1 = new int[3][3];
        createRandomMatrix(matrixInt1);
        System.out.println("Matrix Integer 1: ");
        print(matrixInt1);

        int[][] matrixInt2 = createRandomMatrix(3, 3);
        System.out.println("Matrix Integer2: ");
        print(matrixInt2);

        int[][] add = add(matrixInt1, matrixInt2);
        System.out.println("Matrix1 + Matrix2: ");
        print(add);

        int[][] subtract = subtract(matrixInt1, matrixInt2);
        System.out.println("Matrix1 - Matrix2: ");
        print(subtract);

        int[][] multiply = multiply(matrixInt1, matrixInt2);
        System.out.println("Matrix1 * Matrix2: ");
        print(multiply);


    }
}
