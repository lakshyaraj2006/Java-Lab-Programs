import java.io.*;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String filename = sc.nextLine();
        filename = "Day7/src/" + filename;

        int charCount = 0, wordCount = 0, lineCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                lineCount++;
                charCount += line.length();
                wordCount += line.split("\\s+").length;
            }

            System.out.println("No. of characters: " + charCount);
            System.out.println("No. of words: " + wordCount);
            System.out.println("No. of lines: " + lineCount);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
