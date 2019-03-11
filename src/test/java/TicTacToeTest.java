import org.junit.Assert;
import org.junit.Test;

public class TicTacToeTest {

    @Test
    public void new_game_should_status_not_finished_game () {
        TicTacToe game = new TicTacToe();
        int actualStatus = game.getStatus();
        Assert.assertEquals(game.NOT_FINISHED, actualStatus);
    }
}
