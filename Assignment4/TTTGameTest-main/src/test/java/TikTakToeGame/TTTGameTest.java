package TikTakToeGame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TTTGameTest {
    private TTTGame tttGame;
    @BeforeEach
    void setup(){
        tttGame = new TTTGame();
    }

    @Test
    void gameBoardRowMustBe3(){
        assertEquals(tttGame.getBoard()[0].length, 3);
    }
    @Test
    void gameBoardColumnMustBe3(){
        assertEquals(tttGame.getBoard()[1].length, 3);
    }
    @Test
    void boardMustBeEmpty(){
        assertFalse(tttGame.isBoardFull());
    }
    @Test
    void playerMustPlaceCharOnBoard() throws Exception {
        assertTrue(tttGame.placeMove(1, 1));
    }

    @ParameterizedTest
    @ValueSource(ints = {0,1,2})
    void playerMustBeAbleToWinOnColumns(int value) throws Exception {
        tttGame.placeMove(0,value);
        tttGame.placeMove(1,value);
        tttGame.placeMove(2,value);
        tttGame.printGameBoard();
        assertTrue(tttGame.checkColumnWin());
    }

    @ParameterizedTest
    @ValueSource(ints = {0,1,2})
    void playerMustBeAbleToWinOnRows(int value) throws Exception {
        tttGame.placeMove(value,0);
        tttGame.placeMove(value,1);
        tttGame.placeMove(value,2);
        tttGame.printGameBoard();
        assertTrue(tttGame.checkRowWin());
    }

    @Test
    void playerMustBeAbleToWinOnDiagonalsFromUpperLeft() throws Exception {
        tttGame.placeMove(0,0);
        tttGame.placeMove(1,1);
        tttGame.placeMove(2,2);
        tttGame.printGameBoard();
        assertTrue(tttGame.checkDiagonalsWin());
    }

    @Test
    void playerMustBeAbleToWinOnDiagonalsFromLowerLeft() throws Exception {
        tttGame.placeMove(0,2);
        tttGame.placeMove(1,1);
        tttGame.placeMove(2,0);
        tttGame.printGameBoard();
        assertTrue(tttGame.checkDiagonalsWin());
    }

    @Test
    void mustThrowExceptionWhenFieldIsNotEmpty() throws Exception {
        tttGame.placeMove(0,2);
        Exception fieldNotEmptyException = assertThrows(Exception.class, ()->tttGame.placeMove(0,2));
        assertTrue(fieldNotEmptyException.getMessage().equals("The field is not empty"));

    }

    @Test
    void computerMustPlaceCircleOnEmptyFieldAfterPlayersTurn(){
        assertTrue(tttGame.computerPlaceMove());
        tttGame.printGameBoard();
    }



}
