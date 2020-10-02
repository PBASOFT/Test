

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class BowlingGameTest {
    private Game g;



    @BeforeEach
    protected void setup(){
        g = new Game();
    }

    private void rollMany(int n, int pins){
        for (int i = 0; i < n; i++){
            g.roll(pins);
        }
    }

    @Test
    public void testGutterGame() {
        //Arrange
        rollMany(20, 0);

        int expected = 0;

        //Act
        var result = g.score();

        //Assert
        assertEquals(expected, result);


    }

    @Test
    public void testAllOnes() {
        //Arrange
        rollMany(20, 1);

        int expected = 20;
        
        //Act
        int result = g.score();
        
        //Assert
        assertEquals(expected, result);
    
    }

    @Test
    public void testOneSpare() {
        //Arrange
        rollSpare();
        g.roll(3);
        rollMany(17, 0);

        var expected = 16;

        //Act
        var result = g.score() ;

        //Assert
        assertEquals(expected, result);

    }

    @Test
    public void testOneStrike() {
        //Arrange
        rollStrike();
        g.roll(3);
        g.roll(4);
        rollMany(16, 0);

        var expected = 24;

        //Act
        var result = g.score() ;

        //Assert
        assertEquals(expected, result);

    }

    @Test
    public void testPerfectGame() {
        //Arrange
        rollMany(12, 10);

        var expected = 300;

        //Act
        var result = g.score() ;

        //Assert
        assertEquals(expected, result);

    }

    private void rollSpare(){
        g.roll(5);
        g.roll(5);
    }

    private void rollStrike(){
        g.roll(10);
    }
}
