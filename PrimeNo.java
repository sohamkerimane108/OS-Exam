public class PrimeNo {

    public static void main(String[] args) {
        // Counter for the number of prime numbers found
        int count = 0;   
        // Start checking for prime numbers from 2
        int num = 2;     

        while (count < 10) {
            if (isPrime(num)) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        // Numbers less than or equal to 1 are not prime
        if (n <= 1) return false;  
        // Check divisibility up to the square root of n
        for (int i = 2; i <= Math.sqrt(n); i++) {  
            // If divisible, n is not prime
            if (n % i == 0) return false;  
        }
        // If no divisors found, n is prime
        return true;  
    }
}
