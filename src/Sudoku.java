import java.util.Scanner;

public class Sudoku {
    public static void main(String[] args) {
        int[][] matrix = new int[9][9];
        int row,col,value;
        String p;
        String regex = "[Yy]?";
        BuildBoard buildBoard = new BuildBoard();
        buildBoard.build(matrix);
        Scanner scanner = new Scanner(System.in);
        Validation validation = new Validation();
        Print print = new Print();
        do {
            System.out.print("Enter row number : ");
            row = scanner.nextInt();
            System.out.println();
            System.out.print("Enter column number : ");
            col = scanner.nextInt();
            System.out.println();
            System.out.print("Enter value : ");
            value = scanner.nextInt();
            if (matrix[row][col] == 0) {
                if (validation.validateRowCol(matrix, row - 1, col - 1, value) && validation.validateSubMatrix(matrix, row - 1, col - 1, value)) {
                    matrix[row - 1][col - 1] = value;
                }
            } else {
                System.out.println("Value already exist.");
            }
            print.print(matrix);
            System.out.println("Continue? (Y/N) : ");
            p = scanner.next();
        } while (p.matches(regex));

        if(p.matches("[Nn]")) {
            int flag = 0;
            for(int i = 0; i < 9; i++) {
                for(int j = 0; j < 9; j++) {
                    if(matrix[i][j] == 0) {
                        System.out.println("Unsolved...");
                        flag = 1;
                        break;
                    }
                }
                if(flag == 1)
                    break;
            }
            if(flag == 0) {
                System.out.println("Solved...");
            }
        }

    }
}
