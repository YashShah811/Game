

public class BuildBoard {

    public void build(int[][] matrix) {
        int[] row = new int[9];
        int[] col = new int[9];
        int[] val = new int[9];
        int k = 0;
        int j = 0;
        for(int i = 0; i < 9; i++) {
            row[i] = (int)(Math.random()*10);
            col[i] = (int)(Math.random()*10);
            val[i] = (int)(Math.random()*10);
        }

        for(int i = 0; i < 9; i++) {
            if(row[k] == i) {
                while(j != col[k]) {

                }
            }
        }
        Print print = new Print();
        print.print(matrix);
    }
}
