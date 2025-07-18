class size{
    public final int SIZE = 9;
}

class sudoku_solver_fns extends size{
    // Recursive backtracking method to solve the board
    public boolean solvesudoku(int[][] board){
        for(int row = 0; row<SIZE;row++){
            for(int col=0;col<SIZE;col++){
                if(board[row][col] == 0){//Empty cell
                    for(int num = 1;num<=9;num++){
                        if(isSafe(board,row,col,num)){
                            board[row][col] = num;

                            if(solvesudoku(board)){
                                return true;
                            }
                            board[row][col] = 0; //backtrack
                        }
                    }
                    return false; //no valid number found
                }
            }
        }
        return true; //solved
    }

    // Check if it's safe to place the number at board[row][col]
    private boolean isSafe(int[][] board, int row, int col, int num){
        //check row and column
        for(int i=0;i<SIZE;i++){
            if(board[row][i] == num || board[i][col] == num){
                return false;
            }
        }

        //check 3X3 grid
        int startrow = row - row%3;
        int startcol = col - col%3;

        for(int i = startrow;i<startrow+3;i++){
            for(int j = startcol;j<startcol;j++){
                if(board[i][j] == num){
                    return false;
                }
            }
        }
        return true;
    }

    // Print the Sudoku board
    public void printboard(int[][] board){
        for(int r=0;r<SIZE;r++){
            for(int d=0;d<SIZE;d++){
                System.out.print(board[r][d]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

public class day_23_Sudoku_solver {
    public static void main(String[] args) {
        int[][] board = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        sudoku_solver_fns obj = new sudoku_solver_fns();
        if (obj.solvesudoku(board)) {
            obj.printboard(board);
        } 
        else {
            System.out.println("No solution exists");
        }
    }
}
