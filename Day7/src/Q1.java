import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Q1 {
    public static void main(String[] args) throws IOException {
        try {
            FileWriter writer = new FileWriter("Day7/src/student.txt");
            Scanner sc = new Scanner(System.in);

            int rollno;
            String name;
            String subject;
            float marks;

            System.out.print("Enter student roll no: ");
            rollno = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter student name: ");
            name = sc.nextLine();

            System.out.print("Enter subject: ");
            subject = sc.next();

            System.out.print("Enter student marks: ");
            marks = sc.nextFloat();

            writer.write("Roll No: " + rollno + "\n");
            writer.write("Name: " + name + "\n");
            writer.write("Subject: " + subject + "\n");
            writer.write("Marks: " + marks + "\n");

            writer.close();
            sc.close();

            System.out.println("Student data saved successfully.");

            File file = new File("student.txt");
            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();

        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
