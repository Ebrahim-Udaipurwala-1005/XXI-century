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
        return 0;
    }

    public static String convertToRoman(int number){
        // TODO : write your solution here
        return "";
    }
}
