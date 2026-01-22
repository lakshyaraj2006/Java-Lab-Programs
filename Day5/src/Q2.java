import java.util.Scanner;

public class Q2 {

    public static String swapCase() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.nextLine();
        String result = "";
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) result += Character.toLowerCase(c);
            else if (Character.isLowerCase(c)) result += Character.toUpperCase(c);
            else result += c;
        }
        System.out.println("Output: The string after changing the case is " + result);
        return result;
    }

    public static String reverse() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a String : ");
        String str = sc.nextLine();
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) reversed += str.charAt(i);
        System.out.println("Output: The string after reversing is " + reversed);
        return reversed;
    }

    public static void compareStrings() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the second string for comparision : ");
        String str2 = sc.nextLine();
        String str1 = "amit"; // Assuming str1 from previous input
        int diff = 0;
        int minLen = Math.min(str1.length(), str2.length());
        for (int i = 0; i < minLen; i++) diff += Math.abs(str1.charAt(i) - str2.charAt(i));
        System.out.println("Output: The difference between ASCII value is " + diff);
    }

    public static void insertString() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the string to be inserted into first string : ");
        String str2 = sc.nextLine();
        String str1 = "amit"; // Assuming str1 from previous input
        String result = str1 + " " + str2;
        System.out.println("Output: The string after insertion is : " + result);
    }

    public static void printCases() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a String : ");
        String str = sc.nextLine();
        System.out.println("Output: Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
    }

    public static void checkCharPositions() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a String : ");
        String str = sc.nextLine();
        System.out.print("Enter a character : ");
        char ch = sc.next().charAt(0);
        boolean found = false;
        System.out.print("Output: Position of entered character: ");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                System.out.println(i);
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Entered character is not present");
    }

    public static void isPalindrome() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a String : ");
        String str = sc.nextLine();
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = "";
        for (int i = cleaned.length() - 1; i >= 0; i--) reversed += cleaned.charAt(i);
        if (cleaned.equals(reversed)) System.out.println("Output: Entered string is palindrome");
        else System.out.println("Output: Entered string is not a palindrome");
    }

    public static void countWordsVowelsConsonants() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a String : ");
        String str = sc.nextLine();
        String[] words = str.trim().split("\\s+");
        int vowels = 0, consonants = 0;
        for (char c : str.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if ("aeiou".indexOf(c) != -1) vowels++;
                else consonants++;
            }
        }
        System.out.println("Output: No. of words: " + words.length);
        System.out.println("No. of vowels: " + vowels);
        System.out.println("No. of consonants: " + consonants);
    }

    public static void main(String[] args) {
        swapCase();
        reverse();
        compareStrings();
        insertString();
        printCases();
        checkCharPositions();
        isPalindrome();
        countWordsVowelsConsonants();
    }
}
