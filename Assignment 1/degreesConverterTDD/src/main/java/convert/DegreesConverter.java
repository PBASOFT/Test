package convert;


public class DegreesConverter {


    public double toCelsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;

    }

    public double toFahrenheit(double celcius) {
        return celcius * 1.8 + 32;
    }
}
