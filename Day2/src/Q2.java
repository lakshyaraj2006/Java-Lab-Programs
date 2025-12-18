class MyObject {
    static int count = 0;

    public MyObject() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}

public class Q2 {
    public static void main(String[] args) {
        MyObject obj1 = new MyObject();
        MyObject obj2 = new MyObject();
        MyObject obj3 = new MyObject();

        System.out.printf("Number of objects created: %d\n", MyObject.getCount());
    }
}
