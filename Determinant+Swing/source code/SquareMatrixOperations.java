package lunmijo.determinant.matrix;

/**
 * @author Lunmijo
 * April, 2018
 * Last modified May, 1, 2018

 */
public final class SquareMatrixOperations {

    private SquareMatrixOperations() { }

    static double[][] get_minor(double[][] matrix, int row, int column) {
        final int minorLength = matrix.length - 1;
        double[][] minor = new double[minorLength][minorLength];
        int deletingRow = 0;
        int deletingColumn;
        for(int i = 0; i <= minorLength; i++) {
            deletingColumn = 0;
            for(int j=0; j <= minorLength; j++) {
                if(i == row) {
                    deletingRow = 1;
                }
                else {
                    if(j == column) {
                        deletingColumn = 1;
                    }
                    else {
                        minor[i-deletingRow][j-deletingColumn] = matrix[i][j];
                    }
                }
            }
        }
        return minor;
    }
    //если матрица очень большая, алгебраическое дополнение не найдется/потратится дохуя времени...
    static double algebraicComplement(double[][] matrix, int numberOfRow, int numberOfColumn) {
        int coefficient;
        if((numberOfRow+numberOfColumn) % 2 == 1){
            coefficient = -1;
        }
        else {
            coefficient = 1;
        }
        return (coefficient * findDeterminant(get_minor(matrix,numberOfRow,numberOfColumn)));
    }
    //по ходу это для онли квадратных матриц, TODO: простестировать работает ли для неквадратных матриц
    static double[][] matrixToDiagonalView(double[][] matrix) {
      double[][] resultMatrix = matrix;
      final int matrixSize = matrix.length;
        for (int i = 0; i < matrixSize; i++) {
            for (int j = i + 1; j < matrixSize; j++) { //тут j = i+1 потому что мы первый рядок не трогаем (зачем? там все элементы как есть
                double coefficient = matrix[j][i] / matrix[i][i]; //коэффициент для домножения элемента
                for (int k = i; k < matrixSize; k++) {
//проходимся по всем элементам столбца, следующими после i+1, таким образом матрица приводится к виду что с одной половины мэйн диагонали один нули
                    resultMatrix[j][k] = matrix[j][k] - coefficient * matrix[i][k];
                }
            }
        }

        return resultMatrix;
    }

    static double findDeterminant(double[][] matrix) {
        double det = 0;
        final int matrixSize = matrix.length;
        if (matrixSize == 2) {
            det = matrix[0][0] * matrix[1][1] - matrix[1][0]*matrix[0][1];
        }
        else if (matrixSize == 3) {
            //triangle rule for finding determinant of matrix 3x3
            det =   matrix[0][0] * matrix[1][1] * matrix[2][2] +
                    matrix[1][0] * matrix[2][1] * matrix[0][2] +
                    matrix[0][1] * matrix[1][2] * matrix[2][0] -
                    matrix[0][2] * matrix[1][1] * matrix[2][0] -
                    matrix[1][2] * matrix[2][1] * matrix[0][0] -
                    matrix[0][1] * matrix[1][0] * matrix[2][2];
        }
        else if (matrixSize > 8){
            det = 1;
            for (int j = 0; j < matrixSize; j++) {
                double[][] triangleMatrix;
                triangleMatrix = matrix;
                triangleMatrix = matrixToDiagonalView(triangleMatrix);
                det *= triangleMatrix[j][j];
            }
        }
        else {
            for (int j = 0; j < matrixSize; j++) {
                det += matrix[0][j] * algebraicComplement(matrix, 0, j);
            }

        }
        return det;
    }
}

