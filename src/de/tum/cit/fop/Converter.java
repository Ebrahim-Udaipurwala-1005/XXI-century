package de.tum.cit.fop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Converter {
    private static final List<Integer> decimalNumbers = new ArrayList<>(Arrays.asList(
            1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000
    ));
    private static final List<String> romans = new ArrayList<>(Arrays.asList(
            "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"
    ));

    private Converter(){
    }

    public static int convertToInt(String roman){
        // TODO : write your solution here
        int total = 0;
        int i = 0;

        while (i < roman.length()){
            if (i + 1 < roman.length() && romans.contains(roman.substring(i, i + 2))){
                total += decimalNumbers.get(romans.indexOf(roman.substring(i, i + 2)));
                i += 2;
            }
            else {
                total += decimalNumbers.get(romans.indexOf(roman.substring(i, i + 1)));
                i += 1;
            }
        }

        return total;
    }

    public static String convertToRoman(int number){
        // TODO : write your solution here
        StringBuilder roman = new StringBuilder();

        for (int i = decimalNumbers.size() - 1; i >= 0; i--){
            while (number >= decimalNumbers.get(i)){
                number -= decimalNumbers.get(i);
                roman.append(romans.get(i));
            }
        }
        return roman.toString();
    }
}
