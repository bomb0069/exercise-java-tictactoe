public class TicTacToe {
    public static final int NOT_FINISHED = 0;
    public static final int WIN_BY_O = 1;
    public static final int WIN_BY_X = 2;
    private static final int O_PLAYER = 1;
    private static final int X_PLAYER = 2;

    int[][] board = new int[3][3];

    boolean turn_of_O = true;

    public int getStatus() {

        if (board[0][0] == 2 && board[0][1] == 2 && board[0][2] == 2)
            return 2;

        if (board[0][0] == 1 && board[0][1] == 1 && board[0][2] == 1)
            return 1;

        return 0;
    }

    public void play(int coordinateX, int coordinateY) {
        int player = 0;
        if (turn_of_O)
            player = O_PLAYER;
        else
            player = X_PLAYER;

        board[coordinateX][coordinateY] = player;
        turn_of_O = !turn_of_O;
    }
}
