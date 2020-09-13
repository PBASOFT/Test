package convert;

public class RomanNumeralConverter {
    public String toRomanNumeral(int i) {
        StringBuilder out = new StringBuilder();

        if (i > 3999) return null;

        while (i >= 1000)
        {
            out.append("M");
            i -= 1000;
        }

        while (i >= 900)
        {
            out.append("CM");
            i -= 900;
        }

        while (i >= 500)
        {
            out.append("D");
            i -= 500;
        }

        while (i >= 400)
        {
            out.append("CD");
            i -= 400;
        }

        while (i >= 100)
        {
            out.append("C");
            i -= 100;
        }

        while (i >= 90)
        {
            out.append("XC");
            i -= 90;
        }

        while (i >= 50)
        {
           out.append("L");
           i -= 50;
        }

        while (i >= 40)
        {
            out.append("XL");
            i -= 40;

        }
        while (i >= 10)
        {
            out.append("X");
            i -= 10;
        }

        if (i % 10 == 1){
            out.append("I");
            i -= 1;
        }

        if (i == 9){
            out.append("IX");
            i -=9;
        }

        if (i % 5 >= 4) {
            out.append("IV");
            i -= 4;
        }

        if (i >= 5) {
            out.append("V");
            i -= 5;
        }


        while (i-- > 0)
            out.append("I");


        return out.toString();
    }
}
