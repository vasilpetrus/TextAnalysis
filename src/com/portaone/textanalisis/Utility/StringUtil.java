package com.portaone.textanalisis.Utility;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringUtil {
    public static List<String> splitTextIntoWords(String inputText) {
        return Arrays.asList(inputText.split("\\s+"));
    }

    public static String findFirstUniqueCharacter(String inputText) {
        List<String> words = splitTextIntoWords(inputText);
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (String word : words) {
            char[] characters = word.toCharArray();
            for (char c : characters) {
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }
        }

        for (String word : words) {
            char[] characters = word.toCharArray();
            for (char c : characters) {
                if (charCountMap.get(c) == 1) {
                    return String.valueOf(c);
                }
            }
        }

        return "";
    }
}