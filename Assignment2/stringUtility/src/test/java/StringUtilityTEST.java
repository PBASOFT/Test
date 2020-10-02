import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class StringUtilityTEST {
    private static StringUtility stringUtility;

    @BeforeAll
    private static void setup(){
        stringUtility = new StringUtility();
    }

    @Test
    public void stringUtilityMustNotBeNull(){
        assertNotNull(stringUtility);
    }


    @Test
    public void mustReverseString() {
        //Arrange
        String expected = "cBa";

        //Act
        String result = stringUtility.reverseString("aBc");

        //Assert
        assertEquals(expected, result);
    }

    @Test
    public void mustReturnErrorMessageWhenStringToReverseNotOnlyContainsLetters() {
        //Arrange
        String expected = "String must contain letters only";
        
        //Act
        String result = stringUtility.reverseString("number1");
        
        //Assert
        assertEquals(expected, result);
    }


    @Test
    public void mustReturnErrorMessageWhenStringToReverseIsEmpty() {
        //Arrange
        String expected = "String is empty";

        //Act
        String result = stringUtility.reverseString("");

        //Assert
        assertEquals(expected, result);
    }


    @Test
    public void mustCapitalizeString() {
        //Arrange
        String expected = "ABC";

        //Act
        String result = stringUtility.capitalizeString("aBc");

        //Assert
        assertEquals(expected, result);
    }


    @Test
    public void mustReturnErrorMessageWhenStringToCapitalizeNotOnlyContainsLetters() {
        //Arrange
        String expected = "String must contain letters only";

        //Act
        String result = stringUtility.capitalizeString("number1");

        //Assert
        assertEquals(expected, result);
    }


    @Test
    public void mustReturnErrorMessageWhenStringToCapitalizeIsEmpty() {
        //Arrange
        String expected = "String is empty";

        //Act
        var result = stringUtility.capitalizeString("");

        //Assert
        assertEquals(expected, result);
    }


    @Test
    public void mustLowercaseString() {
        //Arrange
        String expected = "abc";

        //Act
        String result = stringUtility.lowercaseString("aBc");

        //Assert
        assertEquals(expected, result);
    }


    @Test
    public void mustReturnErrorMessageWhenStringToLowercaseNotOnlyContainsLetters() {
        //Arrange
        String expected = "String must contain letters only";

        //Act
        String result = stringUtility.lowercaseString("number#");

        //Assert
        assertEquals(expected, result);
    }


    @Test
    public void mustReturnErrorMessageWhenStringToLowercaseIsEmpty() {
        //Arrange
        String expected = "String is empty";

        //Act
        var result = stringUtility.lowercaseString("");

        //Assert
        assertEquals(expected, result);
    }
}
