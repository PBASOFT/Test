package convert;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.testng.ITest;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ToRomanNumeralTest {

    private RomanNumeralConverter converter;

    @BeforeAll
    public void setup(){
        converter = new RomanNumeralConverter();
    }

    @Test
    public void converterMustNotBeNull(){
        converter = new RomanNumeralConverter();

        Assertions.assertNotNull(converter);
    }

    @Test
    public void converterMustNotBeMoreThan3999(){
        //Arrange
        converter = new RomanNumeralConverter();

        //Act
        String result = converter.toRomanNumeral(4000);

        //Assert
        assertEquals(null, result );
    }

    @Test
    public void mustConvert1ToI(){
        //Arrange
        converter = new RomanNumeralConverter();

        //Act
        String result = converter.toRomanNumeral(1);

        //Assert
        assertEquals("I", result );
    }

    @Test
    public void mustConvert2ToII() {
        //Arrange
        var expected = "II";
        
        //Act
        var result = converter.toRomanNumeral(2);
        
        //Assert
        assertEquals("II", result);
    }

    @Test
    public void mustConvert3ToIII() {
        //Arrange
        var expected = "III";

        //Act
        var result = converter.toRomanNumeral(3);

        //Assert
        assertEquals(expected, result);

    }

    @Test
    public void mustConvert4ToIIII() {
        //Arrange
        var expected = "IV";

        //Act
        var result = converter.toRomanNumeral(4);

        //Assert
        assertEquals(expected, result);

    }

    @Test
    public void mustConvert5ToV() {
        //Arrange
        var expected = "V";

        //Act
        var result = converter.toRomanNumeral(5);

        //Assert
        assertEquals(expected, result);

    }

    @Test
    public void mustConvert6ToVI() {
        //Arrange
        var expected = "VI";

        //Act
        var result = converter.toRomanNumeral(6);

        //Assert
        assertEquals(expected, result);

    }

    @Test
    public void mustConvert7ToVII() {
        //Arrange
        var expected = "VII";

        //Act
        var result = converter.toRomanNumeral(7);

        //Assert
        assertEquals(expected, result);

    }

    @Test
    public void mustConvert9ToIX() {
        //Arrange
        var expected = "IX";

        //Act
        var result = converter.toRomanNumeral(9);

        //Assert
        assertEquals(expected, result);

    }


    @Test
    public void mustConvert10ToX() {
        //Arrange
        var expected = "X";

        //Act
        var result = converter.toRomanNumeral(10);

        //Assert
        assertEquals(expected, result);

    }
    @Test
    public void mustConvert11ToXI() {
        //Arrange
        var expected = "XI";

        //Act
        var result = converter.toRomanNumeral(11);

        //Assert
        assertEquals(expected, result);

    }

    @Test
    public void mustConvert14ToXIV() {
        //Arrange
        var expected = "XIV";

        //Act
        var result = converter.toRomanNumeral(14);

        //Assert
        assertEquals(expected, result);

    }

    @Test
    public void mustConvert15ToXV() {
        //Arrange
        var expected = "XV";

        //Act
        var result = converter.toRomanNumeral(15);

        //Assert
        assertEquals(expected, result);

    }

    @Test
    public void mustConvert19ToXIX() {
        //Arrange
        var expected = "XIX";

        //Act
        var result = converter.toRomanNumeral(19);

        //Assert
        assertEquals(expected, result);

    }

    @Test
    public void mustConvert20ToXX() {
        //Arrange
        var expected = "XX";

        //Act
        var result = converter.toRomanNumeral(20);

        //Assert
        assertEquals(expected, result);

    }

    @Test
    public void mustConvert29ToXXI() {
        //Arrange
        var expected = "XXIX";

        //Act
        var result = converter.toRomanNumeral(29);

        //Assert
        assertEquals(expected, result);

    }

    @Test
    public void mustConvert30ToXX() {
        //Arrange
        var expected = "XXX";

        //Act
        var result = converter.toRomanNumeral(30);

        //Assert
        assertEquals(expected, result);

    }
    @Test
    public void mustConvert40ToXL() {
        //Arrange
        var expected = "XL";

        //Act
        var result = converter.toRomanNumeral(40);

        //Assert
        assertEquals(expected, result);

    }

    @Test
    public void mustConvert47ToXLVII() {
        //Arrange
        var expected = "XLVII";

        //Act
        var result = converter.toRomanNumeral(47);

        //Assert
        assertEquals(expected, result);

    }

    @Test
    public void mustConvert50ToL() {
        //Arrange
        var expected = "L";

        //Act
        var result = converter.toRomanNumeral(50);

        //Assert
        assertEquals(expected, result);

    }

    @Test
    public void mustConvert60ToLX() {
        //Arrange
        var expected = "LX";

        //Act
        var result = converter.toRomanNumeral(60);

        //Assert
        assertEquals(expected, result);

    }

    @Test
    public void mustConvert80ToLXXX() {
        //Arrange
        var expected = "LXXX";

        //Act
        var result = converter.toRomanNumeral(80);

        //Assert
        assertEquals(expected, result);

    }

    @Test
    public void mustConvert89ToLXXXIX() {
        //Arrange
        var expected = "LXXXIX";

        //Act
        var result = converter.toRomanNumeral(89);

        //Assert
        assertEquals(expected, result);

    }


    @Test
    public void mustConvert90To90() {
        //Arrange
        var expected = "XC";

        //Act
        var result = converter.toRomanNumeral(90);

        //Assert
        assertEquals(expected, result);

    }


    @Test
    public void mustConvert92ToXCII() {
        //Arrange
        var expected = "XCII";

        //Act
        var result = converter.toRomanNumeral(92);

        //Assert
        assertEquals(expected, result);

    }

    @Test
    public void mustConvert100ToC() {
        //Arrange
        var expected = "C";

        //Act
        var result = converter.toRomanNumeral(100);

        //Assert
        assertEquals(expected, result);

    }

    @Test
    public void mustConvert200ToCC() {
        //Arrange
        var expected = "CC";

        //Act
        var result = converter.toRomanNumeral(200);

        //Assert
        assertEquals(expected, result);

    }

    @Test
    public void mustConvert300ToC() {
        //Arrange
        var expected = "CCC";

        //Act
        var result = converter.toRomanNumeral(300);

        //Assert
        assertEquals(expected, result);

    }

    @Test
    public void mustConvert400ToC() {
        //Arrange
        var expected = "CD";

        //Act
        var result = converter.toRomanNumeral(400);

        //Assert
        assertEquals(expected, result);

    }

    @Test
    public void mustConvert500ToC() {
        //Arrange
        var expected = "D";

        //Act
        var result = converter.toRomanNumeral(500);

        //Assert
        assertEquals(expected, result);

    }

    @Test
    public void mustConvert800ToC() {
        //Arrange
        var expected = "DCCC";

        //Act
        var result = converter.toRomanNumeral(800);

        //Assert
        assertEquals(expected, result);

    }

    @Test
    public void mustConvert900ToC() {
        //Arrange
        var expected = "CM";

        //Act
        var result = converter.toRomanNumeral(900);

        //Assert
        assertEquals(expected, result);

    }

    @Test
    public void mustConvert1000ToC() {
        //Arrange
        var expected = "M";

        //Act
        var result = converter.toRomanNumeral(1000);

        //Assert
        assertEquals(expected, result);

    }


    @Test
    public void mustConvert3000ToC() {
        //Arrange
        var expected = "MMM";

        //Act
        var result = converter.toRomanNumeral(3000);

        //Assert
        assertEquals(expected, result);

    }


    @Test
    public void mustConvert3999ToC() {
        //Arrange
        var expected = "MMMCMXCIX";

        //Act
        var result = converter.toRomanNumeral(3999);

        //Assert
        assertEquals(expected, result);

    }


}
