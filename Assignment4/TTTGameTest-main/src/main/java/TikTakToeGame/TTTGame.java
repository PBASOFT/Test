package TikTakToeGame;

public class TTTGame {
    private char[][] board;
    private char playerMark;
    private char emptyBoardMark;
    private char computerMark;

    public TTTGame(){
        board = new char[3][3];
        playerMark = 'x';
        computerMark = 'o';
        emptyBoardMark = '*';
        initBoard();
    }
    public char[][] getBoard() {
        return board;
    }

    public void initBoard() {
        for (int r = 0; r < 3; r++){
            for (int c = 0; c < 3; c++){
                board[r][c] = emptyBoardMark;
            }
        }
    }

    public boolean isBoardFull() {
        boolean isFull = true;
        for (int r = 0; r < 3; r++){
            for (int c = 0; c < 3; c++) {
                if (board[r][c] == emptyBoardMark){
                    isFull = false;
                }
            }
        }
        return isFull;
    }

    public boolean placeMove(int row, int column) throws Exception {
        if ((row  >= 0) && (row < 3)){
            if((column  >= 0) && (column < 3)){
                if (board[row][column]  ==  emptyBoardMark){
                    board[row][column] = playerMark;
                    return true;
                }
                else{
                    throw new Exception("The field is not empty");
                }
            }
        }
        return false;
    }

    public boolean checkRowWin() {
        for (int r =  0; r < 3; r++){
            if ((board[r][0] == playerMark) && (board[r][1] == playerMark) && (board[r][2] == playerMark))
            return true;
        }
        return false;
    }
    public void printGameBoard() {
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                System.out.print(board[r][c] + "|");
            }
            System.out.println();
        }
    }

    public boolean checkColumnWin() {
        for (int c =  0; c < 3; c++){
            if ((board[0][c] == playerMark) && (board[1][c] == playerMark) && (board[2][c] == playerMark))
                return true;
        }
        return false;
    }

    public boolean checkDiagonalsWin() {
        return ((board[0][0] == playerMark) && (board[1][1] == playerMark) && (board[2][2] == playerMark)) ||
                ((board[0][2] == playerMark) && (board[1][1] == playerMark) && (board[2][0] == playerMark));
    }

    public boolean computerPlaceMove() {
        for (int r = 0; r < 3; r++){
            for (int c = 0; c < 3; c++){
                if(board[r][c] == emptyBoardMark){
                    board[r][c] =  computerMark;
                    return true;
                }
            }
        }
        return false;
    }
}
