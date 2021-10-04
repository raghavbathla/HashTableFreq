package freuencyOfWords;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Enter a sentence");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        FrequencyOfWords.countFrequency(sentence);
    }
}
