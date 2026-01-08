class Apple {
    public void show() {
        System.out.println("I am class Apple");
    }
}

class Banana extends Apple {
    @Override
    public void show() {
        System.out.println("I am class Banana");
    }

    public void test() {}
}

class Cherry extends Apple {
    @Override
    public void show() {
        System.out.println("I am class Cherry");
    }
}

public class Q3 {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.show();

        Apple banana = new Banana();
        banana.show();

        Apple cherry = new Cherry();
        cherry.show();
    }
}
