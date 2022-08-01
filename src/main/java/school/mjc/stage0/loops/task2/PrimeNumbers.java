package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int i = 1;
        int j = 1;
        int counterPrime = 0;
        while (i <= printToInclusive){
            while (j <= i){
                if (i % j == 0){
                    counterPrime++;
                }
                j++;
            }
            if (counterPrime == 2)
                System.out.println(i);
            counterPrime = 0;
            j = 1;
            i++;
        }
    }
}
