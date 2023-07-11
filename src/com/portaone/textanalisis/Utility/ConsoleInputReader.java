package com.portaone.textanalisis.Utility;


import java.util.Scanner;

public class ConsoleInputReader {
    public static String readInputText() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text: ");
        return scanner.nextLine();
    }
}
