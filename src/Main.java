public class Main {
    public static void main(String[] args) {

        int N = 10;
        System.out.println(nthTerm(N));
    }


    static int nthTerm(int N) {

        for (int i = 0; i <= N; i++) {
            if (isPrime(N + i) || isPrime(N - i))

                return i;

        }
        return 2 - N;

//        int x = N;
//        int y = N;
//        while (x > 1) {
//            if (isPrime(x))
//                break;
//            x--;
//        }
//        while (!isPrime(y)) {
//            y++;
//        }
//
//        if (!isPrime(x))
//            return y - N;
//        if (!isPrime(y))
//            return N - x;
//
//        return Math.min((N - x), (y - N));
    }

    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

}