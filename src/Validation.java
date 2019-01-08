public class Validation {

    public Boolean validateRowCol(int[][] matrix,int row, int col, int val) {
        for(int i=0; i<9; i++) {
            if(i == row && i == col) {
                continue;
            } else {
                if(matrix[row][i] == val) {
                    System.out.println("Wrong input.");
                    return false;
                }
                if(matrix[i][col] == val) {
                    System.out.println("Wrong input.");
                    return false;
                }
            }
        }
        return true;
    }

    public Boolean validateSubMatrix(int[][] matrix, int row, int col, int val) {
        int a = 0,b = 0;
        if(row == 0 || row ==1 || row ==2) {
            a = 0;
        } else if(row == 3 || row ==4 || row ==5) {
            a = 3;
        } else if(row == 6 || row ==7 || row ==8) {
            a = 6;
        }

        if(col == 0 || col ==1 || col ==2) {
            b = 0;
        } else if(col == 3 || col ==4 || col ==5) {
            b = 3;
        } else if(col == 6 || col ==7 || col ==8) {
            b = 6;
        }

        for(int i = a; i < a+3; i++) {
            for(int j = b; j < b+3; j++) {
                if(matrix[i][j] == val) {
                    System.out.println("Wrong input.");
                    return false;
                }
            }
        }
        return true;
    }
}
