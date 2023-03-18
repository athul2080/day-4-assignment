public class PrimeNumbers {

    public static void main(String[] args) {

        int i = 2;

        System.out.println("Prime numbers between 1 and 100 are:");

        while (i <= 100) {

            boolean isPrime = true;
            int j = 2;
            while (j <= i/2) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
                j++;
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
