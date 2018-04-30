package lunmijo.matrix.java;

/**
 * @author Lunmijo
 * April, 9, 2018
 * Last modified April, 27, 2018

 */
public final class MatrixCalculations {
    //TODO: трай-кетч на отлов неодинаковых рамезмеров матриц? - ЭТО В КОНТРОЛЛЕРЕ
//TODO: написать умножение матриц
    private MatrixCalculations() { }

    static double[][] add_matrix(double[][] matrix1, double[][] matrix2) {
        final int rows = matrix1.length;
        final int columns = matrix1[0].length;
        double[][] resultMatrix = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix1[i][j];
            }
        }
        return resultMatrix;
    }

    static double[][] substract_matrix(double[][] matrix1, double[][] matrix2) {
        final int rows = matrix1.length;
        final int columns = matrix1[0].length;
        double[][] resultMatrix = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix[i][j] = matrix1[i][j] - matrix1[i][j];
            }
        }
        return resultMatrix;
    }

    static double[][] multiple_by_number_matrix(double[][] matrix1, double number) {
        final int rows = matrix1.length;
        final int columns = matrix1[0].length;
        double[][] resultMatrix = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix[i][j] = matrix1[i][j] * number;
            }
        }
        return resultMatrix;
    }

    static double[][] multiple_matrix(double[][] matrix1, double[][] matrix2) {
        final int rows = matrix1.length;
        final int columns = matrix1[0].length;
        double[][] resultMatrix = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                // умножаем матрицы
            }
        }
        return resultMatrix;
    }

    static boolean isMatrixesCoordinated(double[][] matrix1, double[][] matrix2) {
        if (matrix1[0].length == matrix2.length) {
            return true;
        }
        else {
            return false;
        }
    }

    static double[][] multiple_matrixes(double[][] matrix1, double matrix2[][]) {
        final int rows = matrix1.length;
        final int columns = matrix1[0].length;
        double[][] resultMatrix = new double[rows][columns];
        //перемножить матрицы
        return resultMatrix;
    }
}
