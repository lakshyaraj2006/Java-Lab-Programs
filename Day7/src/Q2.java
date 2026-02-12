import java.io.*;
import java.util.Scanner;

public class Q2 {
    public static void CopyFileChar(FileReader fr, FileWriter fw) {
        try {
            int c;
            while ((c = fr.read()) != -1) {
                fw.write(c);
            }

            fw.close();
            fr.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }

    public static void CopyFileByte(FileInputStream fis, FileOutputStream fos) {
        try {
            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }

            fis.close();
            fos.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter source file name: ");
        String source = sc.nextLine();
        source = "Day7/src/" + source;

        System.out.print("Enter destination file name: ");
        String dest = sc.nextLine();
        dest = "Day7/src/" + dest;

        try {
//        1. Using Character Stream
//            FileReader fr = new FileReader(source);
//            FileWriter fw = new FileWriter(dest);
//
//            CopyFileChar(fr, fw);

//            1. Using Character Stream
            FileInputStream fis = new FileInputStream(source);
            FileOutputStream fos = new FileOutputStream(dest);

            CopyFileByte(fis, fos);

        } catch (IOException e) {
            System.out.println(e.toString());
        }

    }
}
