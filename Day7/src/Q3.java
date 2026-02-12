import java.io.FileInputStream;
import java.io.IOException;

public class Q3 {
    public static void main(String[] args) {
        String file1 = "Day7/src/file1.bin";
        String file2 = "Day7/src/file2.bin";

        try (FileInputStream fis1 = new FileInputStream(file1);
             FileInputStream fis2 = new FileInputStream(file2)) {

            int pos = 0;
            int b1, b2;
            boolean equal = true;

            while ((b1 = fis1.read()) != -1 & (b2 = fis2.read()) != -1) {
                pos++;
                if (b1 != b2) {
                    equal = false;
                    System.out.println("Files differ at byte position: " + pos);
                    break;
                }
            }

            if (equal && (fis1.read() == -1 && fis2.read() == -1)) {
                System.out.println("Two files are equal.");
            } else if (equal) {
                System.out.println("Files differ in length.");
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
