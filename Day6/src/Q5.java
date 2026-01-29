class CheckArgument extends Exception {
    public CheckArgument(String message) {
        super(message);
    }
}

public class Q5 {
    public static void main(String[] args) throws CheckArgument {
        if (args.length >= 4) {
            int sum = 0;
            for (int i = 0; i < args.length; i++) {
                sum += (int) Math.pow(Integer.parseInt(args[i]), 2);
            }
            System.out.println(sum);
        } else {
            throw new CheckArgument("No. of arguments must be >= 4");
        }
    }
}
