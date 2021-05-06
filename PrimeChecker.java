package PrimeNumbers;

/**
 * PrimeChecker
 */
public class PrimeChecker extends Thread {
    long toCheck = 0;
    Result res;

    PrimeChecker(long toCheck, Result res) {
        this.toCheck = toCheck;
        this.res = res;
    }

    @Override
    public void run() {
        for (long i = 2; i < toCheck; i++) {
            if (toCheck % i == 0) {
                return;
            }
        }
        // System.out.println(toCheck);
        res.addResult(toCheck);
    }

}