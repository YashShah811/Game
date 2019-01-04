import java.util.Random;

public class Sudoku {
    public static void main(String[] args) {
        int[][] matrix = new int[9][9];
        BuildBoard buildBoard = new BuildBoard();
        buildBoard.build(matrix);
    }
}
