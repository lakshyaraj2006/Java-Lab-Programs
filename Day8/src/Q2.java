class Display {
    synchronized void print(String threadName) {
        String words[] = {"I", "Love", "Java", "Very", "Much"};

        for (String w : words) {
            System.out.println(threadName + ": " + w);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class MyThread extends Thread {
    Display d;

    MyThread(Display d, String name) {
        this.d = d;
        setName(name);
    }

    public void run() {
        d.print(getName());
    }
}

public class Q2 {
    public static void main(String[] args) {
        Display obj = new Display();

        MyThread t1 = new MyThread(obj, "Thread 1");
        MyThread t2 = new MyThread(obj, "Thread 2");

        t1.start();
        t2.start();
    }
}