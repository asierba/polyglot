package roman_numerals;

import java.util.LinkedHashMap;
import java.util.Map;

public class Roman {
    private static Map<String, Integer> romanToNumeral = CreateLinkedMap();

    private static Map<String, Integer> CreateLinkedMap() {
        var result = new LinkedHashMap<String, Integer>();
        result.put("M", 1000);
        result.put("CM", 900);
        result.put("D", 500);
        result.put("CD", 400);
        result.put("C", 100);
        result.put("XC", 90);
        result.put("L", 50);
        result.put("XL", 40);
        result.put("X", 10);
        result.put("IX", 9);
        result.put("V", 5);
        result.put("IV", 4);
        result.put("I", 1);
        return result;
    }


    public static String of(int arabic) {
        var result = "";

        for (var entry : romanToNumeral.entrySet()) {
            var key = entry.getKey();
            var value = entry.getValue();

            while (arabic >= value) {
                result += key;
                arabic -= value;
            }

        }

        return result;
    }
}
