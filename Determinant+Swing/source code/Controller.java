/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lunmijo.determinant.matrix;

/**
 *
 * @author Lunmijo
 * Created: May, 8, 2018
 */
public class Controller {

    Controller() {
        
    }
    
    static double[][] getMatrixFromFields(View view) {
        int size = view.getMatrixSize();
        view.setMatrixSize(size);
        switch (size) {
            case 2:
                view.setElementMatrix(0, 0, view.getA11()); 
                view.setElementMatrix(0, 1, view.getA12());
                view.setElementMatrix(1, 0, view.getA21());
                view.setElementMatrix(1, 1, view.getA22());
                break;
            case 3:
                view.setElementMatrix(0, 0, view.getA11()); 
                view.setElementMatrix(0, 1, view.getA12());
                view.setElementMatrix(0, 2, view.getA13());
                
                view.setElementMatrix(1, 0, view.getA21()); 
                view.setElementMatrix(1, 1, view.getA22());
                view.setElementMatrix(1, 2, view.getA23());
                
                view.setElementMatrix(2, 0, view.getA31());
                view.setElementMatrix(2, 1, view.getA32());
                view.setElementMatrix(2, 2, view.getA33());
                break;
            case 4:
                view.setElementMatrix(0, 0, view.getA11()); 
                view.setElementMatrix(0, 1, view.getA12());
                view.setElementMatrix(0, 2, view.getA13());
                view.setElementMatrix(0, 3, view.getA14());
                
                view.setElementMatrix(1, 0, view.getA21()); 
                view.setElementMatrix(1, 1, view.getA22());
                view.setElementMatrix(1, 2, view.getA23());
                view.setElementMatrix(1, 3, view.getA24());
                
                view.setElementMatrix(2, 0, view.getA31());
                view.setElementMatrix(2, 1, view.getA32());
                view.setElementMatrix(2, 2, view.getA33());
                view.setElementMatrix(2, 3, view.getA34());
                
                view.setElementMatrix(3, 0, view.getA41());
                view.setElementMatrix(3, 1, view.getA42());
                view.setElementMatrix(3, 2, view.getA43());
                view.setElementMatrix(3, 3, view.getA44());
                break;
            case 5:
                view.setElementMatrix(0, 0, view.getA11()); 
                view.setElementMatrix(0, 1, view.getA12());
                view.setElementMatrix(0, 2, view.getA13());
                view.setElementMatrix(0, 3, view.getA14());
                view.setElementMatrix(0, 4, view.getA15());
                
                view.setElementMatrix(1, 0, view.getA21()); 
                view.setElementMatrix(1, 1, view.getA22());
                view.setElementMatrix(1, 2, view.getA23());
                view.setElementMatrix(1, 3, view.getA24());
                view.setElementMatrix(1, 4, view.getA25());
                
                view.setElementMatrix(2, 0, view.getA31());
                view.setElementMatrix(2, 1, view.getA32());
                view.setElementMatrix(2, 2, view.getA33());
                view.setElementMatrix(2, 3, view.getA34());
                view.setElementMatrix(2, 4, view.getA35());
                
                view.setElementMatrix(3, 0, view.getA41());
                view.setElementMatrix(3, 1, view.getA42());
                view.setElementMatrix(3, 2, view.getA43());
                view.setElementMatrix(3, 3, view.getA44());
                view.setElementMatrix(3, 4, view.getA45());
                
                view.setElementMatrix(4, 0, view.getA51());
                view.setElementMatrix(4, 1, view.getA52());
                view.setElementMatrix(4, 2, view.getA53());
                view.setElementMatrix(4, 3, view.getA54());
                view.setElementMatrix(4, 4, view.getA55());
                break;
            case 6:
                view.setElementMatrix(0, 0, view.getA11()); 
                view.setElementMatrix(0, 1, view.getA12());
                view.setElementMatrix(0, 2, view.getA13());
                view.setElementMatrix(0, 3, view.getA14());
                view.setElementMatrix(0, 4, view.getA15());
                view.setElementMatrix(0, 5, view.getA16());
                
                view.setElementMatrix(1, 0, view.getA21()); 
                view.setElementMatrix(1, 1, view.getA22());
                view.setElementMatrix(1, 2, view.getA23());
                view.setElementMatrix(1, 3, view.getA24());
                view.setElementMatrix(1, 4, view.getA25());
                view.setElementMatrix(1, 5, view.getA26());
                
                view.setElementMatrix(2, 0, view.getA31());
                view.setElementMatrix(2, 1, view.getA32());
                view.setElementMatrix(2, 2, view.getA33());
                view.setElementMatrix(2, 3, view.getA34());
                view.setElementMatrix(2, 4, view.getA35());
                view.setElementMatrix(2, 5, view.getA36());
                
                view.setElementMatrix(3, 0, view.getA41());
                view.setElementMatrix(3, 1, view.getA42());
                view.setElementMatrix(3, 2, view.getA43());
                view.setElementMatrix(3, 3, view.getA44());
                view.setElementMatrix(3, 4, view.getA45());
                view.setElementMatrix(3, 5, view.getA46());
                
                view.setElementMatrix(4, 0, view.getA51());
                view.setElementMatrix(4, 1, view.getA52());
                view.setElementMatrix(4, 2, view.getA53());
                view.setElementMatrix(4, 3, view.getA54());
                view.setElementMatrix(4, 4, view.getA55());
                view.setElementMatrix(4, 5, view.getA56());
                
                view.setElementMatrix(5, 0, view.getA61());
                view.setElementMatrix(5, 1, view.getA62());
                view.setElementMatrix(5, 2, view.getA63());
                view.setElementMatrix(5, 3, view.getA64());
                view.setElementMatrix(5, 4, view.getA65());
                view.setElementMatrix(5, 5, view.getA66());
                break;
            case 7:
                view.setElementMatrix(0, 0, view.getA11()); 
                view.setElementMatrix(0, 1, view.getA12());
                view.setElementMatrix(0, 2, view.getA13());
                view.setElementMatrix(0, 3, view.getA14());
                view.setElementMatrix(0, 4, view.getA15());
                view.setElementMatrix(0, 5, view.getA16());
                view.setElementMatrix(0, 6, view.getA17());
                
                view.setElementMatrix(1, 0, view.getA21()); 
                view.setElementMatrix(1, 1, view.getA22());
                view.setElementMatrix(1, 2, view.getA23());
                view.setElementMatrix(1, 3, view.getA24());
                view.setElementMatrix(1, 4, view.getA25());
                view.setElementMatrix(1, 5, view.getA26());
                view.setElementMatrix(1, 6, view.getA27());
                
                view.setElementMatrix(2, 0, view.getA31());
                view.setElementMatrix(2, 1, view.getA32());
                view.setElementMatrix(2, 2, view.getA33());
                view.setElementMatrix(2, 3, view.getA34());
                view.setElementMatrix(2, 4, view.getA35());
                view.setElementMatrix(2, 5, view.getA36());
                view.setElementMatrix(2, 6, view.getA37());
                
                view.setElementMatrix(3, 0, view.getA41());
                view.setElementMatrix(3, 1, view.getA42());
                view.setElementMatrix(3, 2, view.getA43());
                view.setElementMatrix(3, 3, view.getA44());
                view.setElementMatrix(3, 4, view.getA45());
                view.setElementMatrix(3, 5, view.getA46());
                view.setElementMatrix(3, 6, view.getA47());
                
                view.setElementMatrix(4, 0, view.getA51());
                view.setElementMatrix(4, 1, view.getA52());
                view.setElementMatrix(4, 2, view.getA53());
                view.setElementMatrix(4, 3, view.getA54());
                view.setElementMatrix(4, 4, view.getA55());
                view.setElementMatrix(4, 5, view.getA56());
                view.setElementMatrix(4, 6, view.getA57());
                
                view.setElementMatrix(5, 0, view.getA61());
                view.setElementMatrix(5, 1, view.getA62());
                view.setElementMatrix(5, 2, view.getA63());
                view.setElementMatrix(5, 3, view.getA64());
                view.setElementMatrix(5, 4, view.getA65());
                view.setElementMatrix(5, 5, view.getA66());
                view.setElementMatrix(5, 6, view.getA67());
                
                view.setElementMatrix(6, 0, view.getA71());
                view.setElementMatrix(6, 1, view.getA72());
                view.setElementMatrix(6, 2, view.getA73());
                view.setElementMatrix(6, 3, view.getA74());
                view.setElementMatrix(6, 4, view.getA75());
                view.setElementMatrix(6, 5, view.getA76());
                view.setElementMatrix(6, 6, view.getA77());
                break;
            case 8:
                view.setElementMatrix(0, 0, view.getA11()); 
                view.setElementMatrix(0, 1, view.getA12());
                view.setElementMatrix(0, 2, view.getA13());
                view.setElementMatrix(0, 3, view.getA14());
                view.setElementMatrix(0, 4, view.getA15());
                view.setElementMatrix(0, 5, view.getA16());
                view.setElementMatrix(0, 6, view.getA17());
                view.setElementMatrix(0, 7, view.getA18());
                
                view.setElementMatrix(1, 0, view.getA21()); 
                view.setElementMatrix(1, 1, view.getA22());
                view.setElementMatrix(1, 2, view.getA23());
                view.setElementMatrix(1, 3, view.getA24());
                view.setElementMatrix(1, 4, view.getA25());
                view.setElementMatrix(1, 5, view.getA26());
                view.setElementMatrix(1, 6, view.getA26());
                view.setElementMatrix(1, 7, view.getA18());
                
                view.setElementMatrix(2, 0, view.getA31());
                view.setElementMatrix(2, 1, view.getA32());
                view.setElementMatrix(2, 2, view.getA33());
                view.setElementMatrix(2, 3, view.getA34());
                view.setElementMatrix(2, 4, view.getA35());
                view.setElementMatrix(2, 5, view.getA36());
                view.setElementMatrix(2, 6, view.getA37());
                view.setElementMatrix(2, 7, view.getA38());
                
                view.setElementMatrix(3, 0, view.getA41());
                view.setElementMatrix(3, 1, view.getA42());
                view.setElementMatrix(3, 2, view.getA43());
                view.setElementMatrix(3, 3, view.getA44());
                view.setElementMatrix(3, 4, view.getA45());
                view.setElementMatrix(3, 5, view.getA46());
                view.setElementMatrix(3, 6, view.getA47());
                view.setElementMatrix(3, 7, view.getA18());
                
                view.setElementMatrix(4, 0, view.getA51());
                view.setElementMatrix(4, 1, view.getA52());
                view.setElementMatrix(4, 2, view.getA53());
                view.setElementMatrix(4, 3, view.getA54());
                view.setElementMatrix(4, 4, view.getA55());
                view.setElementMatrix(4, 5, view.getA56());
                view.setElementMatrix(4, 6, view.getA57());
                view.setElementMatrix(4, 7, view.getA58());
                
                view.setElementMatrix(5, 0, view.getA61());
                view.setElementMatrix(5, 1, view.getA62());
                view.setElementMatrix(5, 2, view.getA63());
                view.setElementMatrix(5, 3, view.getA64());
                view.setElementMatrix(5, 4, view.getA65());
                view.setElementMatrix(5, 5, view.getA66());
                view.setElementMatrix(5, 6, view.getA67());
                view.setElementMatrix(5, 7, view.getA68());
                
                view.setElementMatrix(6, 0, view.getA71());
                view.setElementMatrix(6, 1, view.getA72());
                view.setElementMatrix(6, 2, view.getA73());
                view.setElementMatrix(6, 3, view.getA74());
                view.setElementMatrix(6, 4, view.getA75());
                view.setElementMatrix(6, 5, view.getA76());
                view.setElementMatrix(6, 6, view.getA77());
                view.setElementMatrix(6, 7, view.getA78());
                
                view.setElementMatrix(7, 0, view.getA81());
                view.setElementMatrix(7, 1, view.getA82());
                view.setElementMatrix(7, 2, view.getA83());
                view.setElementMatrix(7, 3, view.getA84());
                view.setElementMatrix(7, 4, view.getA85());
                view.setElementMatrix(7, 5, view.getA86());
                view.setElementMatrix(7, 6, view.getA87());
                view.setElementMatrix(7, 7, view.getA88());
                break;
            default:
                break;
        }
        final double[][] matrix = view.getMatrix();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
        return view.getMatrix();
    }
    
    public static double getDeterminant(View view) {
        double[][] matrix = getMatrixFromFields(view);
        return SquareMatrixOperations.findDeterminant(matrix);
    }
}
