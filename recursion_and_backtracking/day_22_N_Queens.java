package recursion_and_backtracking;

import java.util.*;
public class day_22_N_Queens {
    public static void main(String[] args) {
        int n = 4;
        List<List<String>> Solutions = SolveNQueens(n);

        for(List<String> solution : Solutions){
            for(String row: solution){
                System.out.println(row);
            }
        }
    }


    // Solves N-Queens and returns list of board arrangements
    public static List<List<String>> SolveNQueens(int n){
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];


        //initializing board with '.'
        for (char[] row : board){
            Arrays.fill(row,'.');
        }
        
        solve(0,board,result,n);
        return result;
    }


    // Recursive backtracking function
    public static void solve(int row, char[][] board,List<List<String>> result, int n){
        // Base case: All queens placed
        if(row== n){
            result.add(constructBoard(board));
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col, n)) {
                board[row][col] = 'Q'; // Place queen
                solve(row + 1, board, result, n); // Recurse for next row
                board[row][col] = '.'; // Backtrack
            }
        }
    }


     // Check if it's safe to place queen at (row, col)
    public static boolean isSafe(char[][] board, int row, int col, int n) {
        // Check column above
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') return false;
        }

        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        // Check upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }

    // Converts 2D board array to a list of strings
    public static List<String> constructBoard(char[][] board) {
        List<String> result = new ArrayList<>();
        for (char[] row : board) {
            result.add(new String(row));
        }
        return result;
    }
    }

