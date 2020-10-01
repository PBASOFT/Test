package convert;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class DegreesTest {
    private DegreesConverter converter;

    @BeforeAll
    public void setup(){
        converter = new DegreesConverter();
    }


    @Test
    public void converterToCelsiusMustNotBeNull(){

        assertNotNull(converter);
    }
    


    @Test
    public void mustConvert120FahrenheitTo48_89Celsius() {
        //Arrange
        double expected = 48.89;

        //Act
        double result = converter.toCelsius(120);

        //Assert
        assertEquals(expected, result, 0.1);
    }

    @Test
    public void mustConvert0FahrenheitTo_17_78Celsius() {
        //Arrange
        double expected = -17.78;

        //Act
        double result = converter.toCelsius(0
        );

        //Assert
        assertEquals(expected, result, 0.1);
    }


    @Test
    public void mustConvert32CelsiusTo0Fahrenheit() {
        //Arrange
        double expected = 32;

        //Act
        double result = converter.toFahrenheit(0);

        //Assert
        assertEquals(expected, result, 0.1);

    }

    @Test
    public void mustConvert44CelsiusTo111_2Fahrenheit() {
        //Arrange
        double expected = 111.2;

        //Act
        double result = converter.toFahrenheit(44);

        //Assert
        assertEquals(expected, result, 0.1);

    }

}
