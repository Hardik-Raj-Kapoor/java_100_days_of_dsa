package recursion_and_backtracking;

public class day_22_N_Queens_without_ArrayList {
    static int N = 4;

    public static void main(String args[]){
        char[][] board = new char[N][N];

        //bord initialization with : " . "
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                board[i][j] = '.';
            }
        }
        solve(0,board,N);
    }

    public static void solve(int row, char[][] board, int n){
        if(row == n){
            printBoard(board,n);
            System.out.println();
            return;
        }
        // Recursive function to solve N Queens
        for(int col = 0;col<n;col++){
            if(isSafe(board,row,col,n)){
                board[row][col] = 'Q';
                solve(row+1,board,n);
                board[row][col] = '.';
            }
        }
    }

    // Check if it’s safe to place a queen at (row, col)
    public static boolean isSafe(char[][] board,int row, int col,int n){
        //check column  above
        for(int i=0;i<row;i++){
            if(board[i][col]=='Q')return false;
        }

        //check upper left diagonal
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j] == 'Q') return false;
        }

        //checking upper right diagonal
        for(int i=row-1,j=col+1;i>=0 && j<n;i--,j++){
            if(board[i][j] == 'Q') return false;
        }
        return true;
    }

    //print the board

    public static void printBoard(char[][] board,int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

}
