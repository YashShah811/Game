

public class BuildBoard {

    public void build(int[][] matrix) {
        Validation validation = new Validation();
        int a = 30;
        for(int i = 1; i <= a; i++) {
            int b = (int)(Math.random()*9);
            int c = (int)(Math.random()*9);
            int v = (int)(Math.random()*8) + 1;
            if (validation.validateRowCol(matrix,b,c,v) && validation.validateSubMatrix(matrix,b,c,v)) {
                matrix[b][c] = v;
            }
        }
        Print print = new Print();
        print.print(matrix);
    }
}
