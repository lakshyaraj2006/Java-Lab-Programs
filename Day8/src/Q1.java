import java.util.Scanner;

class CounterThread extends Thread {
    int start, end;

    CounterThread(String name, int start, int end) {
        super(name);
        this.start = start;
        this.end = end;
    }

    public void run() {
        try {
            System.out.println("Thread - " + Thread.currentThread().getName());
            System.out.print("Counter - ");
            for (int i = start; i<=end; i++) {
                System.out.print(i + " ");
                Thread.sleep(5);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Name of the thread - ");
        String tname = sc.nextLine();

        System.out.print("Lower range of counter - ");
        int start = sc.nextInt();

        System.out.print("Upper range of counter - ");
        int end = sc.nextInt();

        CounterThread ct = new CounterThread(tname, start, end);
        ct.start();
    }
}
