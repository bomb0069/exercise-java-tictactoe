public class TicTacToe {
    public static final int NOT_FINISHED = 0;
    public static final int WIN_BY_O = 1;

    int[][] board = new int[3][3];

    public int getStatus() {
        if (board[0][0] == 1 && board[0][1] == 1 && board[0][2] == 1)
            return 1;
        return 0;
    }

    public void play(int coordinateX, int coordinateY) {
        board[coordinateX][coordinateY] = 1;
    }
}
