public class Primes {
    public static void main(String[] args) {
        int primesCount = 0;
        int n = Integer.parseInt(args[0]);
        boolean[] isPrime = new boolean[n + 1];

        for(int i = 2; i < isPrime.length; i++){ // setting the arr
            isPrime[i] = true;
        }

        int p =2;
        while(p <= Math.sqrt(n)){ //marking all non-prime nums
            for(int i = p + 1; i < isPrime.length; i++){
                if(i % p == 0){
                    isPrime[i] = false;
                }
            }
            p++;
        }

        for(int i = 2; i < isPrime.length; i++){ //counting all prime nums
            if(isPrime[i] == true){
                primesCount++;
            }
        }
        int precentage = (primesCount * 100) / n;
        System.out.println("Prime numbers up to " + n + " : There are " + primesCount + " primes between 2 and " + n + " (" + precentage + "% are primes)");
    }
}