package convert;

public class RomanNumeralConverter {

    public String toRomanNumeral(int i) {
        StringBuilder out = new StringBuilder();
    String o;
        if (i > 3999) return null;

        i = adjust(i, out, 1000, "M");

        i = adjust(i, out, 900, "CM");

        i = adjust(i, out, 500, "D");

        i = adjust(i, out, 400, "CD");

        i = adjust(i, out, 100, "C");

        i = adjust(i, out, 90, "XC");

        i = adjust(i, out, 1000, "M");

        i = adjust(i, out, 50, "L");

        i = adjust(i, out, 40, "XL");

        i = adjust(i, out, 10, "X");




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



    private int adjust(int i, StringBuilder out, int limit, String roman) {
        while (i >= limit)
        {
            out.append(roman);
            i -= limit;
        }
        return i;
    }
}
