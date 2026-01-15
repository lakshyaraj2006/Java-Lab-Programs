interface Motor {
    int capacity = 7;

    default void run() {};
    default void consume() {};
}

class WashingMachine implements Motor {
    @Override
    public void run() {
        System.out.println("Washing machine is running");
    }

    @Override
    public void consume() {
        System.out.println("Washing machine is consuming electricity");
    }
}

public class Q2 {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();

        wm.run();
        wm.consume();

        System.out.println("Motor capacity: " + wm.capacity + " kg");
    }
}
