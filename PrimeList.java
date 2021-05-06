package PrimeNumbers;

import java.util.ArrayList;
import java.util.List;

public class PrimeList extends Result {

    private static List<Long> primeList = new ArrayList<Long>();

    @Override
    void addResult(long toAdd) {
        primeList.add(toAdd);

    }

    public List<Long> getPrimeList() {
        return primeList;
    }

    public static void printList() {
        primeList.forEach(a -> {
            System.out.println(a);
        });
    }

}
