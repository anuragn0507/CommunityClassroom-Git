package backtracking;

public class NKnights {
    public static void main(String[] args) {

    }

    static void knight(boolean[][] board, int row, int col, int knights){
        if(knights == 0){
            display(board);
            System.out.println();
        }

        if(col == board.length){
            knight(board, row+1, 0,knights);
            return;
        }

        if(isSafe(board, row, col)){
            board[row][col] = true;
            knight(board, row, col+1, knights-1);
            board[row][col] = false;
        }
        knight(board, col+1, 0,knights);

    }

    private static boolean isSafe(boolean[][] board, int row, int col) {

    }

    private static void display(boolean[][] board) {
        for (boolean[] row: board) {
                for(boolean element: row) {
                    if(element){
                        System.out.print("Q ");
                    }else{
                        System.out.print("X ");
                    }
                }
                System.out.println();
            }
        }
    }

