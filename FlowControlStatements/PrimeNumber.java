public class PrimeNumber {

    public static void main(String[] args) {

        int num = Integer.parseInt(args[0]);

        if (num <= 1) {
            System.out.println(num + " is neither prime nor composite");
            return;
        }

        boolean prime = true;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                prime = false;
                break;
            }
        }

        if (prime)
            System.out.println(num + " is a Prime Number");
        else
            System.out.println(num + " is not a Prime Number");
    }
}