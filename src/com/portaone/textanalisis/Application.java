package com.portaone.textanalisis;

import com.portaone.textanalisis.Utility.ConsoleInputReader;
import com.portaone.textanalisis.Utility.StringUtil;

public class Application {

    public static void main(String[] args) {
        String inputText = ConsoleInputReader.readInputText();
        String firstUniqueChar = StringUtil.findFirstUniqueCharacter(inputText);
        System.out.println("First unique character: " + firstUniqueChar);
    }
}
