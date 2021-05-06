package PrimeNumbers;

public class Main {
    public static void main(String[] args) {
        long upTo = Long.parseLong("1000000");
        PrimeList list = new PrimeList();
        for (long i = 1; i < upTo; i++) {
            Thread thrd = new PrimeChecker(i, list);
            thrd.start();
        }
        PrimeList.printList();
    }
}
