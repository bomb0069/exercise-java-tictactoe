import org.junit.Assert;
import org.junit.Test;

public class TicTacToeTest {

    @Test
    public void new_game_should_status_not_finished_game () {
        TicTacToe game = new TicTacToe();
        int actualStatus = game.getStatus();
        Assert.assertEquals(game.NOT_FINISHED, actualStatus);
    }

    @Test
    public void only_one_turn_with_0_0_should_status_not_finished_game () {
        TicTacToe game = new TicTacToe();
        game.play(0,0);
        int actualStatus = game.getStatus();
        Assert.assertEquals(game.NOT_FINISHED, actualStatus);
    }

    @Test
    public void all_of_first_row_with_O_should_status_win_by_O () {
        TicTacToe game = new TicTacToe();
        game.play(0,0);
        game.play(1,0);
        game.play(0,1);
        game.play(1,1);
        game.play(0,2);
        int actualStatus = game.getStatus();
        Assert.assertEquals(game.WIN_BY_O, actualStatus);
    }

    @Test
    public void all_of_first_row_with_X_should_status_win_by_X () {
        TicTacToe game = new TicTacToe();
        game.play(1,0);
        game.play(0,0);
        game.play(1,1);
        game.play(0,1);
        game.play(2,0);
        game.play(0,2);
        int actualStatus = game.getStatus();
        Assert.assertEquals(game.WIN_BY_X, actualStatus);
    }

}
